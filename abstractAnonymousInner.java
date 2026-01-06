abstract class Metal{
    public abstract void type();
    public abstract void config();
}


public class abstractAnonymousInner {
    public static void main(String[]a){
        Metal obj=new Metal(){
            public void type(){
                System.out.println("Iron is a type of metal.");
            }
            public void config(){
                System.out.println("Inside config!!");
            }
        };
        obj.type();
        obj.config();

    }
}
