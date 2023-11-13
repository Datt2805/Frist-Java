import java.util.*;

public class newKeyword {
    // int a = 10;
    // newKeyword(){
    //     System.out.println(a);
    // }
    // public static void main(String[] args) {
    //     newKeyword n = new newKeyword();  
    // }    
    public static void main(String[] args) {
        int size;
        System.out.print("Enter Arrsy Elements: ");
        try (Scanner r = new Scanner(System.in)) {
            size = r.nextInt();
            int a[] = new int[size];
            System.out.println("Enter array Elements: ");
            for(int i = 0; i < size; i++){
                a[i] = r.nextInt();
            }
            System.out.println("Array Elements: ");
            for(int m : a){
                System.out.print(m+" ");
            }
        }
    }
}

