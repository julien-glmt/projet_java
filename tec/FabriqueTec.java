package tec;

public class FabriqueTec{
    public static Usager fairePassagerStandard(String nom, int destination){
        return new PassagerStandard(nom, destination);
    }

    public static Usager fairePassagerLunatique(String nom, int destination){
        return new PassagerLunatique(nom, destination);
    }

    public static Usager fairePassagerStresse(String nom, int destination){
        return new PassagerStresse(nom, destination);
    }

    public static Usager fairePassagerAnxieux(String nom, int destination){
        return new PassagerAnxieux(nom, destination);
    }

    public static Autobus faireAutobus(int nbPlaceAssise, int nbPlaceDebout){
        return new Autobus(nbPlaceAssise, nbPlaceDebout);
    }
}