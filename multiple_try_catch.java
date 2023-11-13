class multiple_try_catch {
    public static void main(String[] args) {
        try {
            int a=10,b=0,c;
            c = a/b;
            System.out.println(c);
        } catch (ArithmeticException a) {
            System.out.println(a);
        }

         
        try {
            int a[] = {10,20,30,40};
            System.out.println(a[5]);
        } catch (ArrayIndexOutOfBoundsException b) {
            System.out.println(b);
        }
    }
}
