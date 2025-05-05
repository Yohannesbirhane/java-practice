class Obj{

    boolean ison;
    void turnon(){
        ison=true;
        System.out.println("light on? "+ ison);
     
    }
    public static void main(String[] args) {
        Obj light=new Obj();
        light.turnon();
      
        
    }
}