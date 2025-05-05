class Box {
    double height;
    double width;
    double length;
}


public class boxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.height = 10;
        myBox.length = 15;
        myBox.width = 20;
        vol = myBox.height * myBox.length * myBox.width;
        System.out.println("volume= " + vol);
    }
}

