import java.util.*;
public class patuljci{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nums[] = new int[9];
        int sum = 0;
        for(int i =0; i<9;i++){
            nums[i] = scan.nextInt();
            sum += nums[i];
        }
        int extra = Math.abs(sum - 100);
        for(int i =0;i<9;i++){
            int first_num = nums[i];
            int required = Math.abs(first_num - extra);
            if(isthere(i,first_num, required, nums) == -1){
                break;
            }
        }
        for(int i : nums){
            if(i >0){
                System.out.println(i);
            }
        }
        scan.close();
    }
    public static int isthere(int index,int first, int second, int nums[]){
        for (int i =0;i<9;i++){
            if(nums[i] == second){
                nums[i] = -1;
                nums[index] = -1;
                return -1;
            }
        }
        return 0;
    }
}