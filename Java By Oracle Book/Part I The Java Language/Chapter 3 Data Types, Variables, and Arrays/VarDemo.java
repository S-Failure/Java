/*
    A simple demonstration of local variable type inference.
    Call this file "VarDemo.java".
*/

public class VarDemo {
    public static void main(String args[]){
        
        //Use type inference to detemine the type of the
        //variable named avg. In this case, double is inferrd.
        var avg = 10.0;
        System.out.println("Value of avg : " + avg);
        
        //In the following context, var is not a predefined identifier.
        //It is simply a user-defined variable name.
        int var = 1;
        System.out.println("Value of var : " + var);
        
        //Interestingly, in the following sequence, var is used
        //as both the type of the declaration and as a variable name
        //in the intitializer.
        var k = -var;
        System.out.println("Value of k : " + k);
    }
}
