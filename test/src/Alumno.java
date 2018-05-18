public class Alumno {

    int id;
    String dni;
    String nombre;
    String apellido;
    double promedio;


    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getId() {

        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public Alumno (int newId, String newDni, String newNombre, String newApellido, double newPromedio) {
        id = newId;
        dni = newDni;
        nombre = newNombre;
        apellido = newApellido;
        promedio = newPromedio;
    }


    public String getFullData() {

        String fullData = String.format("%02d", id) + " - " + nombre + " " + apellido + ", " + dni + " (Promedio: " + promedio + ")" ;

        return fullData;

    }


    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
