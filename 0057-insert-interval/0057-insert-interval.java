class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int[] c = new int[newInterval.length];
        c[0] = newInterval[0];
        c[1] = newInterval[1];
        boolean inserted = false;

        for (int i = 0; i < intervals.length; i++) {
            // Overlapping condition (fixed)
            if (intervals[i][1] >= newInterval[0] && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            } else {
                if (!inserted && intervals[i][0] > newInterval[1]) {
                    list.add(newInterval);  // insert merged interval before non-overlapping right interval
                    inserted = true;
                }
                list.add(intervals[i]);
            }
        }

        if (!inserted) {
            list.add(newInterval);
        }

        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i][0] = list.get(i)[0];
            res[i][1] = list.get(i)[1];
        }

        return res;
    }
}

