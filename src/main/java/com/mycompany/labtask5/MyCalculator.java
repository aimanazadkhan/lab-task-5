/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.labtask5;

/**
 *
 * @author 88017
 */
import java.math.BigInteger;

public class MyCalculator implements AdvancedArithmetic{
    
    @Override
    public int divisorofSum(int n) {

        int sum = 0;
        
        System.out.println("Divisors of " + n + " are ");
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                
                sum += i;
                
                System.out.print(i + " ");
            }
        }
        return sum;

    }
    
    @Override
    public BigInteger findFactorial(int n) {

        BigInteger factorial = BigInteger.ONE;
        
        for (int i = 1; i <= n; i++) {
            
            factorial = factorial.multiply(BigInteger.valueOf(i));
            
        }
        return factorial;
    }
}
