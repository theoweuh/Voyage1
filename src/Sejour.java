public class Sejour extends OptionVoyage {
    private int nbnuit;
    private double prixnuit;

    public Sejour(String unNom, double unPrix, int nbNuit, double prixNuit) {
        super(unNom, unPrix);
        this.nbnuit = nbNuit;
        this.prixnuit = prixNuit;
    }

    public int getUnNombreNuit() {
        return nbnuit;
    }

    public double getUnPrixNuit() {
        return prixnuit * nbnuit + super.prix();
    }

}