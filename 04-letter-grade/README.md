# Letter Grade
#### Respond to the following:

1. Write a plan for the following extension:
  * Attach a "+" on their grade if the grade ends in a 7, 8 or 9 (eg: 78 -> C+, 89 -> B+)
  * Attach a "-" on their grade if the grade ends in a 0, 1 or 2 (eg: 92 -> A-, 61 -> D-)

   I would create a new Int variable and do %10 on the original grade number. After that I should be left with only the ones digit. Then I can determine what the ones digit is using a variety of 3 if statements to determine the +, - or none.


2. Discuss how you would make sure 100 is not misrepresented as an A-.
  Use an if statement that occurs before the other if statements (these determine if the grade is less than 90 etc) and to return A+ for 100 if it determines that the grade is == to 100.


3. Discuss how you would make sure grades that are an F are not mislabeled as F- or F+ (eg: 49 -> F+ and 52 -> F-)
  To make sure that the grades are not mislabeled as F- etc, I would make sure that the (similar to the last response) if statement determining if grade is less than 60 is above the rest of the other if statements and returns "F" by default.
