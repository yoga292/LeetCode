import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] c = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (c[1] >= next[0]) {
                c[1] = Math.max(c[1], next[1]);
            } else {
                merged.add(c);
                c = next;
            }
        }

        merged.add(c);
        return merged.toArray(new int[merged.size()][]);
    }
}
