package cmdjava2sh;

/**
 *
 * @author Jesimar S. Arantes
 */
public class Functions {
    
    //solve ax+b=0
    //solve ax2+bx+c=0
    //ordenar {a, b, c, d, ... z}
    
    //é primo(num)
    //é numero perfeito(num)
    //é numero de fibonacci(num)
    //listar numeros de fibonacci [0, max]
    //listar numeros de fibonacci [min, max]
    //list number primes [1, max]
    //list number primes [min, max]
    
    //determinante matriz [[1, 2][3, 4]]
    //
    
    public static String fat(int x){
        if (x < 0){
            return "NaN";
        }
        return fatorial(x) + "";
    }
    
    public static long fatorial(int x){
        int fat = 1;
        for (int i = 1; i <= x; i++){
            fat = fat * i;
        }
        return fat;
    }
    
    public static String fib(int x){
        if (x < 0){
            return "NaN";
        }
        return fibonacci(x) + "";
    }
    
    public static long fibonacci(int x){
        if (x == 1 || x == 2){
            return 1;
        }else{
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
    
    public static String listNumbersFibonacci(int n){
        String list = "{ ";
        for (int i = 1; i <= n; i++){
            list += fib(i) + " ";
        }
        return list+"}";
    }
    
    public static String listNumbersFibonacci(int min, int max){
        String list = "{ ";
        for (int i = 1; i <= max; i++){
            long fib = Long.parseLong(fib(i));
            if (fib >= min && fib <= max){
                list += fib + " ";
            }else if (fib > max){
                break;
            }
        }
        return list+"}";
    }
    
    public static double summation(double min, double max, double step){
        double sum = 0;
        for (double v = min; v <= max; v=v+step){
            sum+=v;
        }
        return sum;
    }
    
    public static double products(double min, double max, double step){
        double prod = 1;
        for (double v = min; v <= max; v=v+step){
            prod*=v;
        }
        return prod;
    }
    
}
