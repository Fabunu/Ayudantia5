import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String identificacion;
    private ArrayList<Prestamo> prestamos;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.prestamos = new ArrayList<>();
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
}
