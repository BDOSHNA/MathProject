/**
 * Created by BDOSHNA on 5/24/2017.
 */
import java.util.Scanner;
public class Trap {
    public static String TrapMath(){
        double BiggerBase;
        double SmallerBase;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Base 1");
        double B1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Base 2");
        double B2 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Leg Length");
        double S1 = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Second Leg Length");
        double S2 = scan.nextDouble();
        scan.nextLine();
        if (B1>B2){
            BiggerBase = B1;
            SmallerBase = B2;
        }else{
            BiggerBase = B2;
            SmallerBase = B1;
        }
        double s = (S1+S2+(BiggerBase-SmallerBase))/2;
        double ar = Math.sqrt(s*(s-S1)*(s-S2)*(s-(BiggerBase-SmallerBase)));
        double h = (2*ar)/(S1*(BiggerBase-SmallerBase));
        double Final = ((B1+B2)/2)* h;
        return("Area equals: "+Final);//edit this when done
    }
}
