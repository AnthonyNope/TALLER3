package edu.unisabana.dyas.patterns.observer.impl.observers;

import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.IObserver;

/**
 * Observer para detectar cambios en el formato de dinero.
 * @author cesarvefe
 */
public class MoneyFormatObserver implements IObserver {
    @Override
    public void notifyObserver(String command, Object source) {
        if (ConfigurationManager.MONEY_FORMAT_CHANGED.equals(command)) {
            ConfigurationManager config = (ConfigurationManager) source;
            System.out.println("Dinero cambio, nuevo formato: " + config.getMoneyFormat().format(1234.56));
        }
    }
}
