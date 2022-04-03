import java.util.Scanner;

public class EjercicioJava3 {

    public static void main(String[] args) {
        System.out.println("BIENVENIDO PROGRAMA POO");
        System.out.println("Digite el numero de la clase que quiera seleccionar ");
        int accion;
        Scanner clase = new Scanner (System.in);
        System.out.println("Funciones Basicas");
        System.out.println("1. Clase1");
        System.out.println("2. Clase2");
       
       
        accion = clase.nextInt();
        
        Clase2 DiasNumerosPares = new Clase2(); 
        CalcularFactorial NumeroFactorial1 = new CalcularFactorial();
        switch (accion) {
            
            case 1:
                 long factorial=1;
                 int num;
                
                Scanner numero = new Scanner(System.in);
                
                System.out.print("Introduce un número para calcular la factorial: ");
                num = numero.nextInt();
                
                System.out.println(NumeroFactorial1.numeroFactorial(num));
                
                 int n;
                
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Introduce un número entero: ");                                                         
                 n = sc.nextInt();
                
                System.out.println(NumeroFactorial1.tablaMultiplicar(n));
                
                
                
                break;
                
            case 2:
             
                char dia;
                
                Scanner tabla = new Scanner(System.in);
                
                String caracter; 
                System.out.print("Introduce un dia: ");
                caracter = tabla.nextLine();
                
                System.out.println(DiasNumerosPares.diasSemana(caracter));
                
                
          
                break;
                
        
                
        }
    }
    
}