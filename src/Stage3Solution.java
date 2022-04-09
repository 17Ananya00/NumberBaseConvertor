import java.math.BigInteger;
import java.util.Scanner;

public class Stage3Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter two numbers in format: {source base} {target base} (To quit type /exit)");
                String[] strings = scanner.nextLine().split(" ");
                if (strings[0].equals("/exit")) {
                    break;
                }
                if (strings.length != 2) {
                    System.out.println("Error!");
                    break;
                }
                int sourceBase = initBase(strings[0]);
                int targetBase = initBase(strings[1]);
                if (sourceBase < 0 || targetBase < 0) {
                    break;
                }
                while (true) {
                    System.out.println("Enter number in base " + sourceBase + " to convert to base " + targetBase + " (To go back type /back)");
                    String s = scanner.nextLine();
                    if (s.equals("/back")) {
                        break;
                    }
                    BigInteger bigInteger;
                    try {
                        bigInteger = new BigInteger(s, sourceBase);
                    } catch (Exception e) {
                        System.out.println("Error! Try again");
                        continue;
                    }
                    System.out.println("Conversion result: " + bigInteger.toString(targetBase));
                }
            }
        }
    }

    public static int initBase(String s) {
        int base = -1;
        try {
            base = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Error");
            return base;
        }
        if (base < 2 || base > 36) {
            System.out.println("Error");
            return base;
        }
        return base;
    }
}
