package BasicHashing;

import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter max element of array");
        int max=sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Precompute hashValues
        int hash[]=new int[max+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        System.out.println("Enter number of elements to search:");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter Element to search:");
            int number=sc.nextInt();
            System.out.println(hash[number]);
        }

    }
}
