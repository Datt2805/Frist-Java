public class StringBuffer_class {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Datt Bhatt");
        // System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // sb.append(" Daxesh Bhatt");
        // System.out.println(sb);
        // sb.deleteCharAt(3);
        // System.out.println(sb);
        // sb.insert(3, " Aaas");
        // System.out.println(sb);
        // Creating a StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // // Appending text to the StringBuffer
        // stringBuffer.append(" World");

        // // Inserting text at a specific position
        // stringBuffer.insert(5, " Beautiful");

        // // Deleting characters from the StringBuffer
        stringBuffer.delete(5, 14);

        // // Reversing the content of the StringBuffer
        // stringBuffer.reverse();

        // // Getting the length of the StringBuffer
        // int length = stringBuffer.length();

        // Converting the StringBuffer to a String
        // String result = stringBuffer.toString();

        // Printing the result
        System.out.println(stringBuffer);

    }
}