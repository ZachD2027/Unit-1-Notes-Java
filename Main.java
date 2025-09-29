// Every Java file is a CLASS
public class Main {
   // main method is the ENTRYWAY to the program
   public static void main(String []args) {
      System.out.println("Hello World");
      System.out.println("hiii");

      // DECLARE a new variable
      int score;
      // ASSIGN a value to the variable
      score = 72;
      // INITIALIZE combines declaring + assigning
      String pokemon = "Lucario";
      double healthPercent = 0.75;
      boolean isAlive = true;

      // Use the plus sign to CONCATENATE (combine) Strings
      String greeting = "Hello" + "World";
      System.out.println(greeting);
      //Quotation marks contain STRING LITERALS 


         //OUTPUT: difference btwn .print and .println
         System.out.println("there");
         System.out.print("Hi");
         System.out.print("!");
         // .println displays the message THEN goes to next line

         // ESCAPE: use \ (backslash) to include special characters, use \n for line break
         String message = "\n I woke up and said, \"thank you beyonce\" ";
         System.out.println(message);

         // ARITHMETIC expressions with operators
         System.out.println(4 + 3);
         System.out.println(4 - 1);
         System.out.println(6 * 7);
         System.out.println(5 / 3); // TRUNCATED!
         // Integer division results in TRUNCATION, which is basically throwing away the decimal places
         System.out.println(5.0 / 3); // double instead of int

         // COMOOUND expressions follow PEMDAS
         double result = 2 + (3 * 2 - 6); 
         System.out.println(result);

         // REMAINER % operator 
         int remain = 23 % 2; // 1 -> means ODD number
         System.out.println(remain);
         System.out.println(628 % 2); // 0 -> means EVEN number

         // You can set one variable to another's value
         int zach_age = 16;
         int aaniyah_age = zach_age;
         // both variables above contain the same value

         // Practice copying & re-assigning values
         int x = 15;
         int y = 21;
         int z = 2;
         x = y; // x now sotres the same value as y
         y = y * 2;
         z = 27;
         System.out.println(x);
         System.out.println(y);
         System.out.println(z);
         System.out.print("x is " + x);  
         System.out.print("Y is " + y); 
         System.out.print("Z is " + z);
         
         // type mismatch error
         double num1 = 3; // int would cause an error below!
         double num2 = 3.141592653578;
         num1 = 2 * num2;
         System.out.println(num1);

         // INCREMENT: add on to current value
         int points = 0;
         points = points + 1;
         // DECREMENT: decrease an existing value
         points = points - 15;
         System.out.println(points);

         // CASTING (convert data types)
         int originalValue = 5;
         double castDouble = (double) originalValue;
         System.out.println("Cast to double: " + castDouble); 
         int castInt = (int) castDouble;
         System.out.println("Cast back to int: " + castInt);

         // Examples of math and casting
         System.out.println(3/4); // 0
         System.out.println(3.0/4); // 0.75
         System.out.println( 3/4.0); // 0.75
         System.out.println((double) 3/4);
         // casting preserved the devimal places (no truncation)
         System.out.println((int) 3.0/4 ); // 0 (truncated!)

         // Casting is helpful when dividing integers
         int apcs = 13;
         int juniors = 40;
         double csPercent = (double) apcs/juniors;
         System.out.println(csPercent); // 0.325

         // ROUNDING by casting
         double positiveNum = 26.09;
         double negativeNum = -3.141592653578; 
         int nearestPositive = (int) (positiveNum + 0.5);
         System.out.println(nearestPositive);
         int nearestNegative = (int) (negativeNum - 0.5);
          System.out.println(nearestNegative);
   }
}
 