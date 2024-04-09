package br.edu.ifnmg.cadastroaluno;

/**
 * Código para fazer cadastro de alunos
 * @author Gustavo
 */
public class CadastroAluno {

    public static void main(String[] args) {
        
        try {
           Aluno a1 = new Aluno("Rogerio",54647142949);
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }

        try {
           Aluno a2 = new Aluno("Ari",00000000201);
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }
    }
}
