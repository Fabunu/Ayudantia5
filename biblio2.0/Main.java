
public class Main {
    public static void main(String[] args) {
        // Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central", "Calle Falsa 123");
        System.out.println("Bienvenido a " + biblioteca.getNombre());

        // Crear categorías
        Categoria categoriaFiccion = new Categoria("Ficción", "Novelas y cuentos");
        Categoria categoriaNoFiccion = new Categoria("No Ficción", "Libros informativos");
        Categoria categoriaCiencia = new Categoria("Ciencia", "Libros científicos y técnicos");
        biblioteca.agregarCategoria(categoriaFiccion);
        biblioteca.agregarCategoria(categoriaNoFiccion);
        biblioteca.agregarCategoria(categoriaCiencia);

        // Crear libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", "1234567890", 1967, categoriaFiccion);
        Libro libro2 = new Libro("Sapiens", "Yuval Noah Harari", "0987654321", 2011, categoriaNoFiccion);
        Libro libro3 = new Libro("El origen de las especies", "Charles Darwin", "5432167890", 1859, categoriaCiencia);
        Libro libro4 = new Libro("1984", "George Orwell", "1230984567", 1949, categoriaFiccion);
        Libro libro5 = new Libro("Breves respuestas a las grandes preguntas", "Stephen Hawking", "9876543210", 2018, categoriaCiencia);

        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);

        // Mostrar todos los libros en la biblioteca
        System.out.println("\nLibros en la biblioteca:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println("- " + libro.getTitulo() + " (Autor: " + libro.getAutor() + ", ISBN: " + libro.getISBN() + ", Año: " + libro.getAñoPublicacion() + ", Categoría: " + libro.getCategoria().getNombre() + ")");
        }

        // Crear empleados
        Empleado empleado1 = new Empleado("Ana Gómez", "001", "Bibliotecario");
        Empleado empleado2 = new Empleado("Luis Rodríguez", "002", "Asistente");
        Empleado empleado3 = new Empleado("María Fernández", "003", "Gerente de Biblioteca");

        biblioteca.agregarEmpleado(empleado1);
        biblioteca.agregarEmpleado(empleado2);
        biblioteca.agregarEmpleado(empleado3);

        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan Pérez", "A001");
        Usuario usuario2 = new Usuario("Laura Martínez", "A002");
        Usuario usuario3 = new Usuario("Pedro Sánchez", "A003");

        // Crear préstamos
        Prestamo prestamo1 = new Prestamo(libro1, usuario1);
        usuario1.agregarPrestamo(prestamo1);
        System.out.println("\nPréstamo realizado: " + usuario1.getNombre() + " ha tomado prestado " + prestamo1.getLibro().getTitulo());

        Prestamo prestamo2 = new Prestamo(libro2, usuario2);
        usuario2.agregarPrestamo(prestamo2);
        System.out.println("Préstamo realizado: " + usuario2.getNombre() + " ha tomado prestado " + prestamo2.getLibro().getTitulo());

        // Simular la devolución de un libro
        System.out.println("\nDevolución de libro:");
        System.out.println(usuario1.getNombre() + " devuelve " + prestamo1.getLibro().getTitulo());

        // Crear multas
        Multa multa1 = new Multa(10.0, prestamo1);
        System.out.println("Se ha generado una multa de " + multa1.getMonto() + " para " + usuario1.getNombre() + " por el préstamo de " + prestamo1.getLibro().getTitulo());

        // Pagar multa
        multa1.pagar();

        // Modificar libro
        biblioteca.modificarLibro(libro1, "Cien años de soledad - Edición Especial", "Gabriel García Márquez", libro1.getISBN(), 1967, categoriaFiccion);
        
        // Modificar empleado
        biblioteca.modificarEmpleadoCargo(empleado1, "Jefe de Biblioteca");
        
        // Eliminar libro
        biblioteca.eliminarLibro(libro2);
        
        // Eliminar categoría
        biblioteca.eliminarCategoria(categoriaNoFiccion);
        
        // Mostrar libros después de las modificaciones
        System.out.println("\nLibros en la biblioteca después de las modificaciones:");
        for (Libro libro : biblioteca.getLibros()) {
            System.out.println("- " + libro.getTitulo() + " (Autor: " + libro.getAutor() + ", ISBN: " + libro.getISBN() + ", Año: " + libro.getAñoPublicacion() + ", Categoría: " + libro.getCategoria().getNombre() + ")");
        }
    }
}
