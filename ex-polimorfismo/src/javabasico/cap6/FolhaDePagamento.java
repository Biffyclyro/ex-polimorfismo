package javabasico.cap6;



public class FolhaDePagamento {
   public static void main(String args[]){
       EmpregadoAssalariado ea1 = new EmpregadoAssalariado("Fulano de tal", "99999999");
       EmpregadoComissionado ec1 = new EmpregadoComissionado("Ciclano", "333333333");
       empregados(ec1, ea1);
       
   }
   
   public static void empregados(Empregado... empregado){
       for(Empregado e : empregado){
           System.out.println(e);
       }
       
   }
}
