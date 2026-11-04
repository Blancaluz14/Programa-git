public class Producto {

    // Atributos
    private int idProducto;
    private String nombreProducto;
    private double precio;
    private int stock;
    private Categoria categoria;

    // Constructor
    public Producto(int idProducto, String nombreProducto,
                    double precio, int stock, Categoria categoria) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    // Métodos
    public void registrarProducto() {
        System.out.println("Producto registrado: " + nombreProducto);
    }

    public void editarProducto(String nombreProducto, double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public void eliminarProducto() {
        System.out.println("Producto eliminado: " + nombreProducto);
    }

    public void consultarProducto() {
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    // Getters y Setters
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}