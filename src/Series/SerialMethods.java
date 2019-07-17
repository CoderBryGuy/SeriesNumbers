package Series;

public class SerialMethods {

    static public int nSum(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    static public int factorial(int n){
        if (n == 0)
            return 0;

        int product  = 1;
        for (int i = 1; i <= n ; i++) {
            product *= i;
        }
        return product;
    }

    static  public  int fibonacci(int n){
        int nthFibonacci = 0;

        switch (n){
            case 0:
                nthFibonacci = n;
                break;
            case 1:
                nthFibonacci = n;
                break;
            default:
                nthFibonacci = (n - 1) + (n- 2);
                break;
        }
        return nthFibonacci;

    }

}
