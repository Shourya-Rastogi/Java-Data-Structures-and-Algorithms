package BitManipulation.BitFundamentals;

public class RemoveLastSetBit {
    int removeLastSetBit(int n){
        return n&(n-1);
    }
}
