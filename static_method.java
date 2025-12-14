class mobile{
    static String name;
    String model;
    public static void show(mobile obj){
        System.out.println(name+":"+obj.model);
    }
        }
public class static_method {
    public static void main(String[] args){
        mobile obj1=new mobile();
        obj1.model="Samsung";

        mobile obj2=new mobile();
        obj2.model="Apple";


        mobile.name="Phone";

        mobile.show(obj1);
        mobile.show(obj2);

    }
}
