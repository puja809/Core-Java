class fruit{
    static String types;
    String name;

    //constructor
    public fruit(){
        name="name";
        System.out.println(name);
    }
    //static block
    static {
        types = "fruit";
        System.out.println(types);
    }
}

public class static_block {
    public static void main(String[] args)throws ClassNotFoundException{
        Class.forName("fruit");//when the class is loaded static method is called
        fruit obj1=new fruit();//whenever a new object is created a constructor is called. If no constructor is defined default constructor is called.

    }
}
