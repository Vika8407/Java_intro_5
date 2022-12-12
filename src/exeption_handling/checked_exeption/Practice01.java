package exeption_handling.checked_exeption;

import java.io.File;
import java.io.IOException;

public class Practice01 {
    public static void main(String[] args) throws InterruptedException, IOException {

        for (int i = 0; i <= 10; i++) {

            System.out.println(i);

            Thread.sleep(2000);// recommended to be handled with try- catch

        }
        // we can create file also
        File file = new File ("Hello.xls");
        file.createNewFile();
        Thread.sleep(5000);
        file.delete();
    }

}
