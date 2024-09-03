import java.util.Scanner;

public class BinaryConverterTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        try {
            int decimalValue = BinaryConverter.bin2Dec(binaryString);
            System.out.println("Decimal equivalent: " + decimalValue);
        } catch (BinaryFormatException e) {
            System.out.println("Not a binary number");
        }
    }
}
