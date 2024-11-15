public class ProprietePrivee extends Propriete {
	private int nbPieces;
	
	public ProprietePrivee(int id, Personne responsable, String adresse, double surface, int nbPieces) {
        super(id, responsable, adresse, surface);
        this.nbPieces = nbPieces;
    }
	
	public String toString() {
        return super.toString() + ", nbPieces=" + nbPieces+"\n";
    }
	
	public double calculImpot(){
		return (getSurface() / 100) * 50 + (nbPieces * 10);
	}
	public int getNombre() {
        return nbPieces;
    }
	
}