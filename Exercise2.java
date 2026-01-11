// TODO: Create an interface called Machine with one method: String start()
interface Machine{
    String start();
}


// TODO: Create an abstract class called Appliance that:
// - Implements Machine interface
abstract class Appliances implements Machine{
    public String name;
    public String start(String name){
        return name;
    }

    public Appliances() {
        this.name = name;
    }
}


// TODO: Create a class Fan that:
// - Extends Appliance
class Fan extends Appliances{


    @Override
    public String start(){
        return "Fan is running";
    }
}

// TODO: Create a class WashingMachine that:
// - Extends Appliance
class WashingMachine extends Appliances{


    @Override
    public String start(){
        return "Washing Machine is operating";
    }
}


public class Exercise2 {
    public static void main(String[] args) {
        // TODO: Create objects of Fan and WashingMachine using interface references
        // TODO: Print the result of start() for each object
        Machine obj1=new Fan();
        Machine obj2=new WashingMachine();
        System.out.println(obj1.start());
        System.out.println(obj2.start());
    }
}