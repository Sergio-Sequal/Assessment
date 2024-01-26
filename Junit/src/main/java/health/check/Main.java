
package health.check;


public class Main {
    public static void main(String[] args) {
        
        HealthCheck connection = new HealthCheck();
        //connection.sqlServerConection();
        //connection.postgreSQLConnection("localhost", 5432, "sequaltest", "postgres", "Sergio_2022");
        connection.mySQLConnection("localhost", 3306, "sequaltest", "root", "");
        
        
    }
    
}
