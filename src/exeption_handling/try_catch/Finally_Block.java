package exeption_handling.try_catch;

public class Finally_Block {
    public static void main(String[] args) {

        String greeting = "hello";
        try {
            greeting.charAt(10);
        } catch (Exception e) {
            greeting.charAt(9);
        } finally {
            {
                System.out.println("End of the program");
            }
        }
    }
}