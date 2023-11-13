class Inheriting_Data_members {
    String name;
    int age;
    Inheriting_Data_members(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class InnerInheriting_Data_members extends Inheriting_Data_members{
    int roll;
    InnerInheriting_Data_members(String name,int age,int roll){
        super(name, age);
        this.roll = roll;
    }
    void displayData(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("roll number : "+roll);
    }
}
class InnerInheriting_Data_members_1 {
    public static void main(String[] args) {
        InnerInheriting_Data_members s = new InnerInheriting_Data_members("Datt",14,2323);
        s.displayData();
        System.out.print("name : "+s.name+" ,");
        System.out.println("age : "+s.age);
    }    
}

