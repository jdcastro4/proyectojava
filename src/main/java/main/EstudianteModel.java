/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author julit
 */
public class EstudianteModel {
    
    private int codigo;
    private String nombre;
    private int edad;
    private String direccion;
    private static final String driveruri = "com.mysql.jdbc.Driver";
    
    
    EstudianteModel(int codigo, String nombre, int edad, String direccion) {
        this.codigo = codigo;
        this.direccion = direccion;
        this.edad = edad;
        this.nombre = nombre;
    }
    
    int getCodigo() {
       return this.codigo; 
    }
    
    String getNombre() {
        return this.nombre;
    }
    
    int getEdad() {
        return this.edad;
    }
    
    String getDireccion() {
        return this.direccion;
    }
    
    void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    void setEdad(int edad) {
        this.edad = edad;
    }
    
    void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    static void insert(EstudianteModel estudiante) {
        try {
            Class.forName(driveruri).newInstance();
            Connection conn = null;
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/trabajoempiricos", "root", "clave");
            
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e) {
            System.err.println(e.getMessage());
        }

    }
    
}
