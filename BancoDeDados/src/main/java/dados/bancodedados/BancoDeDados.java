/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dados.bancodedados;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author umberto alves
 */
public class BancoDeDados {    
    public final String DELIMITADOR_PONTO_VIRGULA = ";";
    public final String DELIMITADOR_VIRGULA = ",";
    public static void main(String[] args) {
        BancoDeDados csv = new BancoDeDados();
        List<List<String>> registroDados = csv.leitura();
        csv.imprimeDados(registroDados);
    }
    public List<List<String>> leitura() {    
        List<List<String>> registroDados = new ArrayList<>();
        try {
            File arquivo = new File("C:\\Users\\umberto alves\\Documents\\NetBeansProjects\\BancoDeDados\\src\\main\\java\\DadosTexto\\dadosClientes.csv");
            Scanner sc = new Scanner(arquivo);
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                registroDados.add(getRegistroDaLinha(linha));
            }
        } catch (FileNotFoundException ex) {
            System.out.printf("Erro abertura do arquivo: %s.%n",
                    ex.getMessage());
            System.exit(0);
        }
        return registroDados;
    }    
    private List<String> getRegistroDaLinha(String linha) {
        List<String> listValores = new ArrayList<String>();
        try (Scanner linhaScanner = new Scanner(linha)) {
            linhaScanner.useDelimiter(DELIMITADOR_PONTO_VIRGULA);
            while (linhaScanner.hasNext()) {
                listValores.add(linhaScanner.next());
            }
        }
        return listValores;
    }       
    private void imprimeDados(List<List<String>> registroDados){
        for (List<String> lista : registroDados){
            for (String elemento : lista){
                System.out.printf("|%15s ", elemento);
            }
            System.out.println("|");
        }
    }
} 

