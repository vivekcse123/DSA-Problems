public class sumOfDigit {
    public static int sum(int n){
        int sum = 0;
        while(n !=0){
            int rem = n % 10;
            sum += rem;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 123;
        System.out.println("Digit is: " + n);
        System.out.println("Sum of digit is: " + sum(n));
    }
}
