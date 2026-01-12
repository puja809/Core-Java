
public class MultipleException {
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        int a=10;
        int b=0;
        String st=null;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{
            System.out.println(st.length());
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
