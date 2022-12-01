import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner get = new Scanner(System.in);
    System.out.println("You couldn't live with the boredom and where did that bring you? Back to me...");
    System.out.println("Anywho.. sad to say we haven't got a game exactly in store for you. More of a grade converter, I'm sure you'll love that.");
    System.out.print("Please insert a grade of your choice right here: ");
    int grade = get.nextInt();
    System.out.println(" ");
    System.out.println("And your converted grade is: "+gradeConvert(grade));
  }
  public static String gradeConvert(int grade) {
    // 0,1,2 (-) 7, 8,9 (+)
    // variables
    String gradeString = ""+grade;
    String gradeSym;
    String finalGrade = "";
    int gradeLength = gradeString.length(); // length of the grade
    ////////////////////
    if(grade < 60) { // cancels out rest of code and defaults to F
      return "F";
    } else {
      // determine the need for a sign or not
      // int gradeSplit = Integer.parseInt(gradeString.substring(gradeLength -  1));
      int gradeSplit = grade%10;
      if(gradeSplit <= 2) {
        gradeSym = "-";
      } else if(gradeSplit >= 7) {
        gradeSym = "+";
      } else {
        gradeSym = "";
      } // determine letter grade
      if(grade == 100) {
        finalGrade += "A+";
      } else if(grade >= 90) {
        finalGrade += "A";
      } else if(grade >= 80 && grade < 90) {
        finalGrade += "B";
      } else if(grade >= 70 && grade < 80) {
        finalGrade += "C";
      } else if(grade >= 60 && grade < 70) {
        finalGrade += "D";
      }
      return finalGrade + gradeSym;
    }
  }
}
