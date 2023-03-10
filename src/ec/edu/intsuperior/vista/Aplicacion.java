/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

/**
 *
 * @author Dell
 */

import ec.edu.intsuperior.controlador.Conexion;
import static ec.edu.intsuperior.controlador.Conexion.conexion;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) throws SQLException {
        
        Conexion.conexion();
}
}

