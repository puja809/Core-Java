class Humans{
    private int age;
    private String name;

    //Getter method
    public int getAge(){
        return age;
    }
    //Setter method
    public void setAge(int age){
        this.age=age;
    }

    //Getter method
    public String getName(){
        return name;
    }
    //Setter method
    public void setName(String name){
        this.name=name;
    }
}

public class this_keyword {
    public static void main(String[] args){
        Humans obj=new Humans();
        obj.setAge(11);
        obj.setName("Diya");
        System.out.println(obj.getName()+':'+obj.getAge());
    }
}
