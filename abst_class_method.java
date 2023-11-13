abstract class abst_class_method {
    abstract void dev();
    abstract void sss();
}
abstract class Innerabst_class_method extends abst_class_method{
    @Override
    void dev(){
        System.out.println("qwertyuiop");
    }
}
class Innerabst_class_method_1 extends Innerabst_class_method{
    @Override
     void sss(){
        System.out.println("aqswdefrgthyjukilo");
    }
    public static void main(String[] args) {
        Innerabst_class_method_1 ss = new Innerabst_class_method_1();
        ss.dev();
        ss.sss();

    }
}
 