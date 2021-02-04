package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.inmuebles;

public class inmueblesDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
    

    public List listar() {
        List<inmuebles> lista = new ArrayList<>();
        String sql = "select * from inmuebles";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                inmuebles p = new inmuebles();
                p.setIdInmueble(rs.getInt(1));
                p.setIdTipo(rs.getInt(2));
                p.setIdDepartamento(rs.getInt(3));
                p.setIdUsuario(rs.getInt(4));
                p.setIdEstado(rs.getInt(5));
                p.setNombre(rs.getString(6));
                p.setDireccion(rs.getString(7));
                p.setCapacidad(rs.getInt(8));
                p.setDescripcion(rs.getString(9));
                p.setPrecio(rs.getInt(10));
                p.setAdjunto(rs.getString(11));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public inmuebles listarId(int id) {
        String sql = "select * from inmuebles where idInmueble=" + id;
        inmuebles pe = new inmuebles();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdInmueble(rs.getInt(1));
                pe.setIdTipo(rs.getInt(2));
                pe.setIdDepartamento(rs.getInt(3));
                pe.setIdUsuario(rs.getInt(4));
                pe.setIdEstado(rs.getInt(5));
                pe.setNombre(rs.getString(6));
                pe.setDireccion(rs.getString(7));
                pe.setCapacidad(rs.getInt(8));
                pe.setDescripcion(rs.getString(9));
                pe.setPrecio(rs.getInt(10));
                pe.setAdjunto(rs.getString(11));

            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(inmuebles p) {
        String sql = "insert into inmuebles(idTipo, idDepartamento, idUsuario, idEstado, nombre, direccion, capacidad, descripcion,"
                + " precio, adjunto)values(?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdTipo());
            ps.setInt(2, p.getIdDepartamento());
            ps.setInt(3, p.getIdUsuario());
            ps.setInt(4, p.getIdEstado());
            ps.setString(5, p.getNombre());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getCapacidad());
            ps.setString(8, p.getDescripcion());
            ps.setInt(9, p.getPrecio());
            ps.setString(10, p.getAdjunto());

            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(inmuebles p) {
        String sql = "update inmuebles set idTipo=?, idDepartamento=?, idUsuario=?, idEstado=?, nombre=?,"
                + "direccion=?, capacidad=?, descripcion=?, precio=?, adjunto=? where idInmueble=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdTipo());
            ps.setInt(2, p.getIdDepartamento());
            ps.setInt(3, p.getIdUsuario());
            ps.setInt(4, p.getIdEstado());
            ps.setString(5, p.getNombre());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getCapacidad());
            ps.setString(8, p.getDescripcion());
            ps.setInt(9, p.getPrecio());
            ps.setString(10, p.getAdjunto());
            ps.setInt(11, p.getIdInmueble());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from inmuebles where idInmueble=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
     
    public ArrayList<inmuebles> ConsultarListadoInmuebles( String nombre) {
        ArrayList<inmuebles> milistainmueble = new ArrayList<inmuebles>();

        inmuebles miinmueble;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idInmueble, nombre from inmuebles "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idInmueble;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miinmueble = new inmuebles();
                miinmueble.setIdEstado(rs.getInt(1));
                miinmueble.setNombre(rs.getString(2));
                
                milistainmueble.add(miinmueble);

            }
            return milistainmueble;
        } catch (Exception e) {
            System.out.println("Error el a consulta inmueble" + e.getMessage());
            return milistainmueble;

        }
        
 }

}
