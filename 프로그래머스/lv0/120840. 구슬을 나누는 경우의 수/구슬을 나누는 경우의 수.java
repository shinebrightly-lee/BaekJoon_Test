import java.math.*;
class Solution {
    public int solution(int balls, int share) {
        BigInteger bigX = BigInteger.valueOf(1);
        BigInteger bigY = BigInteger.valueOf(1);
        BigInteger bigZ = BigInteger.valueOf(1);
        
        for(long i = 1; i <= balls; i++){
            BigInteger bigI = BigInteger.valueOf(i);
            bigX = bigX.multiply(bigI);
        }
        for(long i = 1; i <= share; i++){
            BigInteger bigI = BigInteger.valueOf(i);
            bigY = bigY.multiply(bigI);
        }
        for(long i = 1; i <= (balls-share); i++){
            BigInteger bigI = BigInteger.valueOf(i);
            bigZ = bigZ.multiply(bigI);
        }
        
        return bigX.divide(bigY.multiply(bigZ)).intValue();
    }
}