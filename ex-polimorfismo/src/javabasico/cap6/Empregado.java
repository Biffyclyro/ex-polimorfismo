package javabasico.cap6;

public class Empregado {
    private String nome;
    private String cpf;
    private final float INSALUBRIDADE = 2.21f;

      

    public Empregado(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getINSALUBRIDADE() {
        return INSALUBRIDADE;
    }    
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + " CPF: " + this.getCpf();
        
    }
    
    public float salario(){
        return 0f;
    }
    
    
    
}
