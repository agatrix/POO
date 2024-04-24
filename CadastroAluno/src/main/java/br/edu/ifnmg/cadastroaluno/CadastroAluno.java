package br.edu.ifnmg.cadastroaluno;

import java.util.Scanner;

/**
 * Código para fazer cadastro de alunos
 * @author Gustavo
 */
public class CadastroAluno {

    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Scanner x = new Scanner(System.in); //receber entrada do teclado

        try {
           a1.setNome(x.next());
           a1.setCpf(x.nextLong());
           a1.setSenha(x.next());
           //a1 recebe os dados do usuario
           System.out.println(a1.getNome()+" cadastrado com sucesso!");
           
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }

        try {
           a2.setNome("Gu");
           a2.setCpf(23442441);
           a2.setSenha("Gu.2024.h");
           /*a2 recebe os dados já predefinidos, para mostrar como fica
           o toString quando temos um valor invalido no CPF
           */
           System.out.println(a2.getNome()+" cadastrado com sucesso!");
           
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }
        
        Aluno a3 = new Aluno("Aggie",1163,"Ag123.cat"); 
        //a3 utiliza um construtor sobrecarregado
        System.out.println("Aluno 1:\n"+a1);
        System.out.println("Aluno 2:\n"+a2);
        System.out.println("Aluno 3:\n"+a3);
        
        
    }
}
