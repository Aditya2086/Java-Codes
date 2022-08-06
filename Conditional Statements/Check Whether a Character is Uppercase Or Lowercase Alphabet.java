import java.util.Scanner;

public class SPECIAL {

 public static void main(String[] args) {
  Scanner cs=new Scanner(System.in);
  char ch;
  System.out.println("Enter a Character :- ");
  ch=cs.next().charAt(0);
  
  if(ch>='a' && ch<='z')
  System.out.println("It is a Lower Case Alphabet");
  
  else if(ch>='A' && ch<='Z')
  System.out.println("It is a Upper Case Alphabet");
  
  }
  }
