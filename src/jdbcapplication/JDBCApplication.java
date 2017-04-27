/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapplication;

import java.sql.*;

/**
 *
 * @author ALAINA
 */
public class JDBCApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("carga EXITOSA");
            String url = "jdbc:mysql://localhost/itse?user=root";
            Connection conn = DriverManager.getConnection(url);
            System.out.println("Carga realizada");
            Statement st = conn.createStatement();
            st.execute("insert into " 
                    + "itse2(Matricula,Grupo,Nombre)" 
                    + "values('1239218328','isma2','alaina')");
            conn.close();
        } catch (ClassNotFoundException ex) {

            System.out.println("Error:controlador");

            System.exit(1);

        } catch (SQLException ex) {

            System.out.println("Error; conexion");
            ex.printStackTrace();

        }

    }
}
