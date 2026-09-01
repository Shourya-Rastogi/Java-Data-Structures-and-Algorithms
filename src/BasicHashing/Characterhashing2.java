package BasicHashing;

import java.util.Scanner;

public class Characterhashing2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Input String:");
        String str=sc.nextLine();
        //Precompute
        //this can store hash value of all the characters
        int[] hash=new int[256];
        for(int i=0;i<str.length();i++) hash[str.charAt(i)] += 1;

        System.out.println("Enter number of characters to search for:");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter character:");
            char ch=sc.next().charAt(0);
            System.out.println("Number of occurences= "+hash[ch]);
        }
    }
}
