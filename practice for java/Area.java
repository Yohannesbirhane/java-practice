class demoarea{
    float length;
    float width;
    float area (){return length*width;}
    void showarea(float l,float w){
        width=w;
        length=l;


    }
}
public  class  Area{
    public static void main(String[] args) {
        demoarea rect=new demoarea();
        float are;
        rect.showarea(23, 12);
        are=rect.area();
        System.out.println("area of the rectangle is  "+are);
    }
}