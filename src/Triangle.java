/**
 * Created by BDOSHNA on 5/24/2017.
 */
import java.util.Scanner;
import java.util.Arrays;
public class Triangle {
    public static String TriangleMath(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Side A");
        String AA = scan.nextLine();
        System.out.println("Enter Side B");
        String BB = scan.nextLine();
        System.out.println("Enter Side C");
        String CC = scan.nextLine();
        int a = Integer.parseInt(AA);
        int b = Integer.parseInt(BB);
        int c = Integer.parseInt(CC);
        int Sides[] = new int[3];
        Sides[0] = a;
        Sides[1] = b;
        Sides[2] = c;
        Arrays.sort(Sides);
        int A = Sides[0];
        int B = Sides[1];
        int C = Sides[2];
        if (A+B>C){
            int s = (A+B+C)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            return("Area Equals: "+ area);
        } else {
            return ("Please Enter Valid Side Lengths");
        }
    }
}
