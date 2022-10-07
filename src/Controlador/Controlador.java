/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Articulo;
import Modelo.Conexion;
import Modelo.Usuario;
import Modelo.Venta;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Julian
 */
public class Controlador {

    Conexion conexion = new Conexion();

    public Controlador() {

    }

    public boolean guardar(String cedula, String nombre, 
            String apellido, String correo, String contraseña) {
        Usuario usuario = new Usuario(cedula, nombre, 
                apellido, correo, contraseña);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("insert into usuario(cedula,nombre,apellido,correo,contraseña) "
                + "values('" + usuario.getCedula() + "','" +
                usuario.getNombre() + "','" +
                usuario.getApellido() + "'," +
                usuario.getCorreo() +","+
                usuario.getContraseña()+ ")");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public List<String> buscarCedula(String cedula) {
        
        List<String> temp = new ArrayList<String>();
        
        conexion.conectar();

        try {
                     
           conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select cedula,nombre,apellido,"
                            + "correo, contraseña from Usuario where "
                            + "cedula='" + cedula + "'"));//consulta    

            if (conexion.getResultadoDB().next()) {
                temp.add(conexion.getResultadoDB().getString("cedula"));
                temp.add(conexion.getResultadoDB().getString("nombre"));
                temp.add(conexion.getResultadoDB().getString("apellido"));
                 temp.add(conexion.getResultadoDB().getString("contraseña"));
                temp.add(conexion.getResultadoDB().getInt("correo")+"");
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }
    
    public List<String> buscarCorreo(String correo) {
        
        List<String> temp = new ArrayList<String>();
        
        conexion.conectar();

        try {
                     
           conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select cedula,nombre,apellido,"
                            + "correo, contraseña from Usuario where "
                            + "correo='" + correo + "'"));//consulta    

            if (conexion.getResultadoDB().next()) {
                temp.add(conexion.getResultadoDB().getString("cedula"));
                temp.add(conexion.getResultadoDB().getString("nombre"));
                temp.add(conexion.getResultadoDB().getString("apellido"));
                 temp.add(conexion.getResultadoDB().getString("contraseña"));
                temp.add(conexion.getResultadoDB().getInt("correo")+"");
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }

    

    
   public boolean modificar(String cedula, String nombre, String apellido, String correo, String contraseña) {
        Usuario articulo = new Usuario(cedula, nombre, apellido, correo, contraseña);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute("update usuario set nombre='" + articulo.getNombre()
                    + "',apellido='" + articulo.getApellido()
                    + "',correo='" + articulo.getCorreo() + "',"
                    + "contraseña=" + articulo.getContraseña()
                    + " where cedula='" + articulo.getCedula() + "'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public boolean eliminarCedula(String cedula) {

        conexion.conectar();

        try {
            conexion.getSentenciaSQL().execute
        ("delete from usuario where cedula='" + cedula+"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }
    public boolean eliminarCorreo(String correo) {

        conexion.conectar();

        try {
            conexion.getSentenciaSQL().execute
        ("delete from usuario where correo='" + correo+"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public DefaultTableModel listar() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Cedula", "Nombre", "Apellido", "correo","contraseña"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select cedula,nombre,apellido,Correo,Contraseña"
                            + " from usuario order by cedula"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("cedula"),
                    conexion.getResultadoDB().getString("nombre"),
                    conexion.getResultadoDB().getString("apellido"),
                    conexion.getResultadoDB().getInt("correo"),
                     conexion.getResultadoDB().getInt("contraseña")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }

        return temporal;

    }

    
        public boolean guardarArticulo(String codigo, String nombre, 
            double precio, int cantidad,String descripcion, String categoria) {
        Articulo articulo = new Articulo(codigo, nombre, precio, cantidad, descripcion, categoria);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("insert into Articulo(codigo,nombre,precio,cantidad,descripcion,categoria) "
                + "values('" + articulo.getCodigo() + "','" +
                articulo.getNombre() + "','" +
                articulo.getPrecio()+ "'," +
                articulo.getCantidad() +","+
                articulo.getDescripcion()+","+
                 articulo.getCategoria()+")");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public List<String> buscarArticulo(String codigo) {
        
        List<String> temp = new ArrayList<String>();
        
        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo,nombre,precio,"
                            + "cantidad,descripcion,categoria from Articulo where "
                            + "codigo='" + codigo + "'"));//consulta          

            if (conexion.getResultadoDB().next()) {
                temp.add(conexion.getResultadoDB().getString("codigo"));
                temp.add(conexion.getResultadoDB().getString("nombre"));
                temp.add(conexion.getResultadoDB().getString("precio"));
                temp.add(conexion.getResultadoDB().getString("descripcion"));
                temp.add(conexion.getResultadoDB().getString("categoria"));
                temp.add(conexion.getResultadoDB().getInt("cantidad")+"");
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }

 public boolean modificarArticulo(String codigo, String nombre, double precio,int cantidad, String descripcion, String categoria) {
        Articulo articulo = new Articulo(codigo, nombre, precio, cantidad, descripcion, categoria);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("update articulo set nombre='" +  articulo.getNombre()+ "'," +            
                "precio=" + articulo.getPrecio()+","+
                "cantidad="+articulo.getCantidad()+","+
                "descripcion="+articulo.getDescripcion()+","+
                 "categoria="+articulo.getCategoria()
                + " where codigo='" + articulo.getCodigo()+"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

 public boolean eliminarArticulo(String codigo) {

        conexion.conectar();

        try {
            conexion.getSentenciaSQL().execute
        ("delete from articulo where codigo='" + codigo+"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public DefaultTableModel listarArticulo() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "Nombre", "precio", "Cantidad","Descripcion","Categoria"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo,nombre,precio,"
                            + "cantidad,descripcion,categoria from Articulo order by codigo"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codigo"),
                    conexion.getResultadoDB().getString("nombre"),
                    conexion.getResultadoDB().getString("precio"),
                    conexion.getResultadoDB().getString("cantidad"),
                    conexion.getResultadoDB().getString("descripcion"),
                    conexion.getResultadoDB().getInt("categoria")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }

        return temporal;

    }
    
      public boolean guardarVenta(String codigo, String fecha, 
             int cantidad,String nombre, double valor) {
        Venta venta = new Venta(codigo, fecha, cantidad, nombre, valor);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("insert into Venta(codigo, fecha, cantidad, nombre, valor) "
                + "values('" + venta.getCodigo() + "','" +
                venta.getFechaVenta() + "','" +
                venta.getCantVentas()+ "'," +
                venta.getNombre()+","+             
                 venta.getValor()+")");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public List<String> buscarVenta(String codigo) {
        
        List<String> temp = new ArrayList<String>();
        
        conexion.conectar();

        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo,fecha,cantidad,"
                            + "nombre,valor from Venta where "
                            + "codigo='" + codigo + "'"));//consulta          

            if (conexion.getResultadoDB().next()) {
                temp.add(conexion.getResultadoDB().getString("codigo"));
                temp.add(conexion.getResultadoDB().getString("fecha"));
                temp.add(conexion.getResultadoDB().getString("cantidad"));
                temp.add(conexion.getResultadoDB().getString("nombre"));
                temp.add(conexion.getResultadoDB().getInt("valor")+"");
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName())
                    .log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }
        return temp;
    }

 public boolean modificarVenta(String codigo, String fecha,int cantidad, String nombre, double valor) {
       Venta venta = new Venta(codigo, fecha, cantidad, nombre, valor);
        conexion.conectar();
        try {
            conexion.getSentenciaSQL().execute
        ("update Venta set fecha='" +  venta.getFechaVenta()+ "'," +            
                "cantidad=" + venta.getCantVentas()+","+
                "nombre="+venta.getNombre()+","+
                "valor="+venta.getValor()+
                " where codigo='" + venta.getCodigo()+"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

 public boolean eliminarVenta(String codigo) {

        conexion.conectar();

        try {
            conexion.getSentenciaSQL().execute
        ("delete from articulo where codigo='" + codigo+"'");//consulta
            conexion.desconectar();//se desconecta de la base de datos          
            return true;
        } catch (SQLException ex) {
            conexion.desconectar();//se desconecta de la base de datos          
            return false;
        }
    }

    public DefaultTableModel listarVenta() {
        DefaultTableModel temporal;
        String nombreColumnas[] = {"Codigo", "fecha", "Cantidad", "Nombre","Valor"};
        temporal = new DefaultTableModel(
                new Object[][]{}, nombreColumnas);
        conexion.conectar();
        try {
            conexion.setResultadoDB(conexion.getSentenciaSQL().
                    executeQuery("select codigo,fecha,cantidad,"
                            + "nombre,valor from Venta order by codigo"));//consulta        
            while (conexion.getResultadoDB().next()) {
                temporal.addRow(new Object[]{
                    conexion.getResultadoDB().getString("codigo"),
                    conexion.getResultadoDB().getString("Fecha"),
                    conexion.getResultadoDB().getString("cantidad"),
                    conexion.getResultadoDB().getString("nombre"),
                    conexion.getResultadoDB().getInt("valor")});
            }
            conexion.desconectar();//se desconecta de la base de datos                
        } catch (SQLException ex) {            
            Logger.getLogger(Controlador.class.getName()).
                    log(Level.SEVERE, null, ex);
            conexion.desconectar();//se desconecta de la base de datos
        }

        return temporal;

    }
    
    
    
    
    public boolean validarLoging(String correo, String contraseña) {

        List<Usuario> usuarios = new ArrayList<Usuario>();

        conexion.conectar();

        try {

            conexion.setResultadoDB(conexion.getSentenciaSQL().executeQuery("select cedula, nombre, apellido, correo, contraseña "
                    + "from Usuario"));

            while (conexion.getResultadoDB().next()) {

                String cedula = conexion.getResultadoDB().getString("cedula");
                String nombre = conexion.getResultadoDB().getString("nombre");
                String apellido = conexion.getResultadoDB().getString("apellido");
                String correoAux = conexion.getResultadoDB().getString("correo");
                String contraseñaAux = conexion.getResultadoDB().getString("contraseña");

                Usuario temp = new Usuario(cedula, nombre, apellido, correoAux, contraseñaAux);

                usuarios.add(temp);

            }
            for (int i = 0; i < usuarios.size(); i++) {
                if (usuarios.get(i).getCorreo().equals(correo) && usuarios.get(i).getContraseña().equals(contraseña)) {
                                  
                        conexion.desconectar();
                        return true;
                    
                } 
            }
            conexion.desconectar();
            

        } catch (SQLException ex) {

            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            conexion.desconectar();
            return false;

        }
        return false;

    }
}
