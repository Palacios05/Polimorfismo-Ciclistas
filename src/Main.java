public class Main {
    public static void main(String[] args) {

        System.out.println("Ejercicio practico sobre polimorfismo");

        Equipo equipo1 = new Equipo("Equipo A", "Colombia");

        Velocista velocista = new Velocista(1, "Juan Jose", 250.5, 60.0);
        Escalador escalador = new Escalador(2,"Esteban", 5.5f, 15f);
        Contrarrelojista contrarrelojista = new Contrarrelojista(3, "Carlos", 70.0);

        equipo1.anadirCiclista(velocista);
        equipo1.anadirCiclista(contrarrelojista);
        equipo1.anadirCiclista(escalador);

        equipo1.imprimirDatosEquipo();
    }
}