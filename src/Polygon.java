/**
 * Created by BDOSHNA on 5/24/2017.
 */
import java.util.Scanner;
public class Polygon {
    public static String PolygonMath(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Sides");
        double S = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter Side Length");
        double LN = scan.nextDouble();
        scan.nextLine();
        double p = S*LN;
        double TAN = 2*(Math.tan(Math.PI/S));
        double ap = LN/(TAN);
        double AREA = (ap * p)/2;

        return("Area equals: "+AREA);
    }
}
