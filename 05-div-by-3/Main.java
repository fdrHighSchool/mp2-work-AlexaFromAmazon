import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("Hey hey, back again eh? Let's see how entertaining this is to you.");
    System.out.println("If you are asking what this is then I'll answer its merely a way to check if a number is divisible by 3.");
    System.out.println("Riveting stuff I know..");
    System.out.println("Anyways, like the numerous times we've done before, what shall the number be?");
    int number = get.nextInt();
    System.out.println(divBy3(number));
  }
  public static boolean divBy3(int number) {
    int total = 0;
    int numLen = Integer.toString(number).length();
    String strNum = "" + number;
    char numVal;
    for(int i = 0; i < numLen; i++) {
      char incNum = strNum.charAt(i);
      total += incNum;
      // System.out.println(total);
    }
    if(total%3 == 0) {
      return true;
    } else {
      return false;
    }
  }
}
