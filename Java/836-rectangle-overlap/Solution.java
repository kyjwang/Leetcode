class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        // Rectangles do not overlap if one is completely to the left,
        // right, above, or below the other.
        if (rec1[2] <= rec2[0]) {
            return false;
        }

        if (rec1[0] >= rec2[2]) {
            return false;
        }

        if (rec1[3] <= rec2[1]) {
            return false;
        }

        if (rec1[1] >= rec2[3]) {
            return false;
        }

        return true;
    }
}
