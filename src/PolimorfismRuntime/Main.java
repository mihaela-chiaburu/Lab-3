package PolimorfismRuntime;
import java.util.List;
public class Main {
    public static void main(String[] args){

        System.out.println("\n");
        Integral linearIntegral = new LinearIntegral(2, 3, 2, 4);
        Integral quadraticIntegral = new QuadraticIntegral(1, 2, 2, 3, 5);
        Integral exponentialIntegral = new ExponentialIntegral(2, 1, 3, 2);

        List<Integral> list = List.of(linearIntegral, quadraticIntegral, exponentialIntegral);

        for(Integral integral: list){
            System.out.println(integral.showResult());
            System.out.println("---------------------");
        }

    }
}
