 class Lamp{
    boolean ison;
    void turnon(){
        ison= true;
        System.out.println("light on ? "+ ison);

    }
    void  turnoff(){
        ison=false;
        System.out.println("light on ? "+ ison);

    }}
   public  class  Light{
        public static void main(String[] args) {
            Lamp led =new Lamp();
            Lamp halogen =new Lamp();
            led.turnon();
            halogen.turnoff();
        }
    }
