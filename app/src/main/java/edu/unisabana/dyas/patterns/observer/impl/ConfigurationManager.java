package edu.unisabana.dyas.patterns.observer.impl;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;

public class ConfigurationManager extends AbstractObservable {
    public static final String DATE_FORMAT_CHANGED = "defaultDateFormat";
    public static final String MONEY_FORMAT_CHANGED = "moneyFormat";

    private SimpleDateFormat defaultDateFormat;
    private NumberFormat moneyFormat;
    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    public void setDefaultDateFormat(SimpleDateFormat defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
        notifyAllObservers(DATE_FORMAT_CHANGED, this);
    }

    public void setMoneyFormat(NumberFormat moneyFormat) {
        this.moneyFormat = moneyFormat;
        notifyAllObservers(MONEY_FORMAT_CHANGED, this);
    }

    public SimpleDateFormat getDefaultDateFormat() {
        return defaultDateFormat;
    }

    public NumberFormat getMoneyFormat() {
        return moneyFormat;
    }
}
