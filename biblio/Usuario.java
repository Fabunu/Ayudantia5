import java.util.ArrayList;

public class Usuario {
	private String _nombre;
	private String _identificacion;
	public ArrayList<Prestamo> _unnamed_Prestamo_ = new ArrayList<Prestamo>();
	public ArrayList<Multa> _unnamed_Multa_ = new ArrayList<Multa>();

	public Usuario(String aNombre, String aIdentificacion) {
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
}