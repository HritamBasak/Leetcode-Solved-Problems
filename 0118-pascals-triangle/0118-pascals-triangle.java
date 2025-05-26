class Solution {
    public List<List<Integer>> generate(int numRows) {
        // This will hold all rows of Pascal's Triangle
        List<List<Integer>> result = new ArrayList<>();

        // Loop through each row
        for (int i = 0; i < numRows; i++) {
            // Create a new list for the current row
            List<Integer> row = new ArrayList<>();

            // The first and last elements of each row are always 1
            row.add(1);

            // Fill in the middle elements using the previous row
            // (Only happens from the 3rd row onwards)
            if (i > 0) {
                List<Integer> prevRow = result.get(i - 1); // Get previous row

                // For each position between the first and last
                for (int j = 1; j < i; j++) {
                    // Each element is the sum of the two elements above it
                    int val = prevRow.get(j - 1) + prevRow.get(j);
                    row.add(val);
                }

                // End each row with a 1
                row.add(1);
            }

            // Add the completed row to the result
            result.add(row);
        }

        return result;
    }
}
