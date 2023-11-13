class const_c {
    int a; 
    String b;
    const_c(){
        a = 0;
        b = null;
    }
    void Show(){
        System.out.println(a+ " " +b);
    }
}
class Innerconst_c {
    public static void main(String[] args) {
        const_c s = new const_c();
        s.Show();
    }
}
