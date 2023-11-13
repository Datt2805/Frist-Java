import java.util.Scanner;

interface interfc {
    void input();//public+abstract
    void output();//public+abstract
}
class datt implements interfc{
    String name;
    double sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        sal = sc.nextDouble();
    }
    public void output(){
        System.out.println(name+" "+sal);
    }
    public static void main(String[] args) {
        interfc ss = new datt(); 
        ss.input();
        ss.output();
    }
}
