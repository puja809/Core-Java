class Mobile{
    String model;
    static String name;
    int price;

    public void show_data(){
        System.out.println(model+": "+name+": "+price);
    }
}

public class static_var {
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.model="Samsung";
        obj1.price=15000;

        Mobile obj2=new Mobile();
        obj2.model="Apple";
        obj2.price=30000;

        Mobile.name="Phone";//static variables can be used without creating objects

        obj1.show_data();
        obj2.show_data();
    }
}
