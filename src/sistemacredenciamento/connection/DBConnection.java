/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacredenciamento.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DBConnection {
    public static Connection conectarMysql() throws SQLException, ClassNotFoundException{
        
        //criar a condição com o banco de dados
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/recadastramento","root","root");
                
       //faz com que classe seja carregada pela JVM
       Class.forName("com.mysql.jdbc.Driver");
       return connection;
    }
}
