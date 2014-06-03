package multiplicationtables;

/**
 * Print out the grade school multiplication table upto 12*12. 
 * Print out the table in a matrix like fashion, each number formatted to a width of 4 
 * (The numbers are right-aligned and strip out leading/trailing spaces on each line).
 * 
 * @author Daniel Horobeanu <horobeanu@yahoo.com>
 */
public class Main {
    public static int N = 12;
    public static void main(String[] args) {
        for (int i=1; i<=Main.N; i++) {
            for (int j=1; j<=Main.N; j++) {
                int nr = i*j;
                if (j != 1) {
                    if (nr >= 100) {
                        System.out.print(" ");
                    } else if (nr >= 10) {
                        System.out.print("  ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.print(nr);
            }
            System.out.println();
        }
    }
}

