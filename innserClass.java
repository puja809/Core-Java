class abc{
    public void show(){
        System.out.println("In a show abc");
    }
    class xyz{
        public void show1(){
            System.out.println("In a show xyz");
        }
    }
    static class mno{
        public void show2(){
            System.out.println("In a show mno");
        }
    }
}

public class innserClass {
    public static void main(String[] args){
        abc obj=new abc();
        obj.show();
        abc.xyz obj1=obj.new xyz();
        obj1.show1();
        abc.mno obj2=new abc.mno();
        obj2.show2();
    }
}
