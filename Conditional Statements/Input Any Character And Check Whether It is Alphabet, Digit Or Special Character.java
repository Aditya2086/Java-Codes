import java.util.Scanner;

public class SPECIAL {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  char ch;
     System.out.println("Enter a Character :- ");
     ch=cs.next().charAt(0);
     if(ch>='a' && ch<='z')
     System.out.println("It is a Small Alphabet");
     else if(ch>='A' && ch<='Z')
     System.out.println("It is a Big Alphabet");
     else if(ch>='0' && ch<='9')
     System.out.println("It is a number");
     else
     System.out.println("It is a special character");
     return ;
 }
}
