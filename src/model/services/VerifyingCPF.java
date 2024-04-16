package model.services;

import model.exeception.GuestException;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public  class VerifyingCPF {
     private final Set<String> invalidCPFs = new HashSet<>(Arrays.asList(
             "00000000000",
             "11111111111",
             "22222222222",
             "33333333333",
             "44444444444",
             "55555555555",
             "66666666666",
             "77777777777",
             "88888888888",
             "99999999999"
     ));





     public String validateCPF(String CPF){
          if(!(invalidCPFs.contains(CPF) || CPF.length() != 10)){
              if(!(secondToLastNumber(CPF) == CPF.charAt(9) && lastNumber(CPF) == CPF.charAt(10))){
                   throw new GuestException("O CPF informado é invalido");

              }
              throw new GuestException("O CPF informado é invalido");

          }
          return CPF;

     }
     // obtei por dividir a verficação criando dois metoddos privados segundarios
     // que seram usados dentro do validateCPF

     private int lastNumber(String CPF){
          int sum = 0;
          int multiplie = 10;

          for(int i = 0; i<=8; i++){
               String[] numberCPSs =CPF.split("");
               sum +=  multiplie * Integer.parseInt(numberCPSs[i]);
               multiplie-=1;
          }
          int lastNumber = ((sum * 10) % 11 > 9)? 0 : (sum * 10) % 11;
          return lastNumber;
     }
     private int secondToLastNumber(String CPF){
          int sum = 0;
          int multiplie = 11;

          for(int i = 0; i<=8; i++){
               String[] numberCPSs =CPF.split("");
               sum +=  multiplie * Integer.parseInt(numberCPSs[i]);
               multiplie-=1;
          }
          sum += lastNumber(CPF)*2;

          int secondToLastNumber  = ((sum * 10) % 11 > 9)? 0 : (sum * 10) % 11;

          return secondToLastNumber;
     }


}
