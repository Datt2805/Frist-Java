class thisKeyword {
    // void show(){
    //     System.out.println(this);
    // }    
    // public static void main(String[] args) {
    //     thisKeyword r = new thisKeyword();  
    //     System.out.println(r);
    //     r.show();   
    // }

    // 2
    int a;
    thisKeyword(int a){
        this.a=a;
    }
    void show(){ 
        System.out.println(a);
    }    
    public static void main(String[] args) {
        thisKeyword r = new thisKeyword(100);  
        r.show();   
    }
}
