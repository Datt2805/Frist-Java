class recuesion_d {
    public static void main(String[] args) {
        recuesion_d r = new recuesion_d();
        int a=r.sum(3);
        System.out.println(a);
    }
    int sum(int b){
        if (b>0) {
            return b+sum(b-1);
        }
        else {
            return 0;
        }
    }
}