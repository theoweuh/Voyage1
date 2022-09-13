public class Sejour {
    private int nbnuit;
    private double prixnuit;

    public Sejour(int nbNuit, double prixNuit) {
        this.nbnuit = nbNuit;
        this.prixnuit = prixNuit;
    }

    public int getUnNombreNuit() {
        return nbnuit;
    }

    public double getUnPrixNuit() {
        return prixnuit * nbnuit;
    }

}