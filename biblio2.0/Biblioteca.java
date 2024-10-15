import java.util.ArrayList;

public class Biblioteca {
    private String nombre;
    private String direccion;
    private ArrayList<Libro> libros;
    private ArrayList<Empleado> empleados;
    private ArrayList<Categoria> categorias;

    public Biblioteca(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.categorias = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro agregado: " + libro.getTitulo());
    }

    public void modificarLibro(Libro libro, String nuevoTitulo, String nuevoAutor, String nuevoISBN, int nuevoAñoPublicacion, Categoria nuevaCategoria) {
        libro.setTitulo(nuevoTitulo);
        libro.setAutor(nuevoAutor);
        libro.setISBN(nuevoISBN);
        libro.setAñoPublicacion(nuevoAñoPublicacion);
        libro.setCategoria(nuevaCategoria);
        System.out.println("Libro modificado: " + nuevoTitulo);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
        System.out.println("Libro eliminado: " + libro.getTitulo());
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
        System.out.println("Empleado agregado: " + empleado.getNombre());
    }

    public void modificarEmpleadoCargo(Empleado empleado, String nuevoCargo) {
        empleado.setCargo(nuevoCargo);
        System.out.println("Cargo de empleado modificado: " + empleado.getNombre() + " a " + nuevoCargo);
    }

    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
        System.out.println("Empleado eliminado: " + empleado.getNombre());
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
        System.out.println("Categoría agregada: " + categoria.getNombre());
    }

    public void modificarCategoria(Categoria categoria, String nuevoNombre, String nuevaDescripcion) {
        categoria.setNombre(nuevoNombre);
        categoria.setDescripcion(nuevaDescripcion);
        System.out.println("Categoría modificada: " + nuevoNombre);
    }

    public void eliminarCategoria(Categoria categoria) {
        categorias.remove(categoria);
        System.out.println("Categoría eliminada: " + categoria.getNombre());
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
}
