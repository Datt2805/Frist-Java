class try_catch_finally {
    public static void main(String[] args) {
        // case 1
        /*try {
            System.out.println("Learn coding");
            int a = 20,b = 2,c;
            c = a/b;
            System.out.println(c);
            System.out.println("Lick");
        } catch (ArithmeticException e) {
            System.out.println("can't devide by zero");
        }
        finally { 
            System.out.println("don't");
        }
         System.out.println("main method ended");*/

        // case 2
        try {
            System.out.println("Learn coding");
            int a = 20,b = 0,c;
            c = a/b;
            System.out.println(c);
            System.out.println("Lick");
        } catch (ArithmeticException e) {
            int x = 20,y = 0,z;
            z = x/y;
            System.out.println(z);
            System.out.println("can't devide by zero");
        }
        finally { 
            System.out.println("don't");
        }
        System.out.println("main method ended");
    }
}
