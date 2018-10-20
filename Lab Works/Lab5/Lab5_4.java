import java.util.Scanner;

public class Lab5_4 {
    public static void main(String[] args) {
        System.out.print("Enter the integers between 1 and 100:");
        Scanner in = new Scanner(System.in);

        //Build a temp array from aruguments
        String[] nums = null;
        nums = in.nextLine().split(" ");
        int l_temp[] = new int[nums.length];
        for(int i = 0; i < l_temp.length; i++) {
            l_temp[i] = Integer.valueOf(nums[i]);
        }

        //Build a new array stopping at l_temp[C] = 0
        int n = 0;
        for(int e: l_temp) {
            if (e != 0) {
                n++;
            } else break;
        }
        int [] list = new int[n];
        for(int i = 0; i < list.length; i++) {
            list[i] = l_temp[i];
            System.out.print(list[i] + " ");
        }

        //Count the occurrences
    }
}
