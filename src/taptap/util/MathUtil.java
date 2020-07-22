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
     * @return n! thuc ra 15! da to vl roi nen ta chi tinh giai thua tu 15 tro
     * lai
     */
    public static long computeFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        // song sot den day sure n in (2,15) ko can else
        return n*computeFactorial(n-1); // n! = n*(n-1)!
    }
}
