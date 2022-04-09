import java.util.Scanner;

public class ConvertDecimals {

    public static int number;
    public static int base;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter number in decimal system:");
        number = scanner.nextInt();

        System.out.println("Enter target base:");
        base = scanner.nextInt();

        //binary -> use % 2
        //octal -> use % 8
        //hexa -> use % 16


        if (base == 2) {

           binaryConvertor();


        } else if (base == 8){
           octalConvertor();

        } else if (base == 16 ){

            hexaConvertor();
        } else {
            System.out.println("Error: Cannot find the base convertor");
        }
    }

    public static void binaryConvertor(){

        System.out.println("Conversion result: " + Integer.toBinaryString(number));

    }
    public static void octalConvertor(){
        System.out.println("Conversion result: " + Integer.toOctalString(number));


    }
    public static void hexaConvertor(){
        System.out.println("Conversion result: " + Integer.toHexString(number));
    }


    }
