package metodichka_3;

public class MyArray_1 {

    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int [] nums = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 25;

        for (int ut : nums) {
            System.out.print(ut + " ");
        }
    }
}
