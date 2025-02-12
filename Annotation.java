class A{
    public void show(){
        System.out.println("hey");
    }
}
class B extends A{
    @Override     //override helps to find out the error in function name
    public void show(){
        System.out.println("Hii");
    }
}

public class Annotation {
   public static void main(String[] args) {
    B obj=new B();
    obj.show();
   }
}
