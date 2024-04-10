package tec;

public class PassagerStresse implements Usager{

    private MonteeRepos PassagerStress;

    public PassagerStresse(String nom, int destination){
        PassagerStress = new MonteeRepos(nom,destination,ComportementArret.ArretPrudent);
    }

    final public void monterDans(Autobus b){
      PassagerStress.monterDans(b);
    }
}