class ObjectPassingExample {
    int value;

    ObjectPassingExample(int val){
        value = val;
    }
}
public class  passing_method{
    public static void modifyObject(ObjectPassingExample obj, int newValue) {
        obj.value = newValue;
    } 
    
    public static void main(String[] args) {
        ObjectPassingExample myObj = new ObjectPassingExample(5);
        System.out.println("Before: " + myObj.value);
        modifyObject(myObj,10);
        System.out.println("After: " + myObj.value);
    }
}