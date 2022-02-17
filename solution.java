/*
  Pratik
  Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
*/


import java.util.Scanner;
import java.util.Arrays;


public class Main
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number: ");
        n = input.nextInt();
        
        int[] nums = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(nums);
        int min = 0, max = 0;
        
        if (n > nums[nums.length - 1]) {
            min = nums[nums.length - 1];
            System.out.println("Max: None" + " Min: " + min);
        } else if (nums[0] > n) {
            max = nums[0];
            System.out.println("Max: " + max + " Min: None");
        } else {
            for (int i=0; i<nums.length; i++) {
                if (n < nums[i]) {
                    max = nums[i];
                    min = nums[i - 1];
                    break;
                } 
            }
        
            System.out.println("Max: " + max + " Min: " + min);
        }
        
    }
}
