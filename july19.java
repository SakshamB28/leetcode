import java.util.*;
import java.math.*;
class Solution {    
    BigInteger two = new BigInteger("2");
    BigInteger ten = new BigInteger("10");
    public String addBinary(String a, String b) {           
        BigInteger a1 = new BigInteger(a);
        BigInteger b1 = new BigInteger(b);      
        BigInteger x = toDec(a1);
        BigInteger y = toDec(b1);            
        String sum = toBin(x.add(y));
        return sum;
    }
    BigInteger toDec(BigInteger n){
        BigInteger t = BigInteger.ZERO;
        int x = 0;
        while(n.compareTo(BigInteger.ZERO)>0)
        {
            BigInteger r = n.mod(ten);
            BigInteger b12 = new BigInteger("2");
            t=t.add((b12.pow(x++)).multiply(r));
            n=n.divide(BigInteger.TEN);
        }
        return t;
    }
    String toBin(BigInteger n){
        StringBuilder str = new StringBuilder();   
        if(n==BigInteger.ZERO){
            str.append(BigInteger.ZERO);
        }
        else{
            while(n.compareTo(BigInteger.ZERO)>0){
                BigInteger r = n.mod(two);
                str.append(r);
                n=n.divide(two);
            }    
        }        
        String x = str.reverse().toString();
        return x;
    }
}
class Prog{
    public static void main(String args[]){
        Solution ob = new Solution();
        String total = ob.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101","10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101");
        System.out.println(total);
    }
}
