package practice.methods;

public class VoidMethodPractice {
    public static void main(String[] args) {
        /* Create a method which will take an ice cram flavor and print the message about your ice cream
        exemples;
        chocolate -> You have a great taste
        vanilla -> Not bad
        strawberry -> Enjoy it!
        */
      VoidMethodPractice.flavorPicker("chocolate");
      VoidMethodPractice.flavorPicker("Chocolate");
      VoidMethodPractice.flavorPicker("strawberry");

      VoidMethodPractice.checkAge(19);
      VoidMethodPractice.checkAge(20);
      VoidMethodPractice.checkAge(25);
      VoidMethodPractice.checkAge(-25);

      VoidMethodPractice.checkCreditScore(99.34);
      VoidMethodPractice.checkCreditScore(1099.34);
      VoidMethodPractice.checkCreditScore(2099.34);
      VoidMethodPractice.checkCreditScore(5099.34);
      VoidMethodPractice.checkCreditScore(-5099.34);
    }

    public static void flavorPicker(String flavor) {
//        if (flavor.equals("chocolate")){
//            System.out.println("You have a great taste ");
//        }
//        else if (flavor.equals("vanila")){
//            System.out.println(" Not bat");
//        }
//        else if (flavor.equals("strawberry")){
//            System.out.println("Enjoy it");
//        }
//        else{
//            System.out.println(" give me a valid flavor");
//        }

        switch (flavor){
            case "chocolate":
                System.out.println( " You have a great taste");
                break;
            case "vanilla":
                System.out.println(" Not bas!");
                break;
                case "strawberry":
                System.out.println(" enjoy it");
                break;
            default:
                System.out.println("Give me a valid flavor");
                break;

        }
    }
            /*
        Create a public static method named as "checkAge", it is going to take an age as parameter
        then prints according to following:
        -> 0 - 19 -> You are a teenager
        -> 20 - 21 -> You can drive
        -> 21+ -> You can drink coke
        */
    public static void checkAge(int age) {
        if( age >= 0 && age <= 19){
            System.out.println(" You are a teenager");
        }
        else if(age == 20 || age == 21){//age >= 20 && age <= 21
            System.out.println(" You can drive");
        }
        else if(age >21){
            System.out.println(" You can drink coke ");
        }
        else {
            System.out.println("Give me a valid age ");
            }
        }
            /*
        Create a public static method named as "checkCreditScore", it is going to take a balance as parameter
        then it will print according to following:

        balance:
        0.00 - 999.99 -> Low credit score
        1000.00 - 1999.99 -> Medium credit score
        2000.00 - 2999.99 -> Good credit score
        else -> No valid credit score!
        */
        public static void checkCreditScore(double balance){
        if(balance >= 0.00 && balance <= 999.99){
            System.out.println(" Low credit score");
        }
        else if (balance >= 1000.00 && balance <1999.99){
            System.out.println("Medium credit score");
        }
        else if ( balance >= 2000.00 && balance < 2999.99){
            System.out.println(" Good credit score");
        }
        else{
            System.out.println(" Not valid score");
        }
        }


    }

