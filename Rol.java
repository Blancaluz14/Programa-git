public class Rol {

    // Atributos
    private int idRol;
    private String nombreRol;

    // Constructor
    public Rol(int idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    // Métodos
    public void crearRol() {
        System.out.println("Rol creado: " + nombreRol);
    }

    public void editarRol(String nuevoNombre) {
        this.nombreRol = nuevoNombre;
    }

    public void eliminarRol() {
        System.out.println("Rol eliminado: " + nombreRol);
    }

    // Getters y Setters
    public int getIdRol() {
    return idRol;
}

    

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
}
