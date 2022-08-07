import java.util.Scanner;
public class Factors {
   public static void main(String[] args) {
      int my_input, i;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      System.out.print("The factors of " + my_input + " are: ");
      for (i = 1; i <= my_input; ++i) {
         if (my_input % i == 0) {
            System.out.print(i + " ");
         }
      }
   }
}
