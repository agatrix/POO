package Dinamico;

/**
 * @ 
 * @author agatha
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
    
    public double celsiusParaK(double valor) throws Exception {
        if(valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (valor + 273.15);
    }
    
    public double celsiusParaF(double valor) throws Exception{
        if(valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
    
        return (valor*9/5) + 32;
    }
    
    public double fahrenheitParaC(double valor) throws Exception {
        if(valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
          
        return ((valor - 32) * 5/9);
    }
    
    public double fahrenheiParaK(double valor) throws Exception{
        return celsiusParaK(fahrenheitParaC(valor));
    }
    
    public double kelvinParaC(double valor) throws Exception{
        if(valor < 0)
            throw new Exception("O valor passado é menor que o zero absoluto");
         
        return valor-273.15;
    }
    
    public double kelvinParaF(double valor) throws Exception{
        return celsiusParaF(kelvinParaC(valor));
    }
    
    
    
}
