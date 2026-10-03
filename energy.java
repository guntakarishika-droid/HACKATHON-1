import java.util.Scanner;
public class energy{
    Scanner sc=new Scanner(System.in);
    void calculatetotalenergy(double morning , double evening){
         System.out.println("enter  morning energy generated");
         morning=sc.nextDouble();
          System.out.println("enter evening energy generated");
           evening=sc.nextDouble();
          double total= morning+evening;
           System.out.println("total energy generated"+total);
    }
    public static void main(String[]args){
        
        energy e=new energy();
        e.calculatetotalenergy(300 , 100);

    }
}