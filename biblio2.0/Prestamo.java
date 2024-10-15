import java.time.LocalDate;

public class Prestamo {
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = LocalDate.now();
        this.fechaDevolucion = fechaPrestamo.plusDays(14);
    }

    // Getters
    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public boolean estaAtrasado() {
        return LocalDate.now().isAfter(fechaDevolucion);
    }
}
