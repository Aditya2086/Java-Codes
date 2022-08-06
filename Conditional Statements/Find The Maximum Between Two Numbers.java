import java.util.Scanner;

public class TWONO {
    public static void main(String[] args) {
      int a,b,max;
      System.out.println("Enter Two Numbers :- ");
      Scanner z = new Scanner(System.in);
      a = z.nextInt();
      b = z.nextInt();
      if (a==b)
      {
          System.out.println("Equal");
      }
      max = (a > b) ? a : b;
      System.out.println("Maximum Number is "+ max);
    }
}
