class Students{
    int marks;
    String name;
}

public class array_of_objects {
    public static void main(String[] args){
    //Object for class student
        Students s1=new Students();
        s1.name="Puja";
        s1.marks=99;

        Students s2=new Students();
        s2.name="Nikhil";
        s2.marks=100;

    //Array of objects
        Students stud[]=new Students[2];
        stud[0]=s1;
        stud[1]=s2;
        for(int i=0;i<stud.length;i++){
            System.out.println(stud[i].name+":"+stud[i].marks);
        }
    }
}
