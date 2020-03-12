import java.util.*;
class product{
    static Scanner scn = new Scanner(System.in);
    
    public static void input(int []arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static long product(int []arr){
        long ans = 1;
        double power = Math.pow(10, 9);
        long l_power = (long) power;
         for(int i=0; i<arr.length; i++){
            ans = ans * arr[i];
            ans = ans % ( l_power + 7);
        }
        return ans;
    }
    public static void main(String []args){
        int num = scn.nextInt();
        int []arr = new int[num];
        input(arr);
        long ans = product(arr);
        System.out.print(ans);
    }
}