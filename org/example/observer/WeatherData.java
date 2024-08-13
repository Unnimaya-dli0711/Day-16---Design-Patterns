package org.example.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WeatherData implements Subject{
    private List<ObserverInterface> observerList;
    private float temperature;
    private float humidity;

    public WeatherData(){
        observerList=new ArrayList<>();
    }
    @Override
    public void attach(ObserverInterface o){
        observerList.add(o);
    }
    @Override
    public void detach(ObserverInterface o){
        observerList.remove(o);
    }
    @Override
    public void notifyObservers()
    {
        for(ObserverInterface o:observerList)
        {
            o.update(temperature,humidity);
        }
    }
    public void setWeather(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        notifyObservers();
    }
}
