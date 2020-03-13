import java.util.Scanner;
public class Compara3
{     
     public static void main (String [] args){
         Scanner sc=new Scanner(System.in);
         String cadena2="yadi";
         for(int x=0; x<3;x++){
         System.out.println("Ingrese contraseña");
         String cadena1=sc.nextLine();
              if(cadena1.equals(cadena2)){
           System.out.println("Contraseña correcta");
        }else{
            System.out.println("Contraseña incorrecta");
          }
        }


     }
}
