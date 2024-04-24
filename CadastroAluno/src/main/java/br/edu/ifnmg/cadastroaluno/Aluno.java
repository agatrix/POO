package br.edu.ifnmg.cadastroaluno;
import java.time.LocalDate;
import jdk.jshell.spi.ExecutionControl;

/**
 * Classe Aluno contém atributos que representam nome e matrícula
 * @author agatha
 */
public class Aluno {
    private static long novaMatricula;
    private long matricula;
    private Long cpf;
    private String nome;
    private String senha;
    
    /**
    * Construtor estático, que define a matrícula como 20240000 e vai
    * incrementando confoirme a criação de novos ALunos
    * @
    **/
    static{
        novaMatricula = LocalDate.now().getYear()*10000;
    }
    
    public Aluno(String nome, long cpf, String senha) throws Exception {
        this.nome = nome;
        if(ValidarCpf.validar(cpf)!=true){         
            throw new Exception("CPF Invalido");
        }
        
        if(ValidarSenha.validar(senha)!=true)
            throw new Exception("Senha Invalida");
        this.cpf = cpf;
        this.senha = senha;       
        this.matricula = novaMatricula++;
    }
    
    public Aluno(){} //Construtor padrão vazio
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() throws Exception{
        //Pode ser adicionado um throw/exeption para caso tente pegar um
        //aluno com CPF invalido
        if(cpf == null)
            throw new Exception("CPF nao cadastrado!");
        return cpf;
    }

    public void setCpf(long cpf) throws Exception {
        if(ValidarCpf.validar(cpf)!=true){
            this.cpf = null;
            throw new Exception("CPF Invalido");
        }
        this.cpf = cpf;
        if(this.senha!=null) //Certifica se a senha foi preenchido para verificar
            setMatricula();
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        int[] vetor;
        
        vetor = ValidarSenha.verificacoes(senha);
        if(vetor[0]<8 || vetor[0]>12)
            System.out.println(">> A senha precisa ter de 8 a 12 caracteres");
        
        if(vetor[1]==0)
            System.out.println(">> A senha precisa conter um caracter maiusculo");
        
        if(vetor[2]==0)
            System.out.println(">> A senha precisa conter um caracter minusculo");
        
        if(vetor[3]==0)
            System.out.println(">> A senha precisa conter um numero");
        
        if(vetor[4]==0)
            System.out.println(">> A senha precisa conter um caracter especial");
        
        if(ValidarSenha.validar(senha)!=true){
            this.senha = null;
            throw new Exception("Senha invalida.");
        }
        
        this.senha = senha;
        if(this.cpf!=null) //Certifica se o cpf foi preenchido para verificar
            setMatricula();
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula() {
        if(ValidarSenha.validar(this.senha)==true &&
           ValidarCpf.validar(this.cpf)==true )
            this.matricula = novaMatricula++;
    }
    
    
    @Override
    public String toString() {
        
        if(cpf!=null && senha!=null)
            return "nome = " + nome +
                   "\nmatricula = " + matricula + 
                   "\ncpf = " + ValidarCpf.formatarCPF(cpf) +
                   "\nsenha = " + this.senha; 
        else
            return "Aluno não cadastrado, certifique os dados";
    }
}
