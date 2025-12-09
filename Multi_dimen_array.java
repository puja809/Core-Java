public class Multi_dimen_array {
    public static void main(String[] args){
        int n[][]=new int[3][4];
        for(int i=0;i<3;i++) {
            for (int j = 0; j < 4; j++) {
                n[i][j]=(int)(Math.random()*10);
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
//        for(int num[]:n){
//            for(int m:num){
//                System.out.print(m + " ");
//            }
//            System.out.println();
//        }
    }
}
