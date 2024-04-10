package tec;

public class PassagerStandard implements Usager{

    private MonteeRepos PassagerStand;

    public PassagerStandard(String nom, int destination){
        PassagerStand = new MonteeRepos(nom,destination,ComportementArret.ArretCalme);
    }

    final public void monterDans(Autobus b){
      PassagerStand.monterDans(b);
    }
}