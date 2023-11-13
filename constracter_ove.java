class constracter_ove {
    int a;
    double b;
    String c;

    constracter_ove() {
        a = 100;
        b = 23.43;
        c = "Datt";
    }

    constracter_ove(int x) {
        a = x;
    }

    constracter_ove(double y, String z) {
        b = y;
        c = z;
    }
}

class Innerconstracter_ove {
    public static void main(String[] args) {
        constracter_ove r = new constracter_ove();
        constracter_ove r2 = new constracter_ove(10);
        constracter_ove r3 = new constracter_ove(22.32, "Datt Bhatt");
        System.out.println(r.a+" "+r.b+" "+r.c);
        System.out.println(r2.a);
        System.out.println(r3.b+" "+r3.c);

    }
}
