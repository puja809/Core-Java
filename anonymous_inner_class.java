class AnonymousInnerClass{
    public void show(){
        System.out.println("Inside main show");
    }
}
public class anonymous_inner_class {
    public static void main(String[] args){
        AnonymousInnerClass obj=new AnonymousInnerClass(){
            //Creating an anonymous inner class that overrides the show() method
            //Anonymous inner class overriding the show() method
            public void show() {
                System.out.println("Inside sub-show");
            }
        };
        obj.show();
    }
}
