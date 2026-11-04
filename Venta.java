import java.util.ArrayList;
import java.util.List;

public class Venta {

    // Atributos
    private int idVenta;
    private String fecha;
    private double total;
    private Usuario usuario;
    private List<DetalleVenta> detalles;

    // Constructor
    public Venta(int idVenta, String fecha, Usuario usuario) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.usuario = usuario;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos
    public void registrarVenta() {
        calcularTotal();
        System.out.println("Venta registrada. Total: " + total);
    }

    public void consultarVenta() {
        System.out.println("Venta: " + idVenta);
        System.out.println("Fecha: " + fecha);
        System.out.println("Total: " + total);
    }

    public void modificarVenta(String fecha) {
        this.fecha = fecha;
    }

    public void eliminarVenta() {
        detalles.clear();
        total = 0.0;
        System.out.println("Venta eliminada: " + idVenta);
    }

    public double calcularTotal() {
        total = 0.0;

        for (DetalleVenta detalle : detalles) {
            total += detalle.calcularSubtotal();
        }

        return total;
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
        calcularTotal();
    }

    // Getters y Setters
    public int getIdVenta() {
        return idVenta;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}