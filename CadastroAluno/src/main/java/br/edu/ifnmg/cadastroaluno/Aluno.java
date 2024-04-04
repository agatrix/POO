package br.edu.ifnmg.cadastroaluno;

import java.time.LocalDate;

/**
 *
 * @author agatha
 */
public class Aluno {
     private static long novaMatricula;
    private final long matricula;
    private String nome;
    
    
    static{
        LocalDate data = LocalDate.now();
        novaMatricula = data.getYear()*10000;
    }
    

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = novaMatricula++;
    }
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public String toString() {
        return "Aluno{" +
               "nome = " + nome +
               " matricula = " + matricula + 
               '}';
    }
}
