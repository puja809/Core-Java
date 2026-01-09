enum Statuses{
    Active, Inactive, Partially_Active;
}
public class enum_If_Switch {
    public static void main(String[] args){
        Statuses st=Statuses.Active;
        switch (st){
            case Active:
                System.out.println("User is active");
                break;
            case Inactive:
                System.out.println("User is inactive");
                break;
            case Partially_Active:
                System.out.println("User is sometimes active");
                break;
            default:
                System.out.println("Invalid status");
        }

        if(st==Statuses.Active){
            System.out.println("User is active");
        }
        else if(st==Statuses.Inactive){
            System.out.println("User is inactive");
        }
        else if(st==Statuses.Partially_Active){
            System.out.println("User is sometimes active");
        }
        else{
            System.out.println("Invalid status");
        }
    }
}
