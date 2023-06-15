package Servicios;

import Entidades.Alumnos;
import Entidades.Votos;
import enumNombres.EnumApellidos;
import enumNombres.EnumNombres;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Simulador {

    public ArrayList<String> generarListaAlumnos() {

        /**
         * La clase Simulador debe tener un método que genere un listado de
         * alumnos manera aleatoria y lo retorne. Las combinaciones de nombre y
         * apellido deben ser generadas de manera aleatoria. Nota: usar listas
         * de tipo String para generar los nombres y los apellidos.
         */
        ArrayList<String> alumnoLista = new ArrayList();
        Random random = new Random();

        EnumNombres[] nombres = EnumNombres.values();
        EnumApellidos[] apellidos = EnumApellidos.values();

        for (int i = 0; i < nombres.length; i++) {
            EnumNombres alumnoNombres = nombres[random.nextInt(nombres.length)];
            EnumApellidos alumnoApellido = apellidos[random.nextInt(apellidos.length)];

            alumnoLista.add(alumnoNombres.toString() + " " + alumnoApellido.toString());
        }

        return alumnoLista;
    }

    public ArrayList<Integer> generarListaDNI(ArrayList<String> alumnoLista) {

        /**
         * Ahora hacer un generador de combinaciones de DNI posibles, deben
         * estar dentro de un rango real de números de documentos. Y agregar a
         * los alumnos su DNI. Este método debe retornar la lista de dnis.
         */
        // RECIVO LA LISTA DE ALUMNOS PARA SABER
        // LA CANTIDAD DE DNIs QUE TENGO QUE GENERAR
        ArrayList<Integer> DNIsLista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < alumnoLista.size(); i++) {
            int dniNumero = random.nextInt(99999999) + 1;
            DNIsLista.add(dniNumero);
        }

        return DNIsLista;
    }

    public ArrayList<Alumnos> crearAlumno(ArrayList<Integer> Dnis, ArrayList<String> alumnos) {

        /**
         * Ahora tendremos un método que, usando las dos listas generadas, cree
         * una cantidad de objetos Alumno, elegidos por el usuario, y le asigne
         * los nombres y los dnis de las dos listas a cada objeto Alumno. No
         * puede haber dos alumnos con el mismo dni, pero si con el mismo
         * nombre.
         */
        // RECIVO LAS DOS LISTAS PARA FORMAR UNA NUEVA DE TIPO ALUMNO.
        Alumnos alum;
        ArrayList<Alumnos> alumnosCompleta = new ArrayList<>();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random random = new Random();
        int num;

        // USO EL MOTODO RANDOM PARA GENERAR ALEATORIO NOMBRES Y DNIs
        System.out.println("-- CREANDO LISTA DE ALUMNOS -- ");
        System.out.println("Cuantos Alumnos desea Crear ? : ");
        num = leer.nextInt();

        for (int i = 0; i < num; i++) {
            int indiceAleatorio = random.nextInt(alumnos.size());
            String nombreAleatorio = alumnos.get(indiceAleatorio);
            alum = new Alumnos();
            alum.setNombreCompleto(nombreAleatorio);

            // ELIMINO DE LA LISTA DE DNIS PARA QUE NO TENER REPETIDOS
            indiceAleatorio = random.nextInt(Dnis.size());
            int dniAleatorio = Dnis.get(indiceAleatorio);
            alum.setDni(dniAleatorio);
            Dnis.remove(indiceAleatorio);

            alumnosCompleta.add(alum);
        }

        return alumnosCompleta;
    }

    public void mostrarAlumnos(ArrayList<Alumnos> alumnos) {
        /**
         * Se debe imprimir por pantalla el listado de alumnos.
         */
        System.out.println("-- LISTADO DE ALUMNOS --");
        for (Alumnos alumno : alumnos) {
            System.out.print("Nombre : " + alumno.getNombreCompleto() + " DNI : " + alumno.getDni() + "\n");
        }
    }

    public ArrayList<Alumnos> votacion(ArrayList<Alumnos> alumnos) {
        /**
         * Crearemos un método votación en la clase Simulador que, recibe el
         * listado de alumnos y para cada alumno genera tres votos de manera
         * aleatoria. En este método debemos guardar al alumno que vota, a los
         * alumnos a los que votó y sumarle uno a la cantidad de votos a cada
         * alumno que reciba un voto, que es un atributo de la clase Alumno.
         * Tener en cuenta que un alumno no puede votarse a sí mismo o votar más
         * de una vez al mismo alumno. Utilizar un hashset para resolver esto.
         */
        System.out.print("Realizando votaciones");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("");
        //Creo objetos
        Random random = new Random();
        //HashSet<Alumnos> votados = new HashSet();
        Alumnos alumVoto = new Alumnos();
        int prueba = 0;

        for (Alumnos alumno : alumnos) {
            HashSet<Alumnos> votados = new HashSet();
            //Mientras el conjunto no tenga 3 alumnos votados por el mismo alumno
            while (votados.size() < 3) {
                //Tomo un alumno random de la lista
                alumVoto = alumnos.get(random.nextInt(alumnos.size()));
                //Si el alumno no se vota a si mismo, se introduce el alumno al conjunto
                if (alumno.getDni() != alumVoto.getDni()) {
                    votados.add(alumVoto);
                }
            }
            for (Alumnos votado : votados) {
                votado.setCantidadVotos(votado.getCantidadVotos() + 1);
            }
            Votos votos = new Votos(alumno, votados);
            alumno.setVotos(votos);

        }

        return alumnos;
    }

    public void mostrarVotos(ArrayList<Alumnos> alumnos) {
        /**
         * Se debe crear un método que muestre a cada Alumno con su cantidad de
         * votos y cuales fueron sus 3 votos.
         */

        for (Alumnos alumno : alumnos) {
            System.out.println("El alumno " + alumno.getNombreCompleto() + " recibió " + alumno.getCantidadVotos() + " votos.");
            System.out.println("Y votó a: ");
            for (Alumnos votado : alumno.getVotos().getVotados()) {
                System.out.println(votado.getNombreCompleto());
            }
        }
    }

    public void recuentoVotos(ArrayList<Alumnos> alumnos) {
        /**
         * Se debe crear un método que haga el recuento de votos, este recibe la
         * lista de Alumnos y comienza a hacer el recuento de votos.
         */
        int votos = 0;
        for (Alumnos alumno : alumnos) {
            votos += alumno.getCantidadVotos();
        }
        System.out.println("Se realizaron un total de: " + votos + " votos");
    }

    public void facilitadores(ArrayList<Alumnos> alumnos) {
        /**
         * Se deben crear 5 facilitadores con los 5 primeros alumnos votados y
         * se deben crear 5 facilitadores suplentes con los 5 segundos alumnos
         * más votados. A continuación, mostrar los 5 facilitadores y los 5
         * facilitadores suplentes.
         */
        Comparator<Alumnos> comparator = Comparator.comparing(Alumnos::getCantidadVotos).reversed();
        alumnos.sort(comparator);
        int i = 0;
        System.out.println("Los facilitadores serán: ");
        for (Alumnos alumno : alumnos) {
            System.out.println(alumno.getNombreCompleto() + ". DNI: " + alumno.getDni());
            if (i == 4) {
                System.out.println("Los facilitadores suplentes serán: ");
            }
            i += 1;
            if (i > 9) {
                break;
            }
        }
    }

    /*
    public void votacion(ArrayList<Alumnos> alumnos) {
        /**
         * Crearemos un método votación en la clase Simulador que, recibe el
         * listado de alumnos y para cada alumno genera tres votos de manera
         * aleatoria. En este método debemos guardar a el alumno que vota, a los
         * alumnos a los que votó y sumarle uno a la cantidad de votos a cada
         * alumno que reciba un voto, que es un atributo de la clase Alumno.
         * Tener en cuenta que un alumno no puede votarse a sí mismo o votar más
         * de una vez al mismo alumno. Utilizar un hashset para resolver esto.
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        mostrarAlumnos(alumnos);
        HashSet<Alumnos> alumnosVotados = new HashSet();

        for (Alumnos alumno : alumnos) {
            mostrarAlumnos(alumnos);
            //Le pido a cada alumno que elija 3 compañeros a votar
            System.out.println(alumno.getNombreCompleto() + " elija 3 alumnos a votar por su DNI. \nNota: no puede votarse usted.");
            //Uso un for con 3 vueltas que introduza los 3 alumnos
            for (int i = 0; i < 3; i++) {
                //Guardo el nombre en una variable para buscarlo en la lista y sumarle un voto
//                System.out.print("Nombre Completo: ");
//                String nombre = leer.next();
//                System.out.print("DNI: ");
                int dni = leer.nextInt();
                //Compruebo que el alumno no se vote a si mismo
                while (alumno.getDni() == dni) {
                    System.out.println("No se puede votar a usted mismo. Elija otro compañero.");
                    mostrarAlumnos(alumnos);
                    dni = leer.nextInt();
                }
                //Uso un for-each para buscar cada alumno en la lista
                for (Alumnos alumno2 : alumnos) {
                    //Compruebo el nombre del alumno votado en la lisa
                    if (alumno2.getDni() == dni) {
                        //Sumo 1 a la cantidad de votos que tenia el alumno
                        alumno.setCantidadVotos(alumno.getCantidadVotos() + 1);
                        //Agrego ese alumno a un conjuto para poder guardarlo en el objeto votos
                        alumnosVotados.add(alumno);
                    }
                }
                //Creo un obejeto Votos para guardar cada alumno con los votos que hizo
                Votos votos = new Votos(alumno, alumnosVotados);
                alumno.setVotos(votos);
            }
        }
    }
     */
}
