package br.edu.ifnmg.cadastroaluno;

/**
 * Classe para validar se o valor entrado pelo numero de CPF
 * do aluno é real.
 * @author agatha
 */
public class ValidarCpf {
    
    /**
    *Esse metodo faz a contagem de digitos, caso tenha +11 digitos
    *o CPF é invalido.
    * @param cpf
    * @return int
    */
    static int contagemDigito(Long cpf){
        int contador = 0;
        while(cpf >= 1){
            cpf /= 10;
            contador++;
            
        }   
        return contador;
    }
    /**
     * Metodo para obter cada digito do numero obtido.
     * @param cpf
     * @param pos
     * @return int
     */
    static int obterDigito(Long cpf, int pos){
        int div = 10; int mod = 10;
        Double digito = (cpf.doubleValue()
                        %(Math.pow(mod, pos))
                        /(Math.pow(div, pos-1)));
        //Digito recebe o wrapper Double, por conta dos metodos Math
        //retornarem double
        
        return digito.intValue();
        
    }
    
    /**
     * Método que utiliza os calculos para validar um CPF.
     * @param cpf
     * @return bool
     */
    static boolean validar(long cpf){
        int digitos = ValidarCpf.contagemDigito(cpf);
        int soma = 0;
        
        if(digitos>11)
            return false;
        
        for(int i = digitos; i > 2; i--){
            soma += (ValidarCpf.obterDigito(cpf, i)*(i-1));
        }

        if(11-(soma%11)==10)
            soma = 0;
        if((11-(soma%11))!= ValidarCpf.obterDigito(cpf, 2))
            return false;
        
        soma = 0;
        for(int i = digitos; i > 1; i--)
            soma += (ValidarCpf.obterDigito(cpf, i)*i);
        
        
        if(11-(soma%11)==10)
            soma = 0;
        
        return (11-(soma%11)) == ValidarCpf.obterDigito(cpf, 1);
    }
    
    /**
     * Metodo para formatar o valor long do CPF no formato de um CPF:
     * xxx.xxx.xxx-xx.
     * @param cpf
     * @return String
     */
    static String formatarCPF(long cpf){
        String cpfFormatado = "";
        int digitos = ValidarCpf.contagemDigito(cpf);
        if(digitos<11){
            for(int i = 11-digitos;i>0;i--){
                cpfFormatado = ""+cpfFormatado+0;
            }
        }
        cpfFormatado = ""+cpfFormatado+cpf;
        String aux = "";
        for(int i = 1;i<12;i++){
            if(i==10)
                aux = aux+"-";
            aux = ""+aux+cpfFormatado.charAt(i-1);
            if(i%3==0 && i!=9)
                aux = aux+".";
        }
        cpfFormatado = aux;
        
        return cpfFormatado;
    }
}
