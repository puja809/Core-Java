enum Status{
    Active, Inactive, Partially_Active;
}
public class enum_ {
    public static void main(String[] args){
        Status st=Status.Active;
        Status arr[]=Status.values();
        System.out.println(st);
        for(Status q:arr){
            System.out.println(q+": "+q.ordinal());
        }

    }
}
