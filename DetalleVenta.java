public class DetalleVenta {

    // Atributos
    private int idDetalle;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private Producto producto;

    // Constructor
    public DetalleVenta(int idDetalle, int cantidad,
                        double precioUnitario, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.producto = producto;
        calcularSubtotal();
    }

    // Métodos
    public double calcularSubtotal() {
        subtotal = cantidad * precioUnitario;
        return subtotal;
    }

    public void actualizarCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularSubtotal();
    }

    // Getters y Setters
    public int getIdDetalle() {
        return idDetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        calcularSubtotal();
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
        calcularSubtotal();
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}