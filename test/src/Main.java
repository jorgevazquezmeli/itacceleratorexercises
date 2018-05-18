import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Alumno alumno = new Alumno(1,"1234567","Alumno 1", "Apellido 1", 9.9);


        ArrayList<Alumno> lista = new ArrayList<>();
        lista.add(new Alumno(1,"20123456","Nombre1", "Apellido1",6));
        lista.add(new Alumno(2,"20123457","Nombre2", "Apellido2",7));
        lista.add(new Alumno(3,"20123458","Juan", "Juarez",8));
        lista.add(new Alumno(4,"20123459","Pablo", "Perez",9));
        lista.add(new Alumno(5,"20123460","Lucas", "Luke",6.6));
        lista.add(new Alumno(6,"20123461","Martin", "Martinez",7.7));
        lista.add(new Alumno(7,"20123462","Jessica", "Jones",8.8));
        lista.add(new Alumno(8,"20123463","Ezequiel", "Exeter",7.6));
        lista.add(new Alumno(9,"20123464","Matias", "Mattt",6.7));
        lista.add(new Alumno(10,"20123465","Lucia", "Lozano",8.3));
        lista.add(new Alumno(11,"20123466","Mariela", "Mejia",7.3));
        lista.add(new Alumno(12,"20123467","Carla", "Cordoba",9.1));
        lista.add(new Alumno(13,"20123468","Sofia", "Loren",9.2));
        lista.add(new Alumno(14,"20123469","Sol", "Solsticio",9.3));
        lista.add(new Alumno(15,"20123470","Paula", "Gonzalez",9.4));

        //System.out.println(lista);

        /* Todos los alumnos de la lista */
        /*


        for (int counter = 0; counter < lista.size(); counter++) {
            System.out.println(lista.get(counter).getFullData());
        }
        */

        //lista.stream().map( (a) -> { System.out.println("g"); });


        System.out.print("-----------------------------\nTodos los alumnos de la lista\n-----------------------------\n");

        lista.forEach(s -> {
            System.out.println(s.getFullData());
        });

        System.out.print("-----------------------------\nNombres que empiezan con G o L\n-----------------------------\n");

        lista.forEach(s -> {
            String apellido = s.getApellido().toUpperCase();
            if(apellido.startsWith("G") || apellido.startsWith("L")) {
                System.out.println(s.getFullData());
            }
        });

        System.out.print("-----------------------------\nTamaño de la lista\n-----------------------------\n");
        System.out.println(lista.size());

        lista.stream().forEach(s -> {System.out.println(s);});
    }
}

