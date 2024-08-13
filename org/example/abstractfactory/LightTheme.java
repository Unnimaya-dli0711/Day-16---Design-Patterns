package org.example.abstractfactory;

import org.w3c.dom.Text;

public class LightTheme implements UIFactory{
    @Override
    public Button createButton(){
        return new ButtonLight();
    }
    @Override
    public TextField createTextField(){
        return new TextFieldLight();
    }
}
