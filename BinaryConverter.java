public class BinaryConverter {

    public static int bin2Dec(String binaryString) throws BinaryFormatException {
        if (binaryString == null || binaryString.isEmpty()) {
            throw new BinaryFormatException("Input is null or empty");
        }

        int decimal = 0;
        int length = binaryString.length();
        
        for (int i = 0; i < length; i++) {
            char c = binaryString.charAt(length - 1 - i);
            if (c != '0' && c != '1') {
                throw new BinaryFormatException("Input contains non-binary characters");
            }
            if (c == '1') {
                decimal += Math.pow(2, i);
            }
        }
        
        return decimal;
    }
}

