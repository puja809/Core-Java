class Ducking{
    // show() method ducks the exception by passing it to the calling method instead of handling it
    public void show() throws ArithmeticException{
        System.out.println(99/0);
    }
}

public class throwsException {
    public static void main(String[] args){
        Ducking obj=new Ducking();
        try{
            obj.show();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
