package powerpackage;

public class PowerFinder {
    public static int of(int base, int exp) {
        int p = 1;
        for (int i = 0; i<exp; i++) {
            p *= base;
        }
        return p;
    }
}
