/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package diversos.testesdiversos;
import static diversos.testesdiversos.Direcao.*;
/**
 *
 * @author umberto alves
 */
public class TestesDiversos {
        public static void main(String[] args) {
            CarroRF carro = new CarroRF();
            carro.agendarMovimentos(CIMA, DIREITA, CIMA, ESQUERDA);
            System.out.println(carro);
            carro.run();
            System.out.println(carro);
            carro.agendarMovimentos(BAIXO, ESQUERDA, ESQUERDA);
            System.out.println(carro);
            carro.run();
            System.out.println(carro);
        }
}

