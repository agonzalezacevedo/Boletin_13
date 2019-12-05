package bolt13;

/**
 * @author agonzalezacevedo
 */
public class Xogador extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Xogador() {
    }

    public Xogador(int dorsal, String demarcacion, int id, String nome, String apellido, int edade) {
        super(id, nome, apellido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

    public void xogaPartidos() {
        System.out.println("O xogador xoga partidos");
    }

    public void entrenar() {
        System.out.println("O xogador entrena");
    }

    @Override
    public void concentrarse() {
        System.out.println("O xogador concentrase");
    }

    @Override
    public void viaxar() {
        System.out.println("O xogador viaxa");
    }
}
