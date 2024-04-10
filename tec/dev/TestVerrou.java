package tec;
class TestVerrou{
    public static void main(String[] args) {
        Verrou v = new Verrou(new PorteCharniere);
        v.verrouiller();
        v.ouvrir();

        v = new Verrou (new PorteCoulissante(10));
        // PorteCoulissante c = new PorteCoulissante(10);

        // c.fermer();
        // c.verrouiller();
        // c.coulisser();
    }
}