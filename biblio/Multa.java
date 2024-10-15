import java.time.LocalDate;

public class Multa {
	private double _monto;
	private LocalDate _fechaGeneracion;
	private boolean _estado;
	public Usuario _unnamed_Usuario_;
	public Prestamo _unnamed_Prestamo_;

	public Multa(double aMonto, LocalDate aFechaGeneracion, boolean aEstado) {
		throw new UnsupportedOperationException();
	}

	public double getMonto() {
		return this._monto;
	}

	public void setMonto(double aMonto) {
		this._monto = aMonto;
	}

	public LocalDate getFechaGeneracion() {
		return this._fechaGeneracion;
	}

	public void setFechaGeneracion(LocalDate aFechaGeneracion) {
		this._fechaGeneracion = aFechaGeneracion;
	}

	public boolean getEstado() {
		return this._estado;
	}

	public void setEstado(boolean aEstado) {
		this._estado = aEstado;
	}

	public void generarMulta(Prestamo aPrestamo) {
		throw new UnsupportedOperationException();
	}

	public void pagarMulta() {
		throw new UnsupportedOperationException();
	}

	public void eliminarMulta() {
		throw new UnsupportedOperationException();
	}
}