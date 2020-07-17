/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathutil;
import static taptap.util.MathUtil.computeFactorial;
/**
 *
 * @author Lenovo
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //hi vong tra ve 120 neu tinh 5!
        System.out.println("5! = "+ computeFactorial(5));
        // hi vong ham tra ve 1 neu tinh 1!
        //expected 1 if CF(1)
        System.out.println("1! = "+ computeFactorial(1));
        //expected 1 if CF(0)
        System.out.println("0! = "+ computeFactorial(0));
        //expected exception if CF(-5)
        System.out.println(computeFactorial(-5));
    }
    
}
