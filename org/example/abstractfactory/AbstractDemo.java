package org.example.abstractfactory;

public class AbstractDemo {
    private Button button;
    private TextField textField;

    public AbstractDemo(UIFactory uiFactory){
        button=uiFactory.createButton();
        textField=uiFactory.createTextField();
    }
    public void render(){
        button.render();
        textField.render();
    }

    public static void main(String[] args) {
        UIFactory lightFactory=new LightTheme();
        AbstractDemo lightTheme=new AbstractDemo(lightFactory);
        lightTheme.render();

        UIFactory darkFactory=new DarkTheme();
        AbstractDemo darkTheme=new AbstractDemo(darkFactory);
        darkTheme.render();
    }
}
