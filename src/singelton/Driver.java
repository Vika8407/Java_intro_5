package singelton;

public class Driver {


      // achieve singleton pattern for driver
    public static Driver driver;//instance variable
    private Driver(){}//private constructor

    public static Driver getDriver(){
        if (driver == null) {
            driver = new Driver();
        }
        return driver;
    }
}
