import java.time.LocalDate;

public class Multa {
    private double monto;
    private LocalDate fechaGeneracion;
    private boolean estado; // true: pagada, false: no pagada
    private Prestamo prestamo;

    public Multa(double monto, Prestamo prestamo) {
        this.monto = monto;
        this.fechaGeneracion = LocalDate.now();
        this.estado = false; // Inicialmente no pagada
        this.prestamo = prestamo;
    }

    public void pagar() {
        this.estado = true;
    }

    public boolean isPagada() {
        return estado;
    }

    // Getters
    public double getMonto() {
        return monto;
    }

    public LocalDate getFechaGeneracion() {
        return fechaGeneracion;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }
}
