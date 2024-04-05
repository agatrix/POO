package Estatico;

/**
 * Classe que converter um valor de uma medida de 
 * temperatura para outra; Utilizando métodos estáticos.
 * @author Gustavo
 */
public class ConversorTemperatura {
    
    private double valor;

    public ConversorTemperatura(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    public static double celsiusParaK(ConversorTemperatura x) throws Exception {
        if(x.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (x.valor + 273.15);
    }
    
    public static double celsiusParaF(ConversorTemperatura x) throws Exception{
        if(x.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
    
        return (x.valor*9/5) + 32;
    }
    
    public static double fahrenheitParaC(ConversorTemperatura x) throws Exception {
        if(x.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
          
        return ((x.valor - 32) * 5/9);
    }
    
    public static double fahrenheiParaK(ConversorTemperatura x) throws Exception{
        if(x.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (x.valor-32)*5/9+273.15;
    }
    
    public static double kelvinParaC(ConversorTemperatura x) throws Exception{
        if(x.valor < 0)
            throw new Exception("O valor passado é menor que o zero absoluto");
         
        return x.valor-273.15;
    }
    
    public static double kelvinParaF(ConversorTemperatura x) throws Exception{
        if(x.valor < 0)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (x.valor - 273.15)*9/5+32;
    }

}
