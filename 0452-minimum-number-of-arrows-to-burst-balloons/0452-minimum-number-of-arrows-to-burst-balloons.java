import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) {
            return 0;
        }

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int arrows = 1;
        int end = points[0][1]; // End point of the first arrow
        
        for (int i = 1; i < points.length; i++) {
            int start = points[i][0];
            int end_point = points[i][1];
            
            // If the starting point of the current balloon is greater than the end point of the current arrow,
            // we need to shoot another arrow
            if (start > end) {
                arrows++;
                end = end_point; // Update the end point of the current arrow
            }
        }

        return arrows;
    }
}
