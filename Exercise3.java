public class Exercise3 {
        public static void main(String[] args) {
            int numerator = 50;
            int denominator = 0;
            int result=0;
            // TODO: Handle division using try-catch
            try{
                result=50/0;
            }
            catch (ArithmeticException e){
                System.out.println("Cannot divide by zero");
            }
            finally {
                System.out.println("Program completed");
            }

        }
    }


