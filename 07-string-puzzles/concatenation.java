import java.util.Scanner;
class concatenation {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("Concatenation, an interesting concept to use for a supposed game.");
    System.out.println("Seems we've met yet again, almost like you are doomed to my bad monologues and terrible games.");
    System.out.println("Anywho, lets proceed with the task, please insert 2 words to combine.");
    System.out.println("First word: ");
    String w1 = get.nextLine();
    System.out.println("Second word: ");
    String w2 = get.nextLine();
    System.out.println("And out returns your words, neatly combined into one cohesive mess, " + conCat(w1, w2));
  }
  public static String conCat(String w1, String w2) {
    if(w1.length() == 0 || w2.length() == 0) {
      return w1 + w2;
    } else {
      String w1Letter = w1.substring(w1.length()-1);
      String w1Word = w1.substring(0,w1.length()-1) + w2;
      String w2Letter = w2.substring(0,1);
      if(w1Letter.equals(w2Letter)) {
        return w1Word;
    } else {
        return w1 + w2;
      }
    }
  }
}
