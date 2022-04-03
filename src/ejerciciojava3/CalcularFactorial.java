
public class CalcularFactorial {
    
    public static int numeroFactorial(int numero) {
      
      int factorial  = 1;
      while (numero!=0)
      {
       factorial*=numero;
       numero --;
      }
     return factorial;
     }
 
  public int tablaMultiplicar(int numero1){
        for(int i = 1; i<=10; i++){  
        System.out.println(numero1+"*"+i+"="+(numero1*i));  
    }
  return numero1;
  }



}