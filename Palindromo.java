
package palindromo;
import java.util.Scanner;
/**
 *
 * @author gambl3r
 */
public class Palindromo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String palabra;
        String palabra_invertida = "";
        
        int i = 0;
        System.out.println("Ingrese una palabra: ");
        palabra = entrada.nextLine();
        palabra.replace(" ", ""); // Quitamos los espacios
        // Metodo para invertir la palabra
        for (i = palabra.length()-1; i >=0; i--){
            palabra_invertida = palabra_invertida + palabra.charAt(i);
        }
        palabra_invertida.replace(" ", "");
        
        // Comparamos
        if(palabra_invertida.equals(palabra)){
            System.out.println("Esta palabra o frase es palindromo.");
        } else{
            System.out.println("La palabra o frase no es palindromo");
        }
        
    }
    
}
