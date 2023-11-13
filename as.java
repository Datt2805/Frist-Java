class as {
    String comp_name;
    String model_name;
    double no_blade;
    double motor_size;
    int blade_pitch;

    as(){
        comp_name = "lknhdfflkk";
        model_name = "kakjdhdhf";
        no_blade = 0.0;
        motor_size = 0;
        blade_pitch = 7339;
    }

    as(String comp_name,String model_name,double no_blade,double motor_size, int blade_pitch){
        this.comp_name = comp_name;
        this.model_name = model_name;
        this.no_blade = no_blade;
        this.motor_size = motor_size;
        this.blade_pitch = blade_pitch;
    }

    void display(){
        System.out.println(comp_name);
        System.out.println(model_name);
        System.out.println(no_blade);
        System.out.println(motor_size);
        System.out.println(blade_pitch);
    }

    public static void main(String[] args) {
        as s = new as();
        s.display();
        as ss = new as("ssdfs","sdfsd",453.345,345,345);
        ss.display();
    }
}
