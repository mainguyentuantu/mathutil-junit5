/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.tuantu.mathutil.core;

import static com.tuantu.mathutil.core.MathUtil.*;

//import static la danh rieng cho nhung ham static
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class MathUtilTest {
    //choi DDT tach data ra khoi cau lenh kiem thu, tham so hoa data nay
    //vao trong cau lenh kiem thu
    
    //chuan bi bo vao data
    
    public static Object[][] initData(){
        return new Integer[][] {
            {1,1},
            {2,2},
            {5,120},
            {6,720}
        };
    }
    
    @ParameterizedTest
    @MethodSource(value =  "initData") //ten ham cung cap data, ngam dinh thu tu
                                        //cua cac phan tu mang, map vao tham so
    public void testGetFactorialGivenRightArgReturnWell(int input, long expcted){
        assertEquals(expcted, getFactorial(input));
    }
    
    //bat ngoai le khi cho data ca chon!!
    @Test
    public void testGetFactorialGivenWrongArgThrowExceptionstatic() {
            //xai bieu thuc lambda
            //ham nhan tham so thu 2 la 1 cai object/co code implement cai
            //functional interface ten la executable - co 1 lam duy nhar ko code
            //ten la execute()
            //choi cham
            
            //c1:
//            Executable exObject = new Executable() {
//                @Override
//                public void execute() throws Throwable {
//                    getFactorial(-5);
//                }
//            };


           // assertThrows(IllegalArgumentException.class, exObject);
           
           //c2
            assertThrows(IllegalArgumentException.class, () -> getFactorial(-5));
}
}
