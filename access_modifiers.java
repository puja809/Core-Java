import tools.*;
class add extends division{
    public int add(int n,int m){
        return n+m;
    }
        }

public class access_modifiers {
    public static void  main(String[] args){
        add obj=new add();
        //As div is public we are able to access it from other package
        System.out.println(obj.div(4,9));
    }
}
