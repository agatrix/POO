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
    
    /**
    * Construtor estático, que define a matrícula como 20240000 e vai
    * incrementando confoirme a criação de novos ALunos
    * @
    **/
    static{
        novaMatricula = LocalDate.now().getYear()*10000;
    }
    
    public Aluno(String nome, long cpf) throws Exception {
        this.nome = nome;
        if(ValidarCpf.validar(cpf)!=true){
            throw new Exception("CPF Invalido");
        }
        this.cpf = cpf;
        this.matricula = novaMatricula++;
    }
    
    public Aluno(){}
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        //Pode ser adicionado um throw/exeption para caso tente pegar um
        //aluno com CPF invalido
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
    
    
    @Override
    public String toString() {
        
        if(cpf!=null)
            return "nome = " + nome +
                   "\nmatricula = " + matricula + 
                   "\ncpf = " + ValidarCpf.formatarCPF(cpf);
        else
            return "Aluno não cadastrado, certifique os dados";
    }
}
