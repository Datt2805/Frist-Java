class hierarehical_inheritance {
    int a,b,c;
    void add(){
        a = 100;
        b = 200;
        c = a + c;
        System.out.println("Sum to of: "+c);
    }    
}
class Innerhierarehical_inheritance extends hierarehical_inheritance{
    void sub(){
        a = 200;
        b = 100;
        c = a - b;
        System.out.println("Sub of two: "+c);
    }    
}
class Innerhierarehical_inheritance_1 extends hierarehical_inheritance{
    void print1(){
        System.out.println("Hi i am Datt");
    }
}
class Innerhierarehical_inheritance_2 extends hierarehical_inheritance{
   void print2(){
        System.out.println("I am Sudent og GSFC");
   }
}
class Innerhierarehical_inheritance_3 {
    public static void main(String[] args) {
        Innerhierarehical_inheritance s = new Innerhierarehical_inheritance();  
        Innerhierarehical_inheritance_1 ss = new Innerhierarehical_inheritance_1();
        Innerhierarehical_inheritance_2 sss = new Innerhierarehical_inheritance_2();
        s.sub();
        s.add();
        ss.print1();
        ss.add();
        sss.print2();
        sss.add();
    }    
}
