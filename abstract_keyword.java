//abstract methods have to be defined inside abstract class
abstract class Rocket{
    public abstract void fly();
    public void show(){
        System.out.println("Inside a rocket");
    }
}


class Plane extends Rocket{ //concrete class
    public void fly(){
        System.out.println("This object can fly...");
    }

}

public class abstract_keyword {
    public static void main(String[] args){
        //abstract class can have reference variable but not an object
        Rocket obj =new Plane();
        obj.fly();
        obj.show();
    }
}
