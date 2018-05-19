import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {


        ArrayList<Alumno> lista = new ArrayList<>();
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
        lista.add(new Alumno(14,"20123469","Sol", "Solsticiosss",9.3));
        lista.add(new Alumno(15,"20123470","Paula", "Gonzalez",9.4));
        lista.add(new Alumno(1,"20123456","Nombre1", "Apellido1",6));


        System.out.print("-----------------------------\nTodos los alumnos de la lista\n-----------------------------\n");

        lista.forEach(s -> {
            System.out.println(s.getFullData());
        });

        //The same, but in one line:
        //lista.stream().forEach(s -> {System.out.println(s);});

        System.out.print("-----------------------------\nNombres que empiezan con G o L\n-----------------------------\n");

        lista.forEach(s -> {
            String apellido = s.getApellido().toUpperCase();
            if(apellido.startsWith("G") || apellido.startsWith("L")) {
                System.out.println(s.getFullData());
            }
        });

        System.out.print("-----------------------------\nTamaño de la lista\n-----------------------------\n");
        System.out.println(lista.size());

        System.out.print("-----------------------------\nAlumnos con promedio mas de 9\n-----------------------------\n");
        lista.stream().forEach(s -> {
            if (s.getPromedio() > 9) {
                System.out.println(s);
            }
        });

        System.out.print("-----------------------------\nDos primeros alumnos de la lista\n-----------------------------\n");
        lista.stream().limit(2).forEach(s -> {System.out.println(s);});


        System.out.print("-----------------------------\nAlumnos con menor id \n-----------------------------\n");
        lista.stream().sorted(Comparator.comparing(s -> s.getId())).limit(2).forEach(s -> {System.out.println(s);});

        System.out.print("-----------------------------\n Alumnos con apellidos con menos de 10 caracteres \n-----------------------------\n");
        lista.stream().filter( a -> a.getApellido().length() < 10).forEach(s -> {System.out.println(s);});

        System.out.print("-----------------------------\n Does it contain an M? \n-----------------------------\n");
        lista.stream().filter( a -> a.getApellido().toLowerCase().contains("m")).forEach(s -> {System.out.println(s);});



    }
}

