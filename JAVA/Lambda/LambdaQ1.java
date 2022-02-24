
import java.util.function.BiFunction;

public class LambdaQ1 {
 
    public static void main(String[] args) {
        BiFunction <Integer, Integer, Integer> funcAddObj = (i1, i2) -> i1 + i2;
        BiFunction <Integer, Integer, Integer> funcSubtractObj = (i1, i2) -> i1 - i2;
        BiFunction <Integer, Integer, Integer> funcMuliplyObj = (i1, i2) -> i1 * i2;
        BiFunction <Integer, Integer, Integer> funcDivideObj = (i1, i2) -> i1 / i2;
        BiFunction <Integer, Integer, Integer> funcModuloObj = (i1, i2) -> i1 % i2;
        System.out.println("Addition of 18 and 3: " + funcAddObj.apply(18, 3));
        System.out.println("Subtract of 18 and 3: " + funcSubtractObj.apply(18, 3));
        System.out.println("Multiply of 18 and 3: " + funcMuliplyObj.apply(18, 3));
        System.out.println("Division of 18 and 3: " + funcDivideObj.apply(18, 3));
        System.out.println("Modulo of 18 and 3: " + funcModuloObj.apply(18, 3));
 
    }
 
}