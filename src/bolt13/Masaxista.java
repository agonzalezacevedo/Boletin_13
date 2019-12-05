package bolt13;

/**
 * @author agonzalezacevedo
 */
public class Masaxista extends SeleccionFutbol {

    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apellido, int edade) {
        super(id, nome, apellido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

    public void darMasaxes() {
        System.out.println("O maxasista da masaxes");
    }

    @Override
    public void concentrarse() {
        System.out.println("O masaxista concentrase");
    }

    @Override
    public void viaxar() {
        System.out.println("O maxasista viaxa");
    }
}
