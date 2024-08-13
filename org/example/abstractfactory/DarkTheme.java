package org.example.abstractfactory;

public class DarkTheme implements UIFactory{
    @Override
    public Button createButton(){
        return new ButtonDark();
    }
    @Override
    public TextField createTextField(){
        return new TextFieldDark();
    }
}
