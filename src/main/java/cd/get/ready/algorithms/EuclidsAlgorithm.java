package cd.get.ready.algorithms;

public class EuclidsAlgorithm {

    public int gcd(int a, int b){
        if(a==0)
        {
            return b;
        }
        if (b==0) 
        {
            return a;    
        }
        return gcd(b, a%b);
    }

}
