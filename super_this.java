//super class
class A extends Object{

    public A(){
        super();
        System.out.println("In A.");
    }

    public A(int n){
        super();
        System.out.println("In A int");
    }
}

//sub class
class B extends A{
    public B(){
        //super(5) will call parameterized constructor of parent class
        super(5);
        System.out.println("In B.");
    }

    public B(int n){
        //super() will call the constructor/method of Parent class
        // super(n);
        this();//this() calls the constructor of the same class
        System.out.println("In B int");
    }
}


public class super_this {
    public static void main(String[] args){
        B obj=new B(5);
    }
}
