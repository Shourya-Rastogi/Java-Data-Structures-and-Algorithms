import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestLowestFreqElemInArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        System.out.println("Enter elements of array: ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //PreCompute
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq); // inserting into the map
        }

        // Iterate over the map:
        int high=0;
        int highest=0;
        int low=Integer.MAX_VALUE;
        int lowest=0;
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if(it.getValue()>high){
                high=it.getValue();
                highest=it.getKey();
            }
            if (it.getValue()<low){
                low=it.getValue();
                lowest =it.getKey();
            }
        }
        System.out.println(lowest+" has the lowest frequency: "+low);
        System.out.println(highest+" has the highest frequency: "+high);


    }
}
