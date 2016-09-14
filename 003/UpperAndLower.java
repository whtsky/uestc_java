import java.util.Scanner;

public class UpperAndLower {
  public static char toLowerCase(char letter) {
    if ((int)letter >= 65 && letter <= 90) {
      letter += 32;
    }
    return (char)letter;
  }
  public static char toUpperCase(char letter) {
    if ((int)letter >= 97 && letter <= 122) {
      letter -= 32;
    }
    return (char)letter;
  }

  public static void main(String[] args) {
    String s;
    System.out.println("来，输入：");
    Scanner in = new Scanner(System.in);
    s = in.nextLine();

    System.out.println("小写：");
    for (int i = 0; i < s.length(); i++) {
      System.out.print(toLowerCase(s.charAt(i)));      
    }

    System.out.println("\n大写：");
    for (int i = 0; i < s.length(); i++) {
      System.out.print(toUpperCase(s.charAt(i)));      
    }
  }
}