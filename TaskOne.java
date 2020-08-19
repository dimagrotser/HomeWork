public class TaskOne {

    public static void main(String args[]) {
        int input = 100;
        String output = reverse(input);
        System.out.println("Input : " + input + " Output : " + output);
    }

    public static String reverse(int number) {
        String num = Integer.toString(number);
        return new StringBuilder(num).reverse().toString();
    }
}
