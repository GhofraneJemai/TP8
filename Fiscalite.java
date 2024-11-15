public class Fiscalite {
    public static void main(String[] args) {
        Personne p1 = new Personne(1, "jemai", "ghofrane");
        Personne p2 = new Personne(2, "boulares", "manel");
        Personne p3 = new Personne(3, "guelbi", "farah");
        
        Lotissement lotissement = new Lotissement(10);
        lotissement.ajouter(new ProprietePrivee(1, p1, "corniche", 350, 4));
        lotissement.ajouter(new Villa(2, p2, "dar chaabene", 400, 6, true));
        lotissement.ajouter(new Appartement(3, p2, "Hammamet", 1200, 8, 4));
        lotissement.ajouter(new ProprieteProfessionnelle(4, p3, "korba", 1000, 50, true));
        lotissement.ajouter(new ProprieteProfessionnelle(5, p1, "bir bouragba", 2500, 400, false));
        
        System.out.println("Liste des proprietes dans le lotissement :");
        lotissement.afficherProprietes();
        
        System.out.println("Nombre total de pieces dans les proprietes privees : " + lotissement.getNbPieces());
        
        ProprietePrivee propMoinsImpots = null;
        double minImpots = 10000;
        for (int i = 0; i < lotissement.getNombre(); i++) {
            if (lotissement.getProprieteByIndex(i) instanceof ProprietePrivee) {
                double impots = lotissement.getProprieteByIndex(i).calculImpot();
                if (impots < minImpots) {
                    minImpots = impots;
                    propMoinsImpots = (ProprietePrivee) lotissement.getProprieteByIndex(i);
                }
            }
        }
        if (propMoinsImpots != null) {
            System.out.println("La propriete privee qui paye le moins d'impots :");
            System.out.println("Proprietaire : " + propMoinsImpots.getResponsable());
            System.out.println("Montant des impots : " + minImpots);
        }
        
        for (int i = 0; i < lotissement.getNombre(); i++) {
            if (lotissement.getProprieteByIndex(i) instanceof Appartement) {
                Appartement app = (Appartement) lotissement.getProprieteByIndex(i);
                if (app.getAdresse().equals("Hammamet")) {
                    lotissement.supprimer(app);
                    System.out.println("L'appartement de Hammamet a ete supprime.");
                    break;
                }
            }
        }
        System.out.println("Liste des proprietes dans le lotissement apres suppression :");
        lotissement.afficherProprietes();
		
		
		
		// code pour le lotissement privee 
		LotissementPrivee lt = new LotissementPrivee(10);

		lt.ajouter(new ProprietePrivee(1, p1, "Corniche", 350, 4));
		lt.ajouter(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
		
		System.out.println("Liste des proprietes dans le lotissement :");
		lt.afficherProprietes();

		System.out.println("Nombre total de pieces dans les proprietes privees : " + lt.getNbPieces());

		ProprietePrivee propMoinsImpots = null;
		double minImpots = 10000;
		for (int i = 0; i < lt.getNombre(); i++) {
			if (lt.getProprieteByIndex(i) instanceof ProprietePrivee) {
				double impots = lt.getProprieteByIndex(i).calculImpot();
				if (impots < minImpots) {
					minImpots = impots;
					propMoinsImpots = (ProprietePrivee) lt.getProprieteByIndex(i);
				}
			}
		}
		if (propMoinsImpots != null) {
			System.out.println("La propriete privee qui paye le moins d'impots :");
			System.out.println("Proprietaire : " + propMoinsImpots.getResponsable());
			System.out.println("Montant des impots : " + minImpots);
		}

		for (int i = 0; i < lt.getNombre(); i++) {
			if (lt.getProprieteByIndex(i) instanceof Villa) {
				Villa app = (Villa) lt.getProprieteByIndex(i);
				if (app.getAdresse().equals("Dar Chaabane")) {
					lt.supprimer(app);
					System.out.println("Villa de Dar Chabaane a ete supprime.");
					break;
				}
			}
		}

		System.out.println("Liste des proprietes dans le lotissement apres suppression :");
		lt.afficherProprietes();



   
	}
}