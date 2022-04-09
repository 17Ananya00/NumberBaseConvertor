import java.math.BigInteger;
import java.util.Objects;
import java.util.Scanner;

public class ConvertToAnyBase2 {
    static Scanner scanner = new Scanner(System.in);
    public static String sourceBase;
    public static int targetBase;
    public static BigInteger conversionalNumber;
    public static BigInteger conversionalResult;
    public static BigInteger decimalNum;

    class GFG {
        // To return value of a char.
// For example, 2 is returned
// for '2'. 10 is returned
// for 'A', 11 for 'B'
        static int val(char c) {
            if (c >= '0' && c <= '9')
                return (int) c - '0';
            else
                return (int) c - 'A' + 10;
        }
    }


    public static void main(String[] args) {
        start();
        menu();

    }

    public static void menu() {
        boolean condition = true;
        while (condition) {
                   if(condition ){
                } else {
                    targetBase = scanner.nextInt();
                    System.out.println("Enter number in base " + sourceBase + " to convert to base " + targetBase + " (To go back type /back)");
                    conversionalNumber = scanner.nextBigInteger();

                    toDeci(sourceBase, targetBase);
                   if(targetBase == 2){
                       binaryConvertor();
                   } else if (targetBase == 8){
                       octalConvertor();
                   } else if (targetBase == 16){
                       hexaConvertor();
                   } else if (targetBase == 10){
                       anyBaseConvertor();

                   }

                }
            }


        }


            static int toDeci (String str,
            int base)
            {
                int len = str.length();
                int power = 1; // Initialize
                // power of base
                int num = 0; // Initialize result
                int i;

                // Decimal equivalent is
                // str[len-1]*1 + str[len-2] *
                // base + str[len-3]*(base^2) + ...
                for (i = len - 1; i >= 0; i--) {
                    // A digit in input number
                    // must be less than
                    // number's base
                    if (GFG.val(str.charAt(i)) >= base) {
                        System.out.println("Invalid Number");
                        return -1;
                    }

                    num += GFG.val(str.charAt(i)) * power;
                    power = power * base;
                    decimalNum = BigInteger.valueOf(num);
                }
                return num;
            }

            // Driver code


            public static void binaryConvertor () {

                System.out.println("Conversion result: " + decimalNum.toString(2));

            }
            public static void octalConvertor () {
                System.out.println("Conversion result: " + decimalNum.toString(8));


            }
            public static void hexaConvertor () {
                System.out.println("Conversion result: " + decimalNum.toString(16));
            }

            public static void anyBaseConvertor () {
                System.out.println("Conversion result: " + decimalNum.toString(targetBase));
            }

            public static void start () {

                System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
                sourceBase = scanner.nextLine();
                boolean condition = true;
                if (Objects.equals(sourceBase, "/exit")) {
                    condition = false;
                }

            }


        }



