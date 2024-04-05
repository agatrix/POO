package br.edu.ifnmg.temperatura;

import Estatico.ConversorTemperatura;

/**
 *
 * @author agatha
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConversorTemperatura temperatura = new ConversorTemperatura();
        Dinamico.ConversorTemperatura temp = new Dinamico.ConversorTemperatura(3);
        
        try {
            System.out.println(temp.celsiusParaF(0));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.celsiusParaK(0));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.fahrenheiParaK(0));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.fahrenheitParaC(0));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.kelvinParaC(0));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.kelvinParaF(0));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        
    }
    
}
