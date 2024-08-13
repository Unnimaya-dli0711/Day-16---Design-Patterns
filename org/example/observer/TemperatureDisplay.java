package org.example.observer;

public class TemperatureDisplay implements ObserverInterface {
    private float temperature;
    @Override
    public void update(float temperature,float humidity){
        this.temperature=temperature;
        display();
    }
    public void display(){
        System.out.println("current temperature : "+temperature+" c");
    }
}
