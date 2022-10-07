package Modelo;

public class Venta {

 private String codigo;
private String fecha;
private int cantidad;
private String Nombre;
private double valor;

    public Venta(String codigo, String fechaVenta, int cantidad, String Nombre, double valor) {
        this.codigo = codigo;
        this.fecha = fechaVenta;
        this.cantidad = this.cantidad;
        this.Nombre = Nombre;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaVenta() {
        return fecha;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fecha = fechaVenta;
    }

    public int getCantVentas() {
        return cantidad;
    }

    public void setCantVentas(int cantVentas) {
        this.cantidad = cantVentas;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
