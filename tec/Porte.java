public class Porte {
    private PorteCharniere porteCharniere;
    private PorteCoulissante porteCoulissante;

    // Constructeur pour PorteCharniere
    private Porte(PorteCharniere porteCharniere) {
      this.porteCharniere = porteCharniere;
    }
    
    // Constructeur pour PorteCoulissante
    private Porte(PorteCoulissante porteCoulissante) {
        this.porteCoulissante = porteCoulissante;
    }

    public boolean estFerme() {
        if (porteCharniere != null) {
            return porteCharniere.estFerme();
        } else if (porteCoulissante != null) {
            return porteCoulissante.estFerme();
        }
        // Retourner une valeur par défaut si aucun type n'est défini
        return true;
    }

    public void fermeer() {
        if (porteCharniere != null) {
            porteCharniere.fermer();
        } else if (porteCoulissante != null) {
            porteCoulissante.fermer();
        }
    }

    public void ouvriir() {
        if (porteCharniere != null) {
            porteCharniere.ouvrir();
        } else if (porteCoulissante != null) {
            porteCoulissante.ouvrir();
        }
    }

    // Méthode de fabrique pour une PorteCharniere
    public static Porte creerCharnieere() {
        return new Porte(new PorteCharniere());
    }

    // Méthode de fabrique pour une PorteCoulissante
    public static Porte creerCoulissante(int max) {
        return new Porte(new PorteCoulissante(max));
    }
}