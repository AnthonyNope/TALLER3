package edu.unisabana.dyas.patterns.observer.impl.observers;

import java.util.Date;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.IObserver;

/**
 * @author cesarvefe
 
 */
public class DateFormatObserver implements IObserver {
    @Override
    public void notifyObserver(String command, Object source) {
        if ("defaultDateFormat".equals(command)) {
            ConfigurationManager config = (ConfigurationManager) source;
            System.out.println("Fecha cambio, nuevo formato: " + config.getDefaultDateFormat().toPattern());
        }
    }
}