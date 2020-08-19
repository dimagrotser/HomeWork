import java.math.BigDecimal;
import java.util.Scanner;

public class TaskTwo {


    public static void main(String args[]) {
        double input = 123.45;
        String output = reverse(input);
        System.out.println("Input : " + input + " Output : " + output);
    }

    public static String reverse(double number) {
        BigDecimal bdNum = BigDecimal.valueOf(number);
        int integerPart = bdNum.intValue();
        BigDecimal dp = bdNum.remainder(BigDecimal.ONE);
        while (dp.remainder(BigDecimal.ONE).floatValue() > 0) {
            dp = dp.movePointRight(1);
        }
        int decimalPart = dp.intValue();
        return decimalPart + "." + integerPart;

    }




}
