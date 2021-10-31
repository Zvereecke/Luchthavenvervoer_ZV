/*
Author: Zegher Vereecke
 */
package Model;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Main {


    public static void main(String args[]){
        String keuzemenu = JOptionPane.showInputDialog("Voer het getal in van onderstaande transportmogelijkheden " +
                "om een keuze te maken: \n\n 1) Auto\n 2)Trein \n 3)Bus \n 4)Taxi \n\n");
        TransportationStrategy transportationStrategy = new TransportationStrategy();
        setStrategy(keuzemenu, transportationStrategy);
        transportationStrategy.getStrategy().starttransport();
    }

    public static TransportationStrategy setStrategy(String keuze, TransportationStrategy transportationStrategy){
        switch(keuze){
            case "1": transportationStrategy.setStrategy(new Auto());
            break;
            case "2": transportationStrategy.setStrategy(new Trein());
                break;
            case "3": transportationStrategy.setStrategy(new Bus());
                break;
            case "4": transportationStrategy.setStrategy(new Taxi());
                break;
            default: transportationStrategy.setStrategy(new Default());
                break;

        }
        return transportationStrategy;
    }

}
