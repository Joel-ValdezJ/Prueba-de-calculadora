//Ejercicio de Practica
//Mostrare dos numeros y su suma correspondiente
import java.util.Scanner;

public class sumasssssss {
    //main empieza la ejecucion en java
    public static void main(String[] args) {
        //Crear el Scanner para entrada ventana de comandos}
        Scanner entrada = new Scanner (System.in);
        
        int numero1, //Primer numero en sumar
            numero2, //segundo numero en sumar
            suma; //suma de ambos numeros, 1 y 2
        
        System.out.print("Ingresar primer entero: "); //indicador
        numero1 = entrada.nextInt(); //accion que lee el numero
        
        System.out.print("Ingresar segundo entero: ");
        numero2 = entrada.nextInt();
        
        suma = numero1 + numero2;
                
        System.out.printf("La suma es: %d%n" , suma); //muestra la suma
        
        
                                   
               }
    
}
