interface Wood{
    void material();
}
class Chair implements Wood{

    public void material() {
        System.out.println("Chair is made of wood!!");
    }
}


class Table implements Wood{

    public void material() {
        System.out.println("Table is made of wood!");
    }
}

class Furniture{
    public void material(Wood w){
        w.material();
    }
}


public class InterfaceNeed {
    public static void main(String[] args){
        Wood obj=new Chair();
        Wood obj1=new Table();
        Furniture show=new Furniture();
        show.material(obj);
        show.material(obj1);

    }
}
