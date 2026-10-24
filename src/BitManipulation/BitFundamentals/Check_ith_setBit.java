package BitManipulation.BitFundamentals;

public class Check_ith_setBit {
    boolean check(int n,int i){
        return (n&(1<<i)) != 0;
        //return ((n<<i)&1)!=0;
    }
}
