package org.example.abstractfactory;

public class ButtonLight implements Button{
    @Override
    public void render(){
        System.out.println("Button in light theme");
    }
}
