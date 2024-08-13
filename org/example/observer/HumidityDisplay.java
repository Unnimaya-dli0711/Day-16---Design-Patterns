package org.example.observer;

public class HumidityDisplay implements ObserverInterface {
    private float humidity;
    @Override
    public void update(float temperature,float humidity){
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("current temperature : "+humidity+" %");
    }
}
