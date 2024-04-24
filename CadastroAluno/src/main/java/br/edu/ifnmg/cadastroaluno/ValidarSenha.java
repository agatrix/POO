package br.edu.ifnmg.cadastroaluno;

/**
 * Classe utilizada para validar senha. A senha deve conter pelo menos:
 * 1 Caracter Maiusculo.
 * 1 Caracter Minusculo.
 * 1 Numero.
 * 1 Caracter Especial.
 * 8-12 Caracteres.
 *
 * @author agatha
 */
public class ValidarSenha {

    /**
     * Verifica se a senha possui uma quantidade de caracteres no intervalo
     * [8,12].
     * @param senha
     */
    static int verificaTamanho(String senha)  {
        return senha.length();
    }
    
    /**
     * Metódo que verifica se dentro da senha possui caracteres Maiusculos
     * @return int
     * @param senha
     */
    static int verificaMaiusculo(char letra, int maiusculo) {
        if(Character.isUpperCase(letra)){
                maiusculo++;
        }
        return maiusculo;
    }
    
    /**
     * Metódo que verifica se dentro da senha possui caracteres Minusculos
     * @return int
     * @param senha
     */
    static int verificaMinusculo(char letra,int minusculo) {
        if(Character.isLowerCase(letra)){
                minusculo++;
        } 
        return minusculo;
    }
    
    /**
     * Metódo que verifica se dentro da senha possui numeros
     * @return int
     * @param senha
     */
    static int verificaDigito(char letra, int numero) {
        if(Character.isDigit(letra)){
            numero++;
        }
        return numero;
    }
    
    /**
     * Metódo que verifica se dentro da senha possui caracteres Especiais
     * @return int
     * @param senha
     */
    static int verificaEspecial(char letra, int especial) {
        if((int)letra> 32 && (int)letra < 48 ||
            (int)letra > 57 && (int)letra < 65){
            especial++;
        }
        return especial;
    } 
    
    /**
     * Esse metodo faz todas as verificacoes e salvar a quantidade dos 
     * caracteres presentes na senha, para no final verificar se ela é valida
     * em outro metodo. Alem disso armazena os valores, para lançar mensagens
     * informando o que está faltando na senha.
     * @param senha
     * @return vetor
     */
    static int[] verificacoes(String senha){
        int[] vetor = new int[5];
        int maiusculo = 0, minusculo = 0, especial = 0, numero = 0;
        for(int i=0;i<senha.length();i++){
            especial = ValidarSenha.verificaEspecial(senha.charAt(i), especial);
            maiusculo = ValidarSenha.verificaMaiusculo(senha.charAt(i), maiusculo);
            minusculo = ValidarSenha.verificaMinusculo(senha.charAt(i), minusculo);
            numero = ValidarSenha.verificaDigito(senha.charAt(i), numero);
        }
        
        vetor[0] = ValidarSenha.verificaTamanho(senha);
        vetor[1] = maiusculo;
        vetor[2] = minusculo;
        vetor[3] = numero;
        vetor[4] = especial;
        
        return vetor;
    }
    
    /**
     * Metodo final que valida se a senha esta valida ou não.
     * @param senha
     * @return boolean
     */
    static boolean validar(String senha){
        int[] vetor;
        vetor = ValidarSenha.verificacoes(senha);
        
        if(vetor[0]<8 || vetor[0]>12)
            return false;
  
        for(int i = 1; i < 5; i++)
            if(vetor[i]==0)
                return false;
        
        return true;
    }
}
