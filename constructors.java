class cars{
    String models;
    String color;
    //Default constructor
    public cars(){
//        System.out.println("In constructor");
        models="BMW";
        color="Red";
    }

    //Parametarized constructor
    public cars(String models, String color) {
        this.models = models;
        this.color = color;
    }
}


public class constructors {
    public static void  main(String a[]){
        cars obj=new cars();//default constructor is called
        cars obj1=new cars("Tata","Blue");//Parametarized constructor is called
        System.out.println(obj.models+": "+obj.color);
        System.out.println(obj1.models+": "+obj1.color);
    }
}
