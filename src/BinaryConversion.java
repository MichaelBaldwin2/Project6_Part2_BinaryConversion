import javax.swing.*;

public class BinaryConversion {
// Written by: Mike Baldwin
// Project 6 - Part 2 - Binary Conversion
// This program reads in a sequence of binary strings
// and converts each one to a decimal integer.

public static void main(String[] args) {
    String binaryString;
    binaryString = "0";

    while (Integer.parseInt(binaryString) != -1) {
        binaryString = JOptionPane.showInputDialog("Enter a binary number:");
        if (Integer.parseInt(binaryString) == -1) {
            JOptionPane.showMessageDialog(null, "All set!");
            return;
        }
        if (isValid(binaryString))
            JOptionPane.showMessageDialog(null, "Conversion to decimal: " + binaryToDecimal(binaryString));
        else
            JOptionPane.showMessageDialog(null, "Invalid binary number! Please re-enter.");
    }
}

private static boolean isValid(String binString) {
    if (binString.length() == 0)
        return false;
    for (char iChar : binString.toCharArray())
        if (!(iChar == '0' || iChar == '1'))
            return false;

    return true;
}

private static int binaryToDecimal(String binStr) {
    int decValue;
    decValue = 0;
    for (int i = 0, j = binStr.length() - 1; i < binStr.length(); i++, j--)
        decValue += (binStr.charAt(i) == '0' ? 0 : 1) * Math.pow(2, j);
    return decValue;
}
}
