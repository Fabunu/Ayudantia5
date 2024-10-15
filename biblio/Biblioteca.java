import java.util.ArrayList;

public class Biblioteca {
	private String _nombre;
	private String _direccion;
	public ArrayList<Libro> _unnamed_Libro_ = new ArrayList<Libro>();
	public ArrayList<Empleado> _unnamed_Empleado_ = new ArrayList<Empleado>();

	public Biblioteca(String aNombre, String aDireccion) {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getDireccion() {
		return this._direccion;
	}

	public void setDireccion(String aDireccion) {
		this._direccion = aDireccion;
	}

	public void agregarLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void modificarLibro(Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void eliminarLibro(String aISBN) {
		throw new UnsupportedOperationException();
	}

	public void realizarPrestamo(Usuario aUsuario, Libro aLibro) {
		throw new UnsupportedOperationException();
	}

	public void agregarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void modificarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void eliminarEmpleado(Empleado aEmpleado) {
		throw new UnsupportedOperationException();
	}

	public void agregarCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void editarCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCategoria(Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}
}