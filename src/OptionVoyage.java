
public class OptionVoyage {
    String nom;
    double prix;

    public OptionVoyage(String unNom, double unPrix) {
        this.nom = unNom;
        this.prix = unPrix;
    }

    public String getUnNom() {
        return nom;
    }

    public double prix() {
        return prix;
    }

    @Override
    public String toString() {
        return nom + " - " + prix + "euros";
    }

}
// test Commit 2