/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import static java.sql.DriverManager.println;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.departamento;
import modelo.estados;

/**
 *
 * @author 57321
 */
public class departamentosDAO {

  PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<departamento> ConsultarListadoDepartamentos( String nombre) {
        ArrayList<departamento> milistadepartamento = new ArrayList<departamento>();

        departamento miDepartamento;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idDepartamento, nombre from departamentos "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idDepartamento;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miDepartamento= new departamento();
                miDepartamento.setIdDepartamento(rs.getInt(1));
                miDepartamento.setNombre(rs.getString(2));
                
                milistadepartamento.add(miDepartamento);

            }
            return milistadepartamento;
        } catch (Exception e) {
            System.out.println("Error el a consulta inmueble" + e.getMessage());
            return milistadepartamento;

        }

    }
    public List listar() {
        List<departamento> lista = new ArrayList<>();
        String sql = "select * from departamentos";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               departamento p = new departamento();
                p.setIdDepartamento(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public departamento listarId(int id) {
        String sql = "select * from departamentos where idDepartamentos=" + id;
        departamento pe = new departamento();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdDepartamento(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(departamento p) {
        String sql = "insert into departamentos(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(departamento p) {
        String sql = "update departamentos set nombre=? where idDepartamento=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdDepartamento());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from departamentos where idDepartamento=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   

   
}
