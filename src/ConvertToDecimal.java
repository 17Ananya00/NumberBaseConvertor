import java.util.Scanner;

public class ConvertToDecimal {


    public static int number;
    public static String sourceNumber;
    public static int sourceBase;

    public static String command;
    public static int base;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean condition = true;



        while(condition){

            System.out.println("Do you want to convert /from decimal or /to decimal? (To quit type /exit)");
            command = scanner.nextLine();



            switch (command) {
                case "/exit":
                    condition = false;
                    break;

                case"/from" :
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

                    break;



                case"/to" :
                    System.out.println("Enter source number:");
                    sourceNumber = scanner.nextLine();
                    System.out.println("Enter target base:");
                    sourceBase = scanner.nextInt();

                    if(sourceBase == 2){
                        binaryToDecimal();


                    } else if (sourceBase == 8){
                        octaToDecimal();

                    } else if (sourceBase == 16){
                        hexaToDecimal();

                    } else {
                        System.out.println("Error: Wrong base source");
                    }





            }
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

    public static void binaryToDecimal(){
        String  decimal= String.valueOf(Integer.parseInt(String.valueOf(sourceNumber),2));
        System.out.println("Conversion to decimal result: " + decimal);
    }

    public static void octaToDecimal(){
        String decimal = String.valueOf(Integer.parseInt(String.valueOf(sourceNumber),8));
        System.out.println("Conversion to decimal result: " + decimal);

    }
    public static void hexaToDecimal(){
        String decimal = String.valueOf(Integer.parseInt(String.valueOf(sourceNumber),16));
        System.out.println("Conversion to decimal result: " + decimal);

    }



}
