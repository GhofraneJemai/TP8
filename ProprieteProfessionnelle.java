public class ProprieteProfessionnelle extends Propriete {
	private int nbEmployes;
    private boolean estEtatique;
	
	public ProprieteProfessionnelle(int id, Personne responsable, String adresse, double surface, int nbEmployes, boolean estEtatique) {
        super(id, responsable, adresse, surface);
        this.nbEmployes = nbEmployes;
        this.estEtatique = estEtatique;
    }
	
	public String toString() {
        return super.toString() + ", nbEmployes=" + nbEmployes + ",\n  estEtatique=" + estEtatique+"\n";
    }
	public double calculImpot(){
		if (estEtatique) {
			return 0;
		} else {
			return (getSurface() / 100) * 100 + (nbEmployes * 30);
		}	
	}

}