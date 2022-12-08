package com.atividadefinal;

import java.time.LocalDate;

public class Estudante {
   String nome;
   String matricula;
   LocalDate nascimento;
   String adress;
   String emailinst;
   
  public Estudante(String nome, String matricula, LocalDate nascimento, String adress, String emailinst){
   this.nome = nome;
   this.matricula = matricula;
   this.nascimento = nascimento;
   this.adress = adress;
   this.emailinst = emailinst;
   }

   String gerarMatricula(){
    return matricula;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getMatricula() {
      return matricula;
   }

   public void setMatricula(String matricula) {
      this.matricula = matricula;
   }

   public LocalDate getNascimento() {
      return nascimento;
   }

   public void setNascimento(LocalDate nascimento) {
      this.nascimento = nascimento;
   }

   public String getAdress() {
      return adress;
   }

   public void setAdress(String adress) {
      this.adress = adress;
   }

   public String getEmailinst() {
      return emailinst;
   }

   public void setEmailinst(String emailinst) {
      this.emailinst = emailinst;
   } 
   
}
