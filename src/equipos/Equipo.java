package equipos;

import ciclistas.Ciclista;
import interfaces.Competencia;

import java.util.ArrayList;
import java.util.List;

public class Equipo implements Competencia {

    private String nombreEquipo;
    private String pais;
    private static int tiempoTotalEquipo = 0;
    private List<Ciclista> ciclistas;

    public Equipo(String nombreEquipo, String pais) {
        this.nombreEquipo = nombreEquipo;
        this.pais = pais;
        this.ciclistas = new ArrayList<>();
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTiempoTotalEquipo() {
        return tiempoTotalEquipo;
    }

    public static void setTiempoTotalEquipo(int tiempoTotalEquipo) {
        Equipo.tiempoTotalEquipo = tiempoTotalEquipo;
    }

    public void anadirCiclista(Ciclista ciclista){
        ciclistas.add(ciclista);
        tiempoTotalEquipo += ciclista.getTiempoAcumulado();
    }

    public void imprimirDatosEquipo(){
        System.out.println("Nombre del equipo: " + nombreEquipo);
        System.out.println("Pais: " + pais);
        System.out.println("Tiempo total del equipo: " + tiempoTotalEquipo);
        System.out.println("Ciclistas: ");
        for (Ciclista ciclista: ciclistas){
            ciclista.imprimirDatos();
        }
    }

    public void listarNombresCiclistas() {
        System.out.println("Nombres de los ciclistas del equipo: ");
        for (Ciclista ciclista: ciclistas){
            System.out.println(ciclista.getNombre());
        }
    }

    public void imprimirDatosCiclistaPorId(int id){
        for (Ciclista ciclista: ciclistas) {
            if (ciclista.getIdentificador() == id){
                ciclista.imprimirDatos();
                return;

            }
        }
        System.out.println("ciclistas.Ciclista con el ID " + id + " no encontrado.");

    }

    @Override
    public void calcularTiempoTotal() {

        for (Ciclista ciclista : ciclistas){
            tiempoTotalEquipo += ciliclista.getTiempoAcumulado();
        }
    }

    @Override
    public void listarParticipantes() {
        listarNombresCiclistas();
    }
}
