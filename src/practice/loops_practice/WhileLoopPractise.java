package practice.loops_practice;

import utilities.RandomNumberGenerator;

public class WhileLoopPractise {
    public static void main(String[] args) {

        int random = RandomNumberGenerator.getARandomNumber(1, 20);

        while (random != 7){
            random = RandomNumberGenerator.getARandomNumber(1, 20);
            if (random ==7){
                break;
            }
            System.out.println("Random number = " + random);
        }
        System.out.println("Congrats you hit the number : " + random);
    }
}
