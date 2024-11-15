public class LotissementPrivee extends Lotissement {
	
    public LotissementPrivee(int capacite) {
        super(capacite);
    }

    public boolean ajouter(Propriete p) {
        if (p instanceof ProprietePrivee) {
            if (nombre < MAX) {
                tabProp[nombre] = p;
                nombre++;
                return true;
            }
        }
        return false;
    }

    public Propriete getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            if (tabProp[i] instanceof ProprietePrivee) {
                return tabProp[i];
            }
        }
        return null;
    }

    public int getNbPieces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                nb += ((ProprietePrivee) tabProp[i]).getNombre();
            }
        }
        return nb;
    }
}
