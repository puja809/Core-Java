import java.util.Objects;

//any parent class by default extends Object class
class random{
    public String model;
    public int price;

    public void show(){
        System.out.println("In a random class!");
    }
    //If we create our own toString method obj will call this method instead of the toString from Object class
    public String toString(){
        return "random"+"#"+"78910";
    }

    //User-defined equals method:
    public boolean equals(random that){
        if(this.model.equals(that.model) && this.price==that.price){
            return true;
        }
        else{
            return false;
        }


    }


}

public class object_class {
    public static void main(String[] args){
        random obj=new random();
//        obj.show();
        System.out.println(obj);//This by default calls toString and gives a hashcode
//        System.out.println(obj.toString());

        obj.model="Lenovo";
        obj.price=1000;

        random obj1=new random();
        obj1.model="Lenovo";
        obj1.price=1000;
        System.out.println(obj1);
        System.out.println(obj1.equals(obj));//this compares the object based on their hashcode but as we have override the method its using the equals method from the class

    }
}
