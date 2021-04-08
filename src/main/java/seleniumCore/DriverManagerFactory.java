package seleniumCore;

public class DriverManagerFactory {

    public static DriverManager setDriver(String driver){
        DriverManager driverManager = null;

        switch (driver){
            case "OPERA":{
                driverManager = new OperaDriverManager();
            }break;
            case "CHROME":{
                //driverManager = new ChromeDriverManager();
            }break;
        }
        return driverManager;
    }
}
