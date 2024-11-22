import java.rmi.Naming;

public class Server {
    public static void main(String[] args) {
        try {
            CalculatorImpl calc = new CalculatorImpl();
            Naming.rebind("rmi://localhost:1099/CalculatorService", calc);
            System.out.println("Calculator Service is running...");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
