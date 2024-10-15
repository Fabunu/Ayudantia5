import java.util.ArrayList;

public class Libro {
	private String _titulo;
	private String _autor;
	private String _iSBN;
	private int _añoPublicacion;
	public Prestamo _unnamed_Prestamo_;
	public ArrayList<Biblioteca> _unnamed_Biblioteca_ = new ArrayList<Biblioteca>();
	public ArrayList<Categoria> _unnamed_Categoria_ = new ArrayList<Categoria>();

	public Libro(String aTitulo, String aAutor, String aIsbn, int aAñoPublicacion, Categoria aCategoria) {
		throw new UnsupportedOperationException();
	}

	public String getTitulo() {
		return this._titulo;
	}

	public void setTitulo(String aTitulo) {
		this._titulo = aTitulo;
	}

	public String getAutor() {
		return this._autor;
	}

	public void setAutor(String aAutor) {
		this._autor = aAutor;
	}

	public String getISBN() {
		return this._iSBN;
	}

	public void setISBN(String aISBN) {
		this._iSBN = aISBN;
	}

	public int getAñoPublicacion() {
		return this._añoPublicacion;
	}

	public void setAñoPublicacion(int aAñoPublicacion) {
		this._añoPublicacion = aAñoPublicacion;
	}
}