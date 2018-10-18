package javabasico.cap6;

public class EmpregadoComissionado extends Empregado{
    private float vendaBrutaMensal;
    private float comissao;
    
    public EmpregadoComissionado(String nome, String cpf){
        super(nome, cpf);
    }
    
    public float getVendaBrutaMensal() {
        return vendaBrutaMensal;
    }

    public void setVendaBrutaMensal(float vendaBrutaMensal) {
        if(vendaBrutaMensal < 0){
            this.vendaBrutaMensal=0;
        }else{
            this.vendaBrutaMensal = vendaBrutaMensal;
        }
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        if(comissao < 0){
            this.comissao = 0;
        }else{
            this.comissao = comissao;
        }
        
    }
    
    @Override
    public float salario(){
        return this.getComissao() * this.getVendaBrutaMensal() * super.getINSALUBRIDADE();
    }
    
    @Override
    public String toString(){
        return super.toString() + " Comissão: " + this.getComissao() + " Venda Bruta: " + this.getVendaBrutaMensal() + " Salario: "+ this.salario();
    }
    
    
}
