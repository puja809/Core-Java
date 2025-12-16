class Human{
    private int age;
    private String name;

    //Getter method
    public int getAge(){
        return age;
    }
    //Setter method
    public void setAge(int a){
        age=a;
    }

    //Getter method
    public String getName(){
        return name;
    }
    //Setter method
    public void setName(String n){
        name=n;
    }
}

public class encapsulation {
    public static void main(String[] args){
        Human obj=new Human();
        obj.setAge(11);
        obj.setName("Diya");
        System.out.println(obj.getName()+':'+obj.getAge());
    }
}
