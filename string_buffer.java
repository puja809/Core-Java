public class string_buffer {
    public static void main(String[] args){
        StringBuffer sb= new StringBuffer("Puja");
        System.out.println(sb.capacity());//default capacity is 16 plus the size of the string 'Puja'
        System.out.println(sb.length());//prints the length of the string
        System.out.println(sb.append(" Chatterjee"));//appends a string to original string
        System.out.println(sb.deleteCharAt(0));//gives the character at index 9
        System.out.println(sb.insert(0,"P"));//inserts a string at an index

    }
}
