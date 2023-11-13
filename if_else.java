import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        // System.out.println(age);

        if(age>20){
            System.out.println("You are an Adult");
            
        }
        else if (age>5) {
            System.out.println("You are not a kid");
        }
        else{
            System.out.println("You are a kid");
        }
    }
}
