import java.util.Scanner;

public class BinaryConversion {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String binaryString = "0";

    while (Integer.parseInt(binaryString) != -1) {
        binaryString = scanner.next();
        if (isValid(binaryString)) {
            System.out.println("Conversion to decimal: " + binaryToDecimal(binaryString));
        }
    }
}

public static boolean isValid(String binString) {
    if (binString.length() == 0)
        return false;

    for (char iChar : binString.toCharArray())
        if (!(iChar == '0' || iChar == '1'))
            return false;

    return true;
}

public static int binaryToDecimal(String binaryString) {
    int decValue = 0;

}
}
