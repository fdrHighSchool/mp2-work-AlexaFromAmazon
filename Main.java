import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Welcome to the very much important game FizzBuzz");
    System.out.println("There aren't many things you need to know prior to this game, however there are some key things to keep in mind when it comes to understanding your result.");
    System.out.println("If your result arrives back to you as FizzBuzz, then that means your number was divisible by both 3 and 5");
    System.out.println("The next 2 possible results are Fizz and Buzz, the latter being for when the number is divisible by 5 and the former for when the number is divisible by 3");
    System.out.println("And lastly if your result comes back as the same way you got it, then it was not divisible by 3 or 5");
    System.out.println(" ");
    System.out.println("Anyways thats enough rules for now, let's carry on with our so called game, please insert a desired number");
    System.out.println("So go ahead now.");
    int number = s.nextInt();
    System.out.println(" ");
    System.out.println("Alright, let's see what we've got here.");
    System.out.println("Your result is"+fizzBuzz(number));
  } // end of main method
  public static String fizzBuzz(int number) {
    String wordlist = " ";
    int n3 = number%3;
    int n5 = number%5;
    if(n3 == 0 && n5 == 0) {
      wordlist += "FizzBuzz";
    } else if(n3 != 0 && n5 == 0) {
      wordlist += "Buzz";
    } else if(n3 == 0 && n5 != 0) { // 
      wordlist += "Fizz";
    } else { //neither 
      wordlist += number;
    }
    return wordlist;
  } // end of fizzBuzz method
}
