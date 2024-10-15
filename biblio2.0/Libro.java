
public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int añoPublicacion;
    private Categoria categoria;

    public Libro(String titulo, String autor, String ISBN, int añoPublicacion, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.añoPublicacion = añoPublicacion;
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
