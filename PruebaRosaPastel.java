public class PruebaRosaPastel {

    public static void main(String[] args) {

        // Crear un rol
        Rol rol = new Rol(1, "Administrador");

        // Crear un usuario
        Usuario usuario = new Usuario(
            1, "Ana", "Lopez", "ana", "1234", rol
        );

        // Crear una categoría
        Categoria categoria = new Categoria(
            1, "Helados", "Helados de diferentes sabores"
        );

        // Crear un producto
        Producto producto = new Producto(
            1, "Helado de vainilla", 5000, 20, categoria
        );

        // Crear una venta
        Venta venta = new Venta(1, "31/10/2026", usuario);

        // Crear un detalle de venta
        DetalleVenta detalle = new DetalleVenta(
            1, 2, 5000, producto
        );

        // Agregar el detalle a la venta
        venta.agregarDetalle(detalle);

        // Mostrar resultados
        System.out.println("SISTEMA ROSA PASTEL");
        System.out.println("------------------------");

        rol.crearRol();
        usuario.registrarUsuario();
        categoria.registrarCategoria();
        producto.consultarProducto();

        venta.registrarVenta();

        System.out.println("------------------------");
        System.out.println("Subtotal: $" + detalle.calcularSubtotal());
        System.out.println("Total de la venta: $" + venta.getTotal());
    }
}