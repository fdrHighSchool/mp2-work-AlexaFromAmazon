import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("So its come down to shapes now.. Well here ya go a square-making activity, which is nothing but you merely pressing 2 buttons");
    System.out.print("Number for the Squares: ");
    int sqNum = get.nextInt();
    System.out.println(" ");
    square(sqNum);
    System.out.println("And shazam there's your square, lovely ain't it?");
    System.out.println("No? Entertainment died real quick I see. Well how about a rectangle, ooo");
    System.out.print("Number for the Rectangle: ");
    int recNum = get.nextInt();
    System.out.println(" ");
    rectangle(recNum);
    System.out.println("How's that for a rectangle eh?");
    System.out.println("No? Tough crowd eh? Fair but still its shapes atleast pretend to be entertained.");
    System.out.println("Alright, alright how about a right triangle?");
    System.out.print("Number for the Right Triangle: ");
    int rTriNum = get.nextInt();
    System.out.println("");
    righTriangle(rTriNum);
  }
  public static void square(int num) {
    for(int row = 0; row < num; row++) {
      for(int col = 0; col < num; col++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
  public static void rectangle(int num) {
    for(int col = -2; col < num; col++) {
      for(int row = 0; row < num; row++) {
        System.out.print("* ");
      }
      System.out.println("");
    }
  }
  public static void righTriangle(int num) {
    // *
    // * *
    // * * *
    // * * * *
    for(int row = 0; row <= num; row++) {
      for(int star = 0; star <= row; star++) {
        System.out.print("* ");
      }
      System.out.println(" ");
    }
  }
  public static void triangle(int num) {
    //   *
    //  * *
    // * * *
    // does not work currently
    for(int row = 0; row <= num; row++) {
      for(int space = num - row; space <= num; space--) {
        System.out.print(" ");
        for(int star = 0; star <= row; star++) {
          System.out.print("* ");
        }
      }
      System.out.println(" ");
    }
  }
}
