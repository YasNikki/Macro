
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import view.Metas_Macro_GUI;

public class database_metas_DAO {
    
    static String url = "jdbc:mysql://localhost/macro";
    static String username = "root";
    static String password = "";
    
    // CADASTRAR NO BANCO DE DADOS (1)
    
    public static void carregaMetas() throws SQLException{
        
        String SQL = "select * from metas";
        
        DefaultTableModel model = (DefaultTableModel) Metas_Macro_GUI.registros.getModel();
        model.setRowCount(0);
        
        Connection con = (Connection) DriverManager.getConnection(url, username, password);
        
        try{
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            
            while(rs.next()){
                String titulo = rs.getString("titulo");
                String descricao = rs.getString("descricao");
                String data = rs.getString("data");
                String conclusao = rs.getString("pendencia");
                
                String tBD[] = {titulo, descricao, data, conclusao};
                model.addRow(tBD);
                
            }
        }catch (Exception e){
        }
        
    }
    
    public static void registraMetas(){
        
        String titulo = view.Metas_Macro_GUI.titulo.getText();
        String desc = view.Metas_Macro_GUI.desc.getText();
        String data = view.Metas_Macro_GUI.data.getText();
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String SQL = "insert into metas(titulo,descricao,data,pendencia) values(?,?,?,?)";
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, titulo);
            insert.setString(2, desc);
            insert.setString(3, data);
            insert.setString(4, "Pendente");
            
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            carregaMetas();
        } catch (SQLException ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void desregistraMetas(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Metas_Macro_GUI.registros.getModel();
        int row = Metas_Macro_GUI.registros.getSelectedRow();
        String titulo = Metas_Macro_GUI.registros.getModel().getValueAt(row, 0).toString();
        String desc = Metas_Macro_GUI.registros.getModel().getValueAt(row, 1).toString();
        String data = Metas_Macro_GUI.registros.getModel().getValueAt(row, 2).toString();
        
        String SQL = "delete from metas where titulo=? and descricao=? and data=?";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.setString(1, titulo);
            insert.setString(2, desc);
            insert.setString(3, data);
            insert.execute();
            
        }catch (Exception ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            carregaMetas();
        } catch (SQLException ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void verificaMeta(){
        
        controller.Conexao_DB.carregaDriver();

        Connection con = null;
        
        try{
            con = (Connection) DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        DefaultTableModel model = (DefaultTableModel) Metas_Macro_GUI.registros.getModel();
        int row = Metas_Macro_GUI.registros.getSelectedRow();
        String titulo = Metas_Macro_GUI.registros.getModel().getValueAt(row, 0).toString();
        String desc = Metas_Macro_GUI.registros.getModel().getValueAt(row, 1).toString();
        String data = Metas_Macro_GUI.registros.getModel().getValueAt(row, 2).toString();
        
        String SQL = "update metas set pendencia='Concluída' where titulo='"+titulo+"' and descricao='"+desc+"' and data='"+data+"'";
        
        
        try{
            PreparedStatement insert = (PreparedStatement) con.prepareStatement(SQL);
            insert.executeUpdate();
            
        }catch (Exception ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            carregaMetas();
        } catch (SQLException ex) {
            Logger.getLogger(database_metas_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
