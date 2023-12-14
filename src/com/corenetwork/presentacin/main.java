package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProducto;
import com.corenetworks.persistencia.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion c1 = new Conexion();
        try {
            c1.abriConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        AccesoProducto aP1= new AccesoProducto();
        try {
            System.out.println(aP1.obtenerUno(5));
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        try {
            System.out.println(aP1.obtenerTodos());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}