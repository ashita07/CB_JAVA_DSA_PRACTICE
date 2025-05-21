public class Prime_Sieve_Eratosthenes {
    public static void main(String[] args) {
intPrime_Sieve(14);
    }
    public static int intPrime_Sieve(int n){
        int[] prime =new int[n];
        prime[0]=1;
        prime[1]=1;
        for(int i=0;i *i <prime.length;i++){
            if(prime[i]==0){
                for(int j=2;i*j<prime.length;j++){
                    prime[i*j]=1;
                }
            }
        }
        int c=0;
        for(int i=2;i<prime.length;i++){
            if(prime[i]==0)
                c++;
        }
        return c;
    }

}
