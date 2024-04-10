interface R {
    static int MAX=666;
  
    public void foo();
  }
  
  interface I {
    public void foo();
  }
  
  interface RI extends R, I {
  
  }
  
  class E implements R {
    public void foo() {
      System.out.println("in foo()");
    }
  }
  
  
  class F extends E implements R, I, RI {
  
  }
  
  
  class Multiple {
    public static void main (String[] args) {
      F v = new F();
      v.foo();
  
      RI x = v;
      x.foo();
  
      System.out.println(RI.MAX);
    }  
  }