import java.util.Scanner;
class repeatEnd {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("Sigh, I can't believe you are back again... We are running out of things to do yknow");
    System.out.println("As usual, this is a simple enough task for you, I'm pretty sure anyways..");
    System.out.println("Please provide us with a word and a number");
    System.out.println("Word first: ");
    String word = get.nextLine();
    System.out.println("Number last: ");
    int num = get.nextInt();
    System.out.println("Well, here's the result of your twisted words, "+repeatEnd(word, num));
  }
  public static String repeatEnd(String word, int num) {
    String combW = "";
    for(int i = 0; i < num; i++) {
      combW += word.substring(word.length()-num);
    }
    return combW;
  }
}
