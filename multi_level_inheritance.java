class multi_level_inheritance {
    int a,b,c;
    void add(){
        a = 10;
        b = 20;
        c = a + b;
        System.out.println("Sum of two Numbers: "+c);
    }
    void sub(){
        a = 200;
        b = 100;
        c = a - b;
        System.out.println("Sub of two Numbers: "+c);
    }
}
class Innermulti_level_inheritance extends multi_level_inheritance{
    void multi(){
        a = 100;
        b = 200;
        c = a * b;
        System.out.println("multiplication of two Numbers: "+c);
    }
    void div(){
        a = 200;
        b = 100;
        c = a / b;
        System.out.println("Division of two Numbers: "+c);
    }
}
class Innermulti_level_inheritance_1 extends Innermulti_level_inheritance {
    void rem(){
        a = 200;
        b = 100;
        c = a % b;
        System.out.println("Remeinder of two Numbers: "+c);
    }
    public static void main(String[] args) {
        Innermulti_level_inheritance_1 d = new Innermulti_level_inheritance_1();
        d.add();
        d.sub();
        d.multi();
        d.div();
        d.rem();
    }
}
 