import java.util.Objects;
import java.util.Scanner;

public class ConvertToAnyBase {

    public static int number;
    public static String sourceNumber;
    public static int  sourceBase;
    public static int targetBase;
    public static String conversionalNumber;

    public static String command;
    public static int base;
    static Scanner scanner = new Scanner(System.in);
    public static int deciNum;


    public static void main(String[] args) {



        sourceBase();


    }

    public static void sourceBase() {
        System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
        String sourceBaseString = scanner.nextLine();



        if (sourceBaseString == "/exit") {
            System.out.println("break;");
        } else {
            targetBase = scanner.nextInt();
            boolean condition = true;
            while (condition) {
                System.out.println("Enter number in base " + sourceBase + " to convert to base " + targetBase + " (To go back type /back)");
                conversionalNumber = scanner.nextLine();


                if (Objects.equals(conversionalNumber, "/back")) {
                    sourceBase();

                } else {
                    int conversionalNumberInt = Integer.parseInt(conversionalNumber);




                    if(targetBase == 2){
                        binaryConvertor();

                    } else if (targetBase == 8){
                        octalConvertor();
                    } else if (targetBase == 16){
                        hexaConvertor();
                    }



                }

            }
        }


    }



    public static void binaryConvertor(){

        System.out.println("Conversion result: " + Integer.toBinaryString(deciNum));

    }
    public static void octalConvertor(){
        System.out.println("Conversion result: " + Integer.toOctalString(deciNum));


    }
    public static void hexaConvertor(){
        System.out.println("Conversion result: " + Integer.toHexString(deciNum));
    }


}


