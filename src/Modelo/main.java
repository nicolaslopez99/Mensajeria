/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.SQLException;

/**
 *
 * @author Juan
 */
public class main {
    public static void main(String[] args) throws SQLException{
       Conexion a = new Conexion();
        
       DAOCliente b = new DAOCliente();
       b.InsertarCliente();
       
    }
}
