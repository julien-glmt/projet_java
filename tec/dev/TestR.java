package tec;
class R{    
    public void mi(){System.out.println("mi")};
    
    public static void mc() {System.out.println("mc");}
class TestR {
    static public void main(String[] args){
        R v = null;
        v.mc();
    }
}
}
