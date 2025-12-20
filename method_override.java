class adding{
    public int add(int a,int b){
        return a+b;
    }
}

//child class method add() will override the add() method of parent class.
class extra extends adding{
    public int add(int a,int b){
        return a+b+2;
    }
}

public class method_override {
    public static void main(String[] args) {
        extra obj = new extra();
        System.out.println(obj.add(4,5));
    }
}