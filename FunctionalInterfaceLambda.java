@FunctionalInterface
interface Cinema{
    void screen();
}

@FunctionalInterface
interface Holiday{
    void days(String days);
}
public class FunctionalInterfaceLambda {
    public static void main(String[] args){

        Cinema show=()->{//Lambda Function
            System.out.println("This is screen 1");
        };
        show.screen();

        Holiday days=(name)->{
            System.out.println(name);
        };
        days.days("Monday");
    }

}
