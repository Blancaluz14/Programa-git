public class Usuario {

    // Atributos
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private Rol rol;

    // Constructor
    public Usuario(int idUsuario, String nombre, String apellido,
                   String usuario, String contrasena, Rol rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Métodos
    public boolean iniciarSesion() {
        return usuario != null && !usuario.isEmpty()
                && contrasena != null && !contrasena.isEmpty();
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }

    public void registrarUsuario() {
        System.out.println("Usuario registrado: " + nombre);
    }

    public void actualizarUsuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Rol getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}