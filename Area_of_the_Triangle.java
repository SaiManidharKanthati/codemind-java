import java.util.*;
public class abc{
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double s;
        s= (a+b+c)/2;
        float area=(float)(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        System.out.printf("%.2f",area);
    }
}