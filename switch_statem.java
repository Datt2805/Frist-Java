import java.util.Scanner;

public class switch_statem {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scan.nextInt();
        // switch(age){
        //     case 1:
        //         System.out.println("You are 1 yrars old");
        //         break;
        //     case 2:
        //         System.out.println("You are 2 yrars old");
        //         break;
        //     case 3:
        //         System.out.println("You are 3 yrars old");
        //         break;
        //     case 4:
        //         System.out.println("You are 4 yrars old");
        //         break;
        //     case 5:
        //         System.out.println("You are 5 yrars old");
        //         break;
        //     case 6:
        //         System.out.println("You are 6 yrars old");
        //         break;
        //     case 7:
        //         System.out.println("You are 7 yrars old");
        //         break;
        //     case 8:
        //         System.out.println("You are 8 yrars old");
        //         break;
        //     case 9:
        //         System.out.println("You are 9 yrars old");
        //         break;
        //     default:
        //         System.out.println("Rong age");
        // }
        switch(age){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tusday");
                break;
            case 3:
                System.out.println("wednasday");
                break;
            case 4:
                System.out.println("thusday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("sutarday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }
    }
}
