public class wrapper_class {
    public static void main(String[] args) {
        int j = 10;
        Integer in = new Integer(j);// boxing, wrapping

        int i = in.intValue();// unboxing
        System.out.println(i);

    }
}
