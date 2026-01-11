class Mango{
    public void show(){
        System.out.println("Mango is a fruit!!");
    }
}

class Fruit extends Mango{
    @Override//This is an annotation which gives some information about the method
    public void show(){
        System.out.println("All mangoes are fruits!!");
    }
}

public class annotations {
    public static void main(String[] args){
        Fruit obj=new Fruit();
        obj.show();

    }
}
