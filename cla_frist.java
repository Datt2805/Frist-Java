class cla_frist {
    int a = 10;
    String b = "Datt";

    void Show() {
        System.out.println(a + " " + b);
    }
}

class Innercla_frist {
    public static void main(String[] args) {
        cla_frist r;
        r = new cla_frist();
        r.Show();
    }
    
}

