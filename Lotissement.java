public class Lotissement implements GestionPropriete {
    protected Propriete[] tabProp;
    protected int nombre;
	
	public Lotissement(int capacité) {
        tabProp =new Propriete[capacité];
        nombre = 0; 
    }
	
	public int getNombre() {
        return nombre;
    }
	
	public void afficherProprietes() {
        for (int i=0; i<nombre;i++) {
            System.out.println(tabProp[i].toString());
        }
    }
	public boolean ajouter(Propriete p)
	{
		if(nombre < MAX) {
			tabProp[nombre]=p;
			nombre++;
			return true;
		}
		else{
			return false;
		}
	}
	public boolean supprimer(Propriete p) {
        for (int i=0;i<nombre;i++) {
            if (tabProp[i].getId() == p.getId()) { 
                for (int j=i;j<nombre-1;j++) {
                    tabProp[j]=tabProp[j+1];
                }
                tabProp[nombre-1]=null; 
                nombre--; 
                return true; 
            }
        }
        return false; 	
    }
	public Propriete getProprieteByIndex(int i) {
        if (i>=0 && i<nombre) {
            return tabProp[i];
        }
		return null;
    }
	
	public int getNbPieces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                ProprietePrivee propPrivee = (ProprietePrivee) tabProp[i];
                nb += propPrivee.getNombre();
            }
        }
        return nb; 
    }
	
}