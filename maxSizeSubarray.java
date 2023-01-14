import java.util.*;

class maxSizeSubarray {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter array size: ");
        int N = sc.nextInt();
        System.out.println();
        int[] arr = new int[N];
        System.out.println("Enter array elements: ");
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        int start=0, ans=0;
        while (start < N) {
            if (arr[start] >= 0) {
                int end = start;
                int size = 0;
                while (end < N && arr[end] >= 0) {
                    end++;
                    size++;
                }
                start = end+1;
                ans = Math.max(ans, size);
            }
            else start++;
        }
        System.out.println();
        System.out.println("Max. size subarray is " + ans);
        System.out.println();
        sc.close();
    }
}