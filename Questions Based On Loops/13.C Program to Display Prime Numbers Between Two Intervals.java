import java.util.Scanner;
public class PrimeNumber {
   public static void main(String[] args) {
      int my_high, my_low, i;
      boolean my_temp;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the starting number : ");
      my_low = my_scanner.nextInt();
      System.out.print("Enter an ending Number: ");
      my_high = my_scanner.nextInt();
      System.out.println("The prime numbers between the interval " + my_low + " and " + my_high + " are:");
      while (my_low < my_high) {
         my_temp = false;
         for(i = 2; i <= my_low/2; ++i) {
            if(my_low % i == 0) {
               my_temp = true;
               break;
            }
         }
         if (!my_temp && my_low != 0 && my_low != 1)
            System.out.print(my_low + " ");
         ++my_low;
      }
   }
}
