

 class  OBjec {
    int x;
    int y;
    int r;

}
class  emo {
    public static void main(String[] args) {
       // Scanner input=new Scanner(System.in);
        OBjec yoni =new OBjec();
        int mul;

        yoni.x=2;
        yoni.y=4;
        yoni.r=6;
        mul=yoni.x*yoni.y*yoni.r;
        System.out.println("the product of the numbers (2,4,6) is = " + mul);

    }
}