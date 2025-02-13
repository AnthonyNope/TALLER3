package edu.unisabana.dyas.patterns.observer.impl;

/**
 * @author cesarvefe
 
 */
public interface IObservable {
    
    void notifyAllObservers(String command, Object source);
    
    void addObserver(IObserver observer);
    
    void removeObserver(IObserver observer);
    
}