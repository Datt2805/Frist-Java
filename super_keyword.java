// class super_keyword {
//     int a = 10;
//     void show(){
//         System.out.println("Hello gi Hello");
//     }
// }
// class Innersuper_keyword extends super_keyword{
//     int a = 20;
//     void show(){
//         super.show();
//         System.out.println("Helloooooo");
  
//         System.out.println(super.a);
//         System.out.println(a);
//     }
//      public static void main(String[] args) {
//         Innersuper_keyword s = new Innersuper_keyword();
//         s.show();
//     }
// } 
// class Innersuper_keyword_1 {
    
//     public static void main(String[] args) {
//         Innersuper_keyword s = new Innersuper_keyword();
//         s.show();
//     }
// }
class super_keyword {

    super_keyword(int a){
        System.out.println("Hello gi Hello"+a);
    }
}
class Innersuper_keyword extends super_keyword{
    Innersuper_keyword(){
        super(100);
        System.out.println("Helloooooo");
    }
     public static void main(String[] args) {
        Innersuper_keyword s = new Innersuper_keyword();
         
    }
} 