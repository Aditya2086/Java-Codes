import java.util.Scanner;

class Main {

public static void main(String[] args) {

        char ch = 'Z';

        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is Vowel");
                break;
            default:
                System.out.println(ch + " is Consonant");
        }
    }
}
