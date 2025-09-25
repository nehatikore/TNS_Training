public class ArmstrongUsingNotZero {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int result = 0;

        while (num != 0) {
            int digit = num % 10;
            result += digit * digit * digit; // cube of digit
            num = num / 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is Not an Armstrong number");
    }
}
