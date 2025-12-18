class Show{
    public Show(){
        System.out.println("In constructor");
    }

    public void MyShow(){
        System.out.println("In the show");
    }
}
public class anonymous_obj {
    public static void main(String[] args){
        new Show().MyShow();//Anonymous Object without a reference
        Show obj=new Show();//Reference variable

        obj.MyShow();

    }
}
