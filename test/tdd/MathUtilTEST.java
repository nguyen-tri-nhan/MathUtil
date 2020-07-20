/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import static taptap.util.MathUtil.computeFactorial;

/**
 *
 * @author Lenovo
 */
public class MathUtilTEST {

    @Test // bao cho JVM biet day la ham main
    /**
     * trong ham nay chua cac lenh test code chinh ben mathUtil test cac tinh
     * huong thanh cong o day: cF(5) = 120
     */
    public void testSuccessfulCasees() {
//        assertEquals(50, 50);
    /**
     * ki vong: 30; thuc te ?? :D ?? neu 2 thu khop nhau xu li nhu du kien den
     * xanh thong thuong khong khop, ko nhu du kien, den do, toang
     */
        assertEquals(120, computeFactorial(5));
        assertEquals(720, computeFactorial(6));
        assertEquals(1, computeFactorial(1));
        assertEquals(1, computeFactorial(0));
        assertEquals(2, computeFactorial(2));
    /**
     * full xanh = xanh full xanh 1 do = do
     *
     */
    }
    @Test(expected = IllegalArgumentException.class)
//    /**
//     * annotation bao cho JVM, jar biet lam gi ham nay chua cac tinh huong ca
//     * chon cF -5; cF 16
//     */
    public void testFailedCases() {
        //exception xem nhu dung
        /**
         * Ngoai le k phai value so sanh dc
         * ko xai dc Assert vi no can 2 value expected vs actual
         * trong khi exception ko phai actual de so sanh
         * phai xai cach khac bat ngoai le coi co dung la thu minh can hay ko
         */
//        computeFactorial(-5);
        computeFactorial(16); // giai thua tang nhanh vcl nen ko qua 15
    } 
/**
 * code co the co loi nhung clean van co the ra file .jar 
 * neu code ko sai cu phap
 * fucking dangerous, minh phai disable cai nut clean and build neu code con do
 * tuc la con ERROR LOGIC
 * nho 2 con so: 1005 NetBean8, 1204 NetBean10++
 * khi choi voi Ant project
 */
}
