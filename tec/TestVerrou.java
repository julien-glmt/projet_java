package tec;
class TestVerrou{
    public static void main(String[] args) {
        PorteCoulissante c = new PorteCoulissante(10);

        c.fermer();
        c.verrouiller();
        c.coulisser();
    }
}