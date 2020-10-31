/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

/**
 *
 * @author Stks
 */
public class PBO10119042Latihan19saldo {
   
    public static void main(String[] args){
      double saldoawal = 2500000;
      for (double i = 1; i <=6; i++){
          saldoawal += Math.floor(saldoawal *0.15);
          System.out.printf("Saldo dibulan ke-%1$.0f Rp. %2$,.0f%n", i, saldoawal);
      }
    }
    
}
