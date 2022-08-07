import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      int my_count , my_input;
      my_count = 0;
      Scanner my_scanner = new Scanner(System.in);
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      for (; my_input != 0; my_input /= 10, ++my_count) {
      }
      System.out.println("The number of digits in the given input is: " + my_count);
   }
}
