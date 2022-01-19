package test;

import java.sql.*;

public class TestMySQLJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
           
        try {
            //Class.forName("com.jdbc.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"root","root");
            Statement  instruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("id persona: " + resultado.getInt("id_persona"));
                System.out.print(" Nombre: " + resultado.getString("nombre"));
                System.out.print(" Email: " + resultado.getNString("email"));
                System.out.print(" Telefono: " + resultado.getNString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
