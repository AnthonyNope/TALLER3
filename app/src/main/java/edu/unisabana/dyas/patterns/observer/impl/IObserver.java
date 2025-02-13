package edu.unisabana.dyas.patterns.observer.impl;

/**
 * @author cesarvefe
 
 */
public interface IObserver {
    
    void notifyObserver(String command, Object source);
}