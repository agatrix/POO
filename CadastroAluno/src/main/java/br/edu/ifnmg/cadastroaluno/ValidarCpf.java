package br.edu.ifnmg.cadastroaluno;

/**
 * Classe para validar se o valor entrado pelo numero de CPF
 * do aluno é real.
 * @author agatha
 */
public class ValidarCpf {
    
    static int contagemDigito(Long cpf){
        int contador = 0;
        while(cpf >= 1){
            cpf /= 10;
            contador++;
            
        }   
        return contador;
    }
    
    static int obterDigito(Long cpf, int pos){
        int div = 10; int mod = 10;
        Double digito = (cpf.doubleValue()
                        %(Math.pow(mod, pos))
                        /(Math.pow(div, pos-1)));
        //Digito recebe o wrapper Double, por conta dos metodos Math
        //retornarem double
        
        return digito.intValue();
        
    }
    
    static boolean validar(long cpf){
        int digitos = ValidarCpf.contagemDigito(cpf);
        int soma = 0; int cout = digitos;
        
        if(digitos>11)
            return false;
        
        
        for(int i = digitos; i > 2; i--){

            soma += (ValidarCpf.obterDigito(cpf, i)*(cout-1));
            cout--;
        }
        if(soma%11==10) soma = 0;
        if((11-(soma%11))!= ValidarCpf.obterDigito(cpf, 2)) return false;
        
        cout = digitos; soma = 0;
        for(int i = digitos; i > 1; i--){
            soma += (ValidarCpf.obterDigito(cpf, i)*cout);
            cout--;
        }
        
        if(soma%11==10) soma = 0;
        return (11-(soma%11)) == ValidarCpf.obterDigito(cpf, 1);
    }
}
