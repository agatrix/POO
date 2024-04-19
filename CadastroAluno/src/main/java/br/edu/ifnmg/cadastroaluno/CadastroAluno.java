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
           //a1 recebe os dados do usuario
           System.out.println(a1.getNome()+" cadastrado com sucesso!");
           
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }
        
        try {
           a2.setNome("Gu");
           a2.setCpf(00000124563);
           /*a2 recebe os dados já predefinidos, para mostrar como fica
           o toString quando temos um valor invalido no CPF
           */
           System.out.println(a1.getNome()+" cadastrado com sucesso!");
           
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }
        try {
            System.out.println(a1.getCpf());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println(a1);
        System.out.println(a2);
        
        /*try {
           Aluno a3 = new Aluno("Aggie",1163); 
           //Nao foi colocado o valor 00000001163, pois identifica com octal
           System.out.println(a3.getNome()+" cadastrado com sucesso!");
           System.out.println(a3);
           //a3 utiliza um construtor sobrecarregado
        }
        catch (Exception e) {
           System.out.println(">> "+e.getMessage());
        }*/
    }
}
