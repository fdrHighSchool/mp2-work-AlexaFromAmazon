import java.util.Scanner;
class firstHalf {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("Here we go again eh. This ones a real short one, easy enough really. You state a word, I see if I can split it in half.");
    System.out.println("State your word now: ");
    String word = get.nextLine();
    int wLen = word.length();
    firstHalf(wLen, word);
  }
  public static void firstHalf(int wLen, String word) {
    if(wLen%2 == 0) {
      System.out.println("Since it is an even lengthed word, your brand new word is "+word.substring(0,wLen/2));
    } else {
      System.out.println("Awh a shame really, this is an odd lengthed word, nothing I can do about it.");
    }
  }
}
