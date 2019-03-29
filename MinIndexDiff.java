//(G) Given an array of integers that only contains values 0,1,2;
// find the minimum index difference between a 1 and a 2. Formally,
// minimize abs(i - j) s.t. A[i] == 1 and A[j] == 2
public class MinIndexDiff {
    public static int findMinIndexDiff(int[] arr) {
        int index1 = -1;
        int index2 = -1;
        int minIndex = Integer.MAX_VALUE;
        boolean index1Updated = false;
        boolean index2Updated = false;

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                index1 = i;
                index1Updated = true;
            }
            if (arr[i] == 2) {
                index2 = i;
                index2Updated = true;
            }
            if (index1 != -1 && index2 != -1 && (index1Updated || index2Updated)) {
                minIndex = Math.min(minIndex, Math.abs(index1 - index2));
                index1Updated = false;
                index2Updated = false;
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] input = {0,2,0,1,2,0,1,2,2,0,0,1};
        int[] input1 = {0,1,0,1,1,0,1,0,0,0,2,2};

        System.out.println(MinIndexDiff.findMinIndexDiff(input));
        System.out.println(MinIndexDiff.findMinIndexDiff(input1));
    }
}
