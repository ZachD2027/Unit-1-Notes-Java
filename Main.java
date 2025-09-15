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


      
   }
}
 