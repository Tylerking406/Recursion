package Recursion;

//package Program;

class CountPrimes {

    static int counter=0;
    static boolean primeChecker(int n){
        if (n<=1)
            return false;
        else if(n==2 || n==3)
            return true;
        else if (n%2==0 || n%3==0)
            return false;
        for (int i = 2 ; i <= Math.sqrt(n); i++) {
            if (n%i==0)
                return false;
        }
        return true;

    }
    public static int countPrimes(int n) {

        boolean state = primeChecker(n);
        if (state)
            counter++;
        if(n<=0) {
            return counter;


        }
        return countPrimes(n-1);
    }

    public static void main(String[] args) {
        //TesterPrime();
        TesterCountP();
    }

    static void TesterCountP(){
        System.out.println("####### Tester 2 ###########");
        int n;
        n= 3;
        System.out.println("n = "+n+" "+countPrimes(n-1));
        counter=0;
        n= 1;
        System.out.println("n = "+n+" "+countPrimes(n-1));
        counter=0;

        n= 0;
        System.out.println("n = "+n+" "+countPrimes(n-1));
        counter=0;

        n= 10;
        System.out.println("n = "+n+" "+countPrimes(n-1));
        counter=0;

        n= 13;
        System.out.println("n = "+n+" "+countPrimes(n-1));
        counter=0;

        n= 23;
        System.out.println("n = "+n+" "+countPrimes(n-1));
        counter=0;


    }

    static void TesterPrime(){
        System.out.println("####### Tester 1 ###########");
        int n;
        n= 3;
        System.out.println("n = "+n+" "+primeChecker(n));
        n= 1;
        System.out.println("n = "+n+" "+primeChecker(n));
        n= 0;
        System.out.println("n = "+n+" "+primeChecker(n));
        n= 10;
        System.out.println("n = "+n+" "+primeChecker(n));
        n= 13;
        System.out.println("n = "+n+" "+primeChecker(n));
        n= 23;
        System.out.println("n = "+n+" "+primeChecker(n));
    }
}