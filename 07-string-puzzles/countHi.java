import java.util.Scanner;
class countHi {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("So, this 'game' isn't very interactive this time around... regardless you'll be watching");
    System.out.println("Simply put this program counts the amount of Hi's in a sentence. We will be using a default assigned hi statement and hopefully you get the idea of what I'm trying to do here.");
    System.out.println("Then maybe you can give out your own words");
    System.out.println(" ");
    System.out.println("The default sentence is as follows, 'Hi my name is Bob. Say hello to my friend, George. Hi, I'm George'");
    System.out.println(countHi("Hi my name is Bob. Say hello to my friend, George. Hi, I'm George") + " Hi's are in this sentence");
    System.out.println(" ");
    System.out.println("Great, now you get the go ahead to try it yourself, now keep in mind to actually make a plausible sentence to understand.");
    System.out.print("Please write your sentence: ");
    String str = get.nextLine();
    System.out.println(" ");
    System.out.println(countHi(str)+ " Hi's are in this sentence");
  }
  public static int countHi(String str) {
    str = str.toLowerCase();
    int count = 0;
    for(int i =0; i <= str.length() -2; i++ ) {
      if(str.substring(i,i+2).equals("hi")) {
        count++;
      }
    }
    return count;
  }
}
