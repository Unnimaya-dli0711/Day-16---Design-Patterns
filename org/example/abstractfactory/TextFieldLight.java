package org.example.abstractfactory;

public class TextFieldLight implements TextField{
    @Override
    public void render(){
        System.out.println("Text Field in light theme");
    }

}
