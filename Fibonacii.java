public class Fibonacii {
    public static void findFib(int n){
        int n1 = 0;
        int n2 = 1;
        int next;
        if (n >= 1) System.out.print(n1 + " ");
        if (n >= 2) System.out.print(n2 + " ");
        
        for(int i = 3; i <= n; i++){
            next = n1 + n2;
            System.out.print(next + " ");
            n1 = n2;
            n2 = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print("Fibonacci series: ");
        findFib(n);
    }
}
