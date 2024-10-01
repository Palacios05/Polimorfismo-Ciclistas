package ciclistas;

public class Escalador extends Ciclista{

    private float aceleracionPromedio; // valor de acelaron de promedio m/s2
    private float gradoRampa; // valor unidad medida en grados

    public Escalador(int identificador, String nombre, float aceleracionPromedio, float gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    public float getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(float aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public float getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(float gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    public String imprimirTipo() {
        return "Es un ciclistas.Escalador";
    }

    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Aceleracion Promedio: " + aceleracionPromedio);
        System.out.println("Grado Rampa: " + gradoRampa);
    }

    
}
