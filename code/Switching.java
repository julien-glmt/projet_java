

class Switching {
  void go(Actionable matriqueen) {
    matriqueen.action();
  }
}

class A implements Actionable {
  public void hop() {
    System.out.print("<Hop Hop>");
  }
  public void poh() {
    System.out.println("<Poh Poh>");
  }
    public void action(){
      hop();
      poh();
    }
}

class B implements Actionable {
  public void shazam() {
    System.out.println("shazammm");
  }
      public void action(){
        shazam();
    }
}

class C implements Actionable {
  public void action() {
    System.out.println("actionnnn");
  }
}

interface Actionable {
  public void action();
}


class TestSwitching {
  static public void main(String[] args) {
    Switching s = new Switching();
    s.go(new A());
    s.go(new B());
  }
}

