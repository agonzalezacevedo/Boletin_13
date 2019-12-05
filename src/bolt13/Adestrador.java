package bolt13;

/**
 * @author agonzalezacevedo
 */
public class Adestrador extends SeleccionFutbol {

    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion, int id, String nome, String apellido, int edade) {
        super(id, nome, apellido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }

    public void dirixirPartido() {
        System.out.println("O adestrador dirixe o partido");
    }

    public void dirixirAdestramento() {
        System.out.println("O adestrador dirixe o adestramento");
    }

    @Override
    public void concentrarse() {
        System.out.println("O adestrador concentrase");
    }

    @Override
    public void viaxar() {
        System.out.println("O adestrador viaxa");
    }
}
