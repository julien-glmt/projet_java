
class Aiguillage {
  private int nbAiguillage;

  Aiguillage(int max) {
    nbAiguillage = max - 1;
  }
  
  void executer(int choix) {
    if (estHorsLimite()) {
      System.out.println("limite depassee");
      return;
    }
    
    if (choix == 1) {
      A a = new A();
      a.jeter();
      a.rattrapper();
      nbAiguillage--;
    }
    
    if (choix == 2) {
      new B().lancer();
      nbAiguillage--;
    }
  }

  boolean estHorsLimite() {
    return nbAiguillage < 0;
  }
}


class TestAiguillage {
  static public void main(String[] args) {
    Aiguillage g = new Aiguillage(3);

    g.executer(2);
    g.executer(1);
    g.executer(2);
    g.executer(1);
  }
}

