
import java.util.Scanner;
public class Compara
{     
     public static void main (String [] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Ingrese contraseña");
         String cadena1=sc.nextLine();
         String cadena2="yadi";
         if(cadena1.equals(cadena2)){
         System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
        }
            


     }
}   
