public class Exercise4{
    // TODO: Define custom exception InvalidAgeException extending Exception
    static class InvalidAgeException extends Exception{
        public InvalidAgeException(String str){
            super(str);
        }
    }

    public static void checkAge(int age) throws InvalidAgeException {
        // TODO: Throw custom exception if age < 18, else print "Access granted"
        if (age < 18){
            throw new InvalidAgeException("Exception caught: Age must be 18 or older");
        }

    }

    public static void main(String[] args) {
        // TODO: Call checkAge(16) and checkAge(21) inside separate try-catch blocks
        try{
            checkAge(16);
            System.out.println("Access granted");
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        try{
            checkAge(21);
            System.out.println("Access granted");
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }

}