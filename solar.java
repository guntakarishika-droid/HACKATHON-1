import java.util.Scanner;
class solar{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your panel id");
        int panel=sc.nextInt();
        System.out.println("enter energy  generated");
        double energy=sc.nextDouble();
        System.out.println("enter number of solar panels");
        int solar=sc.nextInt();
        System.out.println("enter system status");
        char status=sc.next().charAt(0);
        System.out.println("=====ROOFTOP SOLAR  PANEL======");
        System.out.println("panel id "+panel);
        System.out.println("energy generated:"+energy);
        System.out.println("Solar panels:" +solar);
        System.out.println("system status:" +status);
        
    }
}