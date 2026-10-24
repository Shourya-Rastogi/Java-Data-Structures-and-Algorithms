package BitManipulation.BitFundamentals;

public class Clean_ith_bit {
    int clean(int n,int i){
        return n&~(1<<i);
    }
}
