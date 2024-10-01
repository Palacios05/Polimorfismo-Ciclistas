package ciclistas;

public class Velocista extends Ciclista{

    private double  potenciaPromedio; // Unidad de medida de vatios
    private double velocidadPromedioSprint; //unidad de medida en km/h

    public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedioSprint) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedioSprint() {
        return velocidadPromedioSprint;
    }

    public void setVelocidadPromedioSprint(double velocidadPromedioSprint) {
        this.velocidadPromedioSprint = velocidadPromedioSprint;
    }

    @Override
    public String imprimirTipo() {
        return "Es un ciclistas.Velocista";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Potencia Promedio: " + potenciaPromedio);
        System.out.println("Velocidad Promedio Sprint: " + velocidadPromedioSprint);
    }
}

