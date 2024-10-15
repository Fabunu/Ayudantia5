import java.time.LocalDate;

public class Prestamo {
	private LocalDate _fechaPrestamo;
	private LocalDate _fechaDevolucion;
	public Usuario _unnamed_Usuario_;
	public Multa _unnamed_Multa_;
	public Libro _unnamed_Libro_;

	public Prestamo(LocalDate aFechaPrestamo, LocalDate aFechaDevolucion) {
		throw new UnsupportedOperationException();
	}

	public LocalDate getFechaPrestamo() {
		return this._fechaPrestamo;
	}

	public void setFechaPrestamo(LocalDate aFechaPrestamo) {
		this._fechaPrestamo = aFechaPrestamo;
	}

	public LocalDate getFechaDevolucion() {
		return this._fechaDevolucion;
	}

	public void setFechaDevolucion(LocalDate aFechaDevolucion) {
		this._fechaDevolucion = aFechaDevolucion;
	}
}