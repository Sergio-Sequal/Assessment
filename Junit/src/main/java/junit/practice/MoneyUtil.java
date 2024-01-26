package junit.practice;

import java.text.DecimalFormat;

public class MoneyUtil {

    public static String format(double money) {
        return format(money, "$");
    }
    
    public static String format(double money, String symbol){
        if(symbol == null){
            throw new IllegalArgumentException();
        }
        if (money < 0) {
            symbol = "-" + symbol;
            money *= -1;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String rounded = decimalFormat.format(money);
        return symbol + rounded;
    }
    
    

}
