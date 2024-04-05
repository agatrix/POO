package br.edu.ifnmg.cadastroaluno;
import java.time.LocalDate;

/**
 * Classe Aluno contém atributos que representam nome e matrícula
 * @author agatha
 */
public class Aluno {
    private static long novaMatricula;
    private final long matricula;
    private String nome;
    
    /**
    * Construtor estático, que define a matrícula como 20240000 e vai
    * incrementando confoirme a criação de novos ALunos
    * @
    **/
    static{
        novaMatricula = LocalDate.now().getYear()*10000;
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
