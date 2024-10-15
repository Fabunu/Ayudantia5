public class Empleado {
	private String _nombre;
	private String _identificacion;
	private String _cargo;
	public Biblioteca _unnamed_Biblioteca_;

	public Empleado(String aNombre, String aIdentificacion, String aCargo) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getIdentificacion() {
		return this._identificacion;
	}

	public void setIdentificacion(String aIdentificacion) {
		this._identificacion = aIdentificacion;
	}

	public String getCargo() {
		return this._cargo;
	}

	public void setCargo(String aCargo) {
		this._cargo = aCargo;
	}
}