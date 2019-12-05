package bolt13;

/**
 * @author agonzalezacevedo
 */
public class Bolt13 {

    public static void main(String[] args) {
        SeleccionFutbol selec = new SeleccionFutbol();
        Xogador xog = new Xogador(24,"TWT",1,"Gabriel","Martinez",26);
        Adestrador adest= new Adestrador("Entrenador",45867,"Abelardo","Barciela",50);
        Masaxista masx = new Masaxista("Fisio",5,76544,"Manuel","Fernandez",35);
        selec.concentrarse();
        xog.concentrarse();
        adest.concentrarse();
        masx.concentrarse();
        selec.viaxar();
        xog.viaxar();
        adest.viaxar();
        masx.viaxar();
    }

}
