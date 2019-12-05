package bolt13;

/**
 * @author agonzalezacevedo
 */
public class SeleccionFutbol {

    private int id;
    private String nome;
    private String apellido;
    private int edade;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, String nome, String apellido, int edade) {
        this.id = id;
        this.nome = nome;
        this.apellido = apellido;
        this.edade = edade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    @Override
    public String toString() {
        return "SeleccionFutbol{" + "id=" + id + ", nome=" + nome + ", apellido=" + apellido + ", edade=" + edade + '}';
    }

    public void concentrarse() {
        System.out.println("A seleccion de futbol se concentra");
    }

    public void viaxar() {
        System.out.println("A seleccion de futbol viaxa");
    }

}
