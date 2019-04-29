import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Main {
    public static void main(String[] args) {

        Config conf = ConfigFactory.load();
        String getEnvVariable = conf.getString("welcome.message");

        System.out.println(getEnvVariable);

        Addition add = new Addition(10, 20);
        System.out.println("Sum is : " + add.add());

        Subtraction sub = new Subtraction(50, 30);
        System.out.println("Diff is : " + sub.subtract());
    }
}
