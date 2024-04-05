package Dinamico;

/**
 * Classe que converter um valor de uma medida de 
 * temperatura para outra; Utilizando membros dinâmicos.
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
    
    public double celsiusParaK() throws Exception {
        if(this.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor + 273.15);
    }
    
    public double celsiusParaF() throws Exception{
        if(this.valor < -273.15)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
    
        return (this.valor*9/5) + 32;
    }
    
    public double fahrenheitParaC() throws Exception {
        if(this.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
          
        return ((this.valor - 32) * 5/9);
    }
    
    public double fahrenheiParaK() throws Exception{
        if(this.valor < -459.67)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor-32)*5/9+273.15;
    }
    
    public double kelvinParaC() throws Exception{
        if(this.valor < 0)
            throw new Exception("O valor passado é menor que o zero absoluto");
         
        return this.valor-273.15;
    }
    
    public double kelvinParaF() throws Exception{
        if(this.valor < 0)
            throw new Exception("O valor passado é menor que o Zero Absoluto");
        
        return (this.valor - 273.15)*9/5+32;
    }

    @Override
    public String toString() {
        return "valor de entrada = " + this.valor;
    }
    
}
