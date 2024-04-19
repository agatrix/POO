package br.edu.ifnmg.cadastroaluno;
import java.time.LocalDate;

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
    
    public Aluno(String nome, long cpf/*, String senha*/) throws Exception {
        this.nome = nome;
        if(ValidarCpf.validar(cpf)!=true){
            
            throw new Exception("CPF Invalido");
            
        }
        //Add throw para fazer execao do tipo da senha
        this.cpf = cpf;
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
        this.matricula = novaMatricula++;
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        
        this.senha = senha;
    }
    
    
    @Override
    public String toString() {
        
        if(cpf!=null)
            return "nome = " + nome +
                   "\nmatricula = " + matricula + 
                   "\ncpf = " + ValidarCpf.formatarCPF(cpf) +
                   "\nsenha = "; //+this.senha 
        else
            return "Aluno não cadastrado, certifique os dados";
    }
}
