import java.util.*;

public class SieveOfEratosthenes {
    boolean[] primes;
    int n;

    public SieveOfEratosthenes(int n) {
        this.n = n;
        primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = primes[1] = false;
    }

    public void sieve() {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (primes[i]) {
                for (int j = i * i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
    }

    public void output() {
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void sieveOfEratosthenes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите n: ");

        int n = scanner.nextInt();

        SieveOfEratosthenes sieve = new SieveOfEratosthenes(n);
        sieve.sieve();
        sieve.output();
    }
}