import java.util.Scanner;

 class practical5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to print: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        int num = 2;

        System.out.println("First " + n + " prime numbers are:");
        while (count < n) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}


       
        


