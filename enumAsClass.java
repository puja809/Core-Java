enum Days{

    Sunday("Holiday"),Monday,Tuesday,Wednesday,Thursday,Friday,Saturday("Holiday");
    private String types;

    private Days(String types){
        this.types=types;
    }

    private Days() {
        types="Not Defined";
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

}

public class enumAsClass {
    public static void main(String[] args){
    for(Days day:Days.values()){
        System.out.println(day+":"+day.getTypes());
    }
    }
}
