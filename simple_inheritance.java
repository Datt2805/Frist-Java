class simple_inheritance{
    int roll,marks;
    String name;
    protected void input(){//method
        System.out.println("Enter roll,marks & name");
    }
}
class Innersimple_inheritance extends simple_inheritance{
    void display(){
        roll = 1;
        marks = 23;
        name = "Datt Bhatt";
        System.out.println(roll+" "+marks+" "+name);
    }
    public static void main(String[] args) {
        Innersimple_inheritance data = new Innersimple_inheritance();
        data.input();
        data.display();
    }
}