public class loops_while {
    public static void main(String s[]) {
        int i = 1;
        while (i <= 4) {
            System.out.println(i);
            int j=1;
            while(j<=3){
                System.out.println("Hi! "+j);
                j++;
            }
            i++;
        }
    }
}
