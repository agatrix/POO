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
        ConversorTemperatura temperatura = new ConversorTemperatura(0);
        Dinamico.ConversorTemperatura temp = new Dinamico.ConversorTemperatura(0);
        
        System.out.println("Utilizando métodos dinâmicos:");
        
        try {
            System.out.println(temp.celsiusParaF());
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.celsiusParaK());
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.fahrenheiParaK());
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.fahrenheitParaC());
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.kelvinParaC());
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(temp.kelvinParaF());
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        System.out.println("Utilizando métodos estáticos:");
        try {
            System.out.println(ConversorTemperatura.celsiusParaF(temperatura));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(ConversorTemperatura.celsiusParaK(temperatura));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(ConversorTemperatura.fahrenheiParaK(temperatura));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(ConversorTemperatura.fahrenheitParaC(temperatura));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(ConversorTemperatura.kelvinParaC(temperatura));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        try {
            System.out.println(ConversorTemperatura.kelvinParaF(temperatura));
        } catch (Exception e) {
            System.out.println(">>"+e.getMessage());
        }
        
        
    }
    
}
