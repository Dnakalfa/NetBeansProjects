/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dados.bancodedadossql;

/**
 *
 * @author umberto alves
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Consultas {    
    public void listarClientes(Connection conn) {
        try {
            String sql = "SELECT * FROM `clientes`";
            PreparedStatement pStat = conn.prepareStatement(sql);
            ResultSet result = pStat.executeQuery();
            System.out.println("Resultados da Consulta: ");
            System.out.printf("|%8s|%16s|%16s|%16s|%16s|%18s|%n",
                    "codigo", "nome", "idade", "profissao", 
                      "cidade", "estado");
            while (result.next()) {
                String nome = result.getString("nome");
                String idade = result.getString("idade");
                String profissao = result.getString("profissao");
                String cidade = result.getString("cidade");
                String estado = result.getString("estado");
                String codigo = result.getString("codigo");
                System.out.printf("|%8s|%16s|%16s|%16s|%16s|%18s|%n",
                        codigo, nome, idade, profissao, 
                        cidade, estado);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }   
    public void inserirCliente(Connection conn, Cliente cliente){
        try {
            Statement st = conn.createStatement();
            String sql = "INSERT INTO `clientes` (nome, " +
                    "idade, profissao, cidade, estado) VALUES ('"+
                    cliente.getNome() + "', " + 
                    cliente.getIdade() + ", '" + 
                    cliente.getProfissao()+ "', '" + 
                    cliente.getCidade()+ "', '" + 
                    cliente.getEstado()+ "')";
            st.executeUpdate(sql);
            st.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}