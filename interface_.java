// An interface is a blueprint that defines what methods a class must implement.
// It provides method declarations but no implementation.

interface Gems{
    int age=27;//Variables in interface are by default static, final and public
    //methods in interface are by default public and abstract
    void name();
    void color();
}

class Gemstone implements Gems{

    public void name() {
        System.out.println("Gold");
    }


    public void color() {
        System.out.println("Yellow");
    }
}


public class interface_ {
    public static void main(String []arg){
        Gems obj; //Gemstone obj=new Gemstone();--This can also be done
        obj=new Gemstone();
        obj.color();
        obj.name();
        System.out.println(Gems.age);
    }
}
