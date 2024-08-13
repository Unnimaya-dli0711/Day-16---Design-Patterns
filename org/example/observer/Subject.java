package org.example.observer;

import java.util.List;
import java.util.Observer;

public interface Subject {
    void attach(ObserverInterface o);
    void detach(ObserverInterface o);
    void notifyObservers();
}

