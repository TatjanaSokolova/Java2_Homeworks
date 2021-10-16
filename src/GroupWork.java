import java.util.TreeSet;

public class GroupWork {
    public static String maxvalues(Integer nums[]) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        Integer[] nums2 = new Integer[set.size()];
        nums2 = set.toArray(nums2);

        System.out.println(set);
        if (nums2.length == 0) {
            return "Array is empty";
        } else if (nums2.length > 2) {
            return String.format("The third distinct maximum is %s", nums2[nums2.length - 3]);
        } else {
            return String.format("The first distinct maximum is: %s", nums2[nums2.length - 1]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Test #1");
        Integer arr[] = {3, 5, 66, 45, 23};
        System.out.println(maxvalues(arr));

        System.out.println("Test #2");
        Integer arr2[] = {99, -4, -6, -99};
        System.out.println(maxvalues(arr2));

        System.out.println("Test #3");
        Integer arr3[] = {10, 10, 10, 10, 20};
        System.out.println(maxvalues(arr3));

        System.out.println("Test #4");
        Integer arr4[] = {1, 1, 2, 2, 2, 56, 76};
        System.out.println(maxvalues(arr4));

        System.out.println("Test #5");
        Integer arr5[] = {3};
        System.out.println(maxvalues(arr5));

        System.out.println("Test #6");
        Integer arr6[] = {33, 55};
        System.out.println(maxvalues(arr6));
    }
}
