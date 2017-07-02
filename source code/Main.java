import java.util.Scanner;

public class Main

  {

       public static void main(String[] args)

            {
                Scanner input = new Scanner(System.in);
                
                System.out.print("This program converts positive whole numbers into "
                        + "binary.\n\n");
                System.out.print("Please enter a whole number: ");
                
                int decimalNumber = input.nextInt();
                
                System.out.print("\nIn binary, " + decimalNumber +
                        " converts to "
                        /* Because literal numbers are int by default, the
                           second argument must be casted to byte to meet the
                           function's requirements */
                        + BinaryConverter.decimalToBinary(decimalNumber, (byte)32));
            }
  }