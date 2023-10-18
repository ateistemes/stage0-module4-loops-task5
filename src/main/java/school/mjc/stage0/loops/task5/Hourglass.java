package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int i, j, k;
        int n = height;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }

            for (k = i; k <= n; k++) {
                System.out.print("8 ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(' ');
            }
            for (k = i; k <= n; k++) {
                System.out.print("8 ");
            }

            System.out.println();
        }
    }

}
