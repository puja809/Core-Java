public class smallest_num_array {
    public static void main(String[] args){
        int n[]={45, 22, 89, 16, 90, 33};
        int min_val=n[0];
        int max_val=n[0];
        for(int num:n){
            if(num>max_val){
                max_val=num;
            }
            if(num<min_val){
                min_val=num;
            }
        }
        System.out.println("Min:"+min_val+" "+"Max val:"+max_val);
    }
}
