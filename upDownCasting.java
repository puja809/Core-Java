class X{
    public void show(){
        System.out.println("In a X show!");
    }
}

class Y extends X{
    public void show1(){
        System.out.println("In Y show");
    }
}

public class upDownCasting {
    public static void main(String[] args){
        X obj=(X) new Y();//Upcasting
        Y obj1= (Y) obj;//Downcasting
        obj.show();
        obj1.show1();

    }
}
