class Car{
    String name;
    String color;
}
public class enhanced_for_array_obj {
    public static void main(String[] args){
        Car model1=new Car();
        model1.name="BMW";
        model1.color="Red";

        Car model2=new Car();
        model2.name="Toyota";
        model2.color="Blue";

        Car obj[]=new Car[2];
        obj[0]=model1;
        obj[1]=model2;

        //Enhanced for loop
        for(Car c:obj){
            System.out.println(c.name+": "+c.color);
        }

    }
}
