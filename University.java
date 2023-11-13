class University {
    String university_name;
    int establishment_year;

    University(String university_name,int establishment_year){
        this.university_name = university_name;
        this.establishment_year = establishment_year;
    }

    void display(){
        System.out.println(university_name);
        System.out.println(establishment_year);
    }
}

class school extends University{
    String school_name;
    int num_program;
    int num_students;
    int num_staff;

    school(String university_name,int establishment_year,String school_name,int num_program,int num_students,int num_staff){
        super(university_name,establishment_year);
        this.school_name = school_name;
        this.num_program = num_program;
        this.num_students = num_students;
        this.num_staff = num_staff;
    }

    @Override
    void display() {
        super.display();
        System.out.println(school_name);
        System.out.println(num_program);
        System.out.println(num_students);
        System.out.println(num_staff);
    }

    public static void main(String[] args) {
        school s = new school("My University", 2000, "My School", 10, 500, 50);
        s.display();
    }
}
