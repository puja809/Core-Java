public class enhanced_for {
    public static void main(String[] args){
        int a[]=new int [4];
        //Enhanced for loop
        for(int n:a){
            n=(int)(Math.random()*10);
            System.out.println(n);
        }

    }
}
