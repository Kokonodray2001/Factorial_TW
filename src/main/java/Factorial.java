public class Factorial {
    public int findFactorial(int num) {

        int fact =1;

        if(num == 0) return 1; // for checking zero

        if(num < 0) throw new IllegalArgumentException(); // for checking negative

        for (int i = 1; i <=num ; i++) {  //for calculation of factorial
            fact *=i;
        }
        return fact;
    }
}
