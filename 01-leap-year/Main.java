import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("This will determine whether or not the year is considered a leap year.");
    System.out.println("What year is it");
    int year = s.nextInt();
    if(isLeapYear(year)==true) {
      System.out.println("This is a leap year");
    } else {
      System.out.println("This is not a leap year");
    }
  }
  public static boolean isLeapYear(double year) {
    if(year%4 == 0) {
      if(year%100 != 0) {
        return true;
      } else if(year%400 == 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
