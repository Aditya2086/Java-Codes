import java.util.Scanner;
public class ArmstrongNumbers {
   public static void main(String args[]){
      int my_low, my_high, check, my_rem, my_sum, i;
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("Required packages have been imported");
      System.out.println("A scanner object has been defined ");
      System.out.println("Enter the first number :");
      my_low = my_scanner.nextInt();
      System.out.println("Enter the limit :");
      my_high = my_scanner.nextInt();
      System.out.println("The Armstrong numbers are :");
      for (i = my_low; i<my_high; i++){
         my_sum = 0;
         check = i;
         while(check != 0) {
            my_rem = check % 10;
            my_sum = my_sum + (my_rem * my_rem * my_rem);
            check = check / 10;
         }
         if(my_sum == i){
            System.out.println(i);
         }
      }
   }
}
