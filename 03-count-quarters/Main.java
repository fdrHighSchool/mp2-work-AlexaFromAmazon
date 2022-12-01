import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("Back for more random shenanigans I see. Well how about it, want to pick a number that I'll use to find the amount of quarters in it?");
    System.out.println("Well its not like you have much of a choice so. Anywho, please pick a number for me would ya?");
    int amount = get.nextInt();
    System.out.println("So the amount of quarters that you will have, disregarding dollars as I'm sure you know, is "+countQuarters(amount));
  }
  public static int countQuarters(int cents) {
    if(cents < 25) {
      return 0;
    } else {
      String centsTring = ""+cents;
      int numLen = centsTring.length();
      int quartermount = Integer.parseInt(centsTring.substring(numLen-2));
      quartermount /= 25;
      return quartermount;
    }
  }
}
