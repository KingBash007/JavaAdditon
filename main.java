import java.io.*;
 
// Driver Class
class GFG {
    public static int sum(int num1, int num2)
    {
        return num1+num2;
    }
     
      // main function
    public static void main(String[] args)
    {
        GFG ob = new GFG();
        int res = ob.sum(28, 49);
        System.out.println(res);
    }
}