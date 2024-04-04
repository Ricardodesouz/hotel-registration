package model.services;

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

     public void validateCPF(String CPF){
          if(!(invalidCPFs.contains(CPF) || CPF.length() != 11)){



          }

     }
     // obtei por dividir a verficação criando dois metoddos privados segundario
     // que seram usados dentro do validateCPF
     private int firstNumber(){
          return 0;
     }
     private int secondNumber(){
          return 0;
     }


}
