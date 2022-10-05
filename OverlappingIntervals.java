import java.util.*;

public class OverlappingIntervals {
    public int[][] overlappedInterval(int[][] Intervals) {
        Arrays.sort(Intervals, new Comparator<int[]>() {

            @Override
            // Compare values according to columns
            public int compare(final int[] entry1,
                    final int[] entry2) {

                // To sort in descending order revert
                // the '>' Operator
                if (entry1[0] > entry2[0])
                    return 1;
                else
                    return -1;
            }
        });

        int a = 0;
        for (int i = 1; i < Intervals.length; i++) {
            if (Intervals[a][1] >= Intervals[i][0]) {
                Intervals[a][1] = Integer.max(Intervals[a][1], Intervals[i][1]);
            } else {
                a += 1;
                Intervals[a] = Intervals[i];
            }
        }

        int[][] integer2 = new int[a + 1][];
        for (int i = 0; i <= a; i++) {
            integer2[i] = Intervals[i];
        }

        return integer2;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 }, { 2, 4 }, { 6, 8 }, { 9, 10 } };
        OverlappingIntervals a = new OverlappingIntervals();
        int[][] ans = a.overlappedInterval(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i][0] + "," + ans[i][1] + " ");
            ;
        }

    }
}
