package model.entities;

import model.services.VerifyingCPF;

import java.util.Objects;

public class Guest {
   private String name;
   private Integer age;
   private String cpf;

   public Guest(String name, Integer age, String cpf){
       this.name = name;
       this.age = age;
       this.cpf= VerifyingCPF.validateCPF(cpf);
   };
   public String getName(){
       return name;
   }
   public void  setName(String name){
       this.name = name;

   }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCpf() {
        return cpf;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest guest)) return false;
        return Objects.equals(getCpf(), guest.getCpf());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf());
    }
}
