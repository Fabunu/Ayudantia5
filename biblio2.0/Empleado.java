public class Empleado {
    private String nombre;
    private String identificacion;
    private String cargo;

    public Empleado(String nombre, String identificacion, String cargo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.cargo = cargo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
