
public class OptionVoyage {
    private String nom;
    private double prix;

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
