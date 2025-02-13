package edu.unisabana.dyas.patterns.observer.impl;

import edu.unisabana.dyas.patterns.observer.impl.IObservable;
import edu.unisabana.dyas.patterns.observer.impl.IObserver;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractObservable implements IObservable {
    private final List<IObserver> observers = new ArrayList<>();
    
    
    @Override
    public void notifyAllObservers(String command, Object source) {
        if (!observers.isEmpty()) {
            for (IObserver observer : observers) {
                observer.notifyObserver(command, source);
            }
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        if (observer != null && !observers.contains(observer)) { 
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    
}
