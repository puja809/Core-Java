//Parent class
class Calc{
    public int add(int n,int m){
        return n+m;
    }

    public int sub(int n,int m){
        return n-m;
    }
}

//child class
class AdvCal extends Calc{
    public int mul(int n,int m){
        return n*m;
    }
    public int div(int n,int m){
        return n/m;
    }
}

//Child class of another child class(Parent class in this case)--multi-level inheritance
class VeryAdvCal extends AdvCal{
    public double power(int n,int m){
        return Math.pow(n,m);
    }
}


public class inherit {
    public static void main(String[] args){
        //Object for child class has access to parent class methods too
        AdvCal obj=new AdvCal();
        //Object for another child class in multi-level inheritance
        VeryAdvCal obj1=new VeryAdvCal();
        int r1= obj.add(10,20);
        int r2 = obj.sub(20,10);
        int r3 = obj.mul(20,10);
        int r4= obj.div(20,10);
        double r5= obj1.power(20,2);

        System.out.println(r1+" "+r2+" "+" "+r3+" "+r4+" "+r5);
    }
}
