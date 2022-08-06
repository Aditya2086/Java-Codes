import java.util.Scanner;

public class THREENO {
    public static void main(String[] args) {
        Scanner z = new Scanner(System.in);
        int a,b,c,max;
        System.out.println("Enter Three Numbers :- ");
        a = z.nextInt();
        b = z.nextInt();
        c = z.nextInt();
        if(a=b=c)
        {
            System.out.println("Equal");
            return 0;
        }
        max = (a>b && a>c) ?a:(b>c) ?b:c;
        System.out.println("\nMaximum Number is "+ max);
    }
}
