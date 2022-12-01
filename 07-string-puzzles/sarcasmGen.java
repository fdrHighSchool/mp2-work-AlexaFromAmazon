import java.util.Scanner;
class sarcasmGen {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    // Hello World = hElLo WoRlD
    // System.out.println(sarGen("Hello World"));
    System.out.println("Hello again, this time it will be a little more interesting.. not really. But more interesting than the last couple of things you did.");
    System.out.println("Now now, this is a sarcasm generator and by that I mean every alternating letter will become uppercase and the other lowercase.");
    System.out.print("For example Hello World would become hElLo WoRlD. Simple enough right? Now you try: ");
    String str = get.nextLine();
    System.out.println(" ");
    System.out.println("And your result is: "+sarGen(str));
  }
  public static String sarGen(String str) {
    String newStr = "";
    int z = 1;
    for(int i = 0; i < str.length(); i++) {
      String character = str.substring(i, i+1);
      if(character.equals(" ")) {
        newStr += " ";
      } else {
        if(z%2 != 0) {
          newStr += character.toLowerCase();
        } else {
          newStr += character.toUpperCase();
        }
        z++;
      }
    }
    return newStr;
  }
}
