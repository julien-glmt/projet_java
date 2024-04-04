
class TestPorteVerrouCoulissante{
    static public void main(String[] args){
        PorteVerrouCoulissante pv = new PorteVerrouCoulissante(10);
        System.out.println(pv.estFerme()); //False

        pv.fermer();
        pv.verrouiller();
        pv.ouvrir();

        System.out.println(pv.estVerrouille()); //True 
        System.out.println(pv.estFerme()); //True
    }
}