/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package contas.appcmdmath;
import java.util.Scanner; 
/**
 *
 * @author umberto alves
 */
public class AppCmdMath {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor inteiro (int): ");
        int entradaInt = scan.nextInt();
        System.out.print("Digite um valor real (double): ");
        double entradaDouble = scan.nextDouble();
        System.out.print("Digite um valor lógico, (true ou false): ");
        boolean entradaBoolean = scan.nextBoolean();
        System.out.print("Digite uma string (uma palavra): ");
        String entradaPalavra = scan.next();
        scan.nextLine();//comando para esvaziar o buffer do teclado
        System.out.print("Digite uma string (várias palavras): ");
        String entradaString = scan.nextLine();
        System.out.println("Saída dos valores lidos: ");
        System.out.printf("\tValorInteiro: %d%n", entradaInt);
        System.out.printf("\tValorReal: %f%n", entradaDouble);
        System.out.printf("\tValorLógico: %b%n", entradaBoolean);
        System.out.printf("\tValorPalavra: %s%n", entradaPalavra);
        System.out.printf("\tValorFrase: %s%n", entradaString);
    }
}
