package edu.unisabana.dyas.patterns.observer;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import edu.unisabana.dyas.patterns.observer.impl.ConfigurationManager;
import edu.unisabana.dyas.patterns.observer.impl.observers.DateFormatObserver;
import edu.unisabana.dyas.patterns.observer.impl.observers.MoneyFormatObserver;

public class ObserverMain {
    public static void main(String[] args) {
        ConfigurationManager conf = ConfigurationManager.getInstance();

        System.out.println("\nBuen dia");
        System.out.println("El programa empezara a ejecutarse :D ");
        
        conf.setDefaultDateFormat(new SimpleDateFormat("Y/M/D"));
        conf.setMoneyFormat(new DecimalFormat("##.00"));

        System.out.println("\nConfiguracion inicial:");
        System.out.println("Formato Fecha: " + conf.getDefaultDateFormat().toPattern());
        System.out.println("Formato Dinero: " + conf.getMoneyFormat().format(1234.56));


        System.out.println("\nAgregando a los observadores");
        DateFormatObserver dateObserver = new DateFormatObserver();
        MoneyFormatObserver moneyObserver = new MoneyFormatObserver();
        conf.addObserver(dateObserver);
        conf.addObserver(moneyObserver);

       
        System.out.println("\nConfiguracion modificada");
        conf.setDefaultDateFormat(new SimpleDateFormat("D/M/Y"));
        conf.setMoneyFormat(new DecimalFormat("###,#00.00"));

        System.out.println("\nNueva configuracion:");
        System.out.println("Formato Fecha: " + conf.getDefaultDateFormat().toPattern());
        System.out.println("Formato Dinero: " + conf.getMoneyFormat().format(1234.56));

        
        System.out.println("\nSacando a los observadores");
        conf.removeObserver(dateObserver);
        conf.removeObserver(moneyObserver);
        
        
        
        System.out.println("\nEl programa a terminado");
        System.out.println("Que tenga un excelente dia");


    }
}

