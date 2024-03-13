    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package diversos.testesdiversos;
import java.util.Arrays;


public class CarroRF implements Runnable {
    private int nivelBateria;
    private int numMovimentos;
    public CarroRF() {
        this.nivelBateria = 100;
        this.numMovimentos = 0;
    }
    public void agendarMovimentos(Direcao... direcoesMovimentos) {
        String msg = String.format("Lista movimentos agendados:%s",
                     Arrays.toString(direcoesMovimentos));
        System.out.println(msg);
        numMovimentos += direcoesMovimentos.length;
    }
    @Override
    public void run() {
        System.out.println("Executando movimentos ...");
        //execução da movimentação do carro (abstrair)
        nivelBateria -= numMovimentos;
        numMovimentos = 0;
    }
    @Override
    public String toString() {
        return String.format("Nível da Bateria: %d%n" +
                      "Movimentos a Executar: %d", 
                      nivelBateria, numMovimentos);
    }
}

