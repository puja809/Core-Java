//Dynamic Method Dispatch:
class A_new{
    public void show(){
        System.out.println("In A show");
    }
}

class B_new extends A_new{
    public void show(){
        System.out.println("In B show");
    }
}

public class polymorphism {
    public static void main(String[] args){

        //The same object can perform different actions depending on how it is used.
        A_new obj=new A_new();
        obj.show();

        obj=new B_new();
        obj.show();
    }
}
