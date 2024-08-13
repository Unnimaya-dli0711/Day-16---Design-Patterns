package org.example.abstractfactory;

public class ButtonDark implements Button{
    @Override
    public void render(){
        System.out.println("Button in dark theme");
    }
}
