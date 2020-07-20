/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taptap.util;

/**
 *
 * @author Lenovo day la class chua cac ham toan hoc tinh toan voi muc tieu xai
 * chung cho cac noi khac, pham cai gi mang tinh chat xai chung ta xe dung
 * STATIC
 */
public class MathUtil {

    /**
     * vi giai thua tang so luong rat nhanh nen se tran kieu int nen ta xai long
     * cho an toan
     *
     * 
     * @return n! thuc ra 15! da to vl roi nen ta chi tinh giai thua tu 15 tro
     * lai
     */
    public static long computeFactorial(int n) {
        if (n < 0 || n > 15) throw new IllegalArgumentException("Invalid input, n must be greater or equal than zero");
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
