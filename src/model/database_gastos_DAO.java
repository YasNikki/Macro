
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.Gastos_Macro_GUI;

public class database_gastos_DAO {
    
    static String url = "jdbc:mysql://localhost/macro";
    static String username = "root";
    static String password = "";
    
    // CADASTRAR NO BANCO DE DADOS (1)
    
    public static void carregaGastoGanho() throws SQLException{
        
        String SQL = "select * from gastos";
        
        DefaultTableModel model = (DefaultTableModel) Gastos_Macro_GUI.registros.getModel();
        model.setRowCount(0);
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                String valores = rs.getString("valores");
                String data = rs.getString("data");
                String tipo = rs.getString("tipo");
                
                String tBD[] = {titulo, descricao, valores, data, tipo};
                model.addRow(tBD);
                
            }
        }catch (Exception e){
        }
        
    }
    
    public static void registraGastoGanho(){
        
        String titulo = view.Gastos_Macro_GUI.titulo.getText();
        String desc = view.Gastos_Macro_GUI.desc.getText();
        String valor = view.Gastos_Macro_GUI.valor.getText();
        String tipo = view.Gastos_Macro_GUI.tipo.getSelectedItem().toString();
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_gastos_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Date dataDiaAtual = new Date();
        String dia = new SimpleDateFormat("dd/MM/yyyy").format(dataDiaAtual);
        
        String SQL = "insert into gastos(titulo,descricao,valores,data,tipo) values(?,?,?,?,?)";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, titulo);
            insert.setString(2, desc);
            insert.setString(3, valor);
            insert.setString(4, dia);
            insert.setString(5, tipo);
            
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_gastos_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            carregaGastoGanho();
        } catch (SQLException ex) {
            Logger.getLogger(database_gastos_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void desregistraGastoGanho(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_gastos_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Gastos_Macro_GUI.registros.getModel();
        int row = Gastos_Macro_GUI.registros.getSelectedRow();
        String titulo = Gastos_Macro_GUI.registros.getModel().getValueAt(row, 0).toString();
        String desc = Gastos_Macro_GUI.registros.getModel().getValueAt(row, 1).toString();
        String valor = Gastos_Macro_GUI.registros.getModel().getValueAt(row, 2).toString();
        
        String SQL = "delete from gastos where titulo=? and descricao=? and valores=?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, titulo);
            insert.setString(2, desc);
            insert.setString(3, valor);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_gastos_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            carregaGastoGanho();
        } catch (SQLException ex) {
            Logger.getLogger(database_gastos_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
