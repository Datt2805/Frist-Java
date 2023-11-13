class method_overridig {
    void draw(){
        System.out.println("Can't say shape Type");
    }    
}
class Innermethod_overridig extends method_overridig{
    @Override
    void draw(){
        System.out.println("Square shape");
    }
    public static void main(String[] args) {
        method_overridig r = new Innermethod_overridig();
        r.draw();
    }
}
