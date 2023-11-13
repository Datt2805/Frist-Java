class multiple_catch_block {
    public static void main(String[] args) {
        try{
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);

            int arr[] = {10,20,30};
            System.out.println(arr[0]);

            String str = null;
            System.out.println(str.toUpperCase());

        } 
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        } 
        catch(ArithmeticException b){
            System.out.println(b);
        }
        catch(NumberFormatException c){
            System.out.println(c);
        }
        catch(Exception d){
            System.out.println("All type Exception handled");
        }
        // Exception d = new NullPointerException();
    }
}
