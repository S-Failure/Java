/*
    This program uses a parameterized method.
    Call this file "BoxDemo5.java".
*/

//Can't not contain same class name in one packege so called Box3
class Box5 {
    double width;
    double height;
    double depth;
    
    //compute and return volume
    double volume() {
        return width * height * depth;
    }
    
    //sets dimensions of box
    void setDim (double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String args[]){
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;
        
        //intialize each box
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        
        //get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);
        
        //get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
