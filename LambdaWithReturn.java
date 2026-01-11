@FunctionalInterface
interface Calculate{
    int add(int a,int b);
}
public class LambdaWithReturn {
    public static void main(String[] args){
        Calculate calc=(a,b)->a+b;
        int result=calc.add(100,890);
        System.out.println(result);
    }
}
