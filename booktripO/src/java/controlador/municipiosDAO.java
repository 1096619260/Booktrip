/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.municipios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.departamento;
import modelo.estados;

/**
 *
 * @author 57321
 */
public class municipiosDAO {

   PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<municipios> ConsultarListadoMunicipios( String nombre) {
        ArrayList<municipios> milistamunicipios= new ArrayList<municipios>();

        municipios miMunicipio;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idDepart, nombre from municipios "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idMunicipios;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miMunicipio = new municipios();
                miMunicipio.setIdDepartamento(rs.getInt(1));
                miEstado.setNombre(rs.getString(2));
                
                milistaestado.add(miEstado);

            }
            return milistaestado;
        } catch (Exception e) {
            System.out.println("Error el a consulta inmueble" + e.getMessage());
            return milistaestado;

        }

    }
    public List listar() {
        List<estados> lista = new ArrayList<>();
        String sql = "select * from estados";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                estados p = new estados();
                p.setIdEstado(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public estados listarId(int id) {
        String sql = "select * from estados where idEstado=" + id;
        estados pe = new estados();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdEstado(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(estados p) {
        String sql = "insert into estados(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(estados p) {
        String sql = "update estados set nombre=? where idEstado=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from estados where idEstado=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   

   
}
