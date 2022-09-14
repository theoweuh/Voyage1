public class Transport extends OptionVoyage {
    private boolean trajet;
    private int TARIF_LONG;
    private int TARIF_BASE;

    public Transport(Boolean trajet1, int tarif_base, int tarif_long, double unPrix) {
        super(unPrix);
        this.trajet = trajet1;
        this.TARIF_LONG = tarif_long;
        this.TARIF_BASE = tarif_base;
    }

    public double prix() {

    }

    public int getUnTrajet() {
        return trajet;
    }

    public double getUntrajetBase() {
        return TARIF_BASE  super.prix();
    }

}