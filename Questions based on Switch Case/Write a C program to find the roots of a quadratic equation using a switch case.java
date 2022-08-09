import java.util.Scanner;
public class Funycode {
    public static void main(String[] args) {
        float a, b, c;
        float r1,r2,i;
        float d;
        System.out.println("Enter values of a, b, c :");
        Scanner z=new Scanner(System.in);
        a = z.nextFloat();
        b = z.nextFloat();
        c = z.nextFloat();
        d = (b*b)-(4*a*c);
        switch(d>0)
        {
        case 1:

            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("real roots:%.2f and %.2f"+ r1 + r2);
            break;
        case 0:
            switch(d<0)
            {
            case 1:
                r1=r2=-b/(2*a);
                i=Math.sqrt(-d)/(2*a);
                System.out.println("complex roots: %.2f + i%.2f and %.2f - i%.2f"+r1+i+r2+i);
                break;
            case 0:
                r1=r2=-b/(2*a);
                System.out.println("Two equal and real roots: %.2f and %.2f"+r1+r2);
                break;
            }
        }
    }
}
