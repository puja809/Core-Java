// An interface is a blueprint that defines what methods a class must implement.
// It provides method declarations but no implementation.
//A class can implement multiple interfaces
//An interface can extend another interface

interface Gems{
    int age=27;//Variables in interface are by default static, final and public
    //methods in interface are by default public and abstract
    void name();
    void color();
}

interface Brand{
    void show();
}


interface Shoes extends Brand{
    void shoeBrand();
}
class Gemstone implements Gems,Shoes{

    public void name() {
        System.out.println("Gold");
    }


    public void color() {
        System.out.println("Yellow");
    }

    public void show() {
        System.out.println("This is show in Brand!");
    }


    public void shoeBrand() {
        System.out.println("Bata is a shoe brand!!");
    }
}


public class interface_ {
    public static void main(String []arg){
        //Gems obj; //Gemstone obj=new Gemstone();--This can also be done
        Gemstone obj=new Gemstone();
//        obj=new Gemstone();
        obj.color();
        obj.name();
        Brand obj1;
//        obj1=new Gemstone();
        System.out.println(Gems.age);
        obj.show();
        Shoes obj2;
//        obj2=new Gemstone();
        obj.shoeBrand();
    }
}
