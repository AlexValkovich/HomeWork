import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String str = "ahb acb aeb aeeb adcb axeb";

        Pattern pattern = Pattern.compile("a.b");

        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}