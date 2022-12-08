package com.atividadefinal;

import java.time.LocalDate;

public class turmaCurso {
   String local;
   int vagas;
   int vagasDisp;
   LocalDate inicioAulas; 
   LocalDate fimAulas;
   LocalDate inicioMatriculas;
   LocalDate fimMatriculas;

   public turmaCurso(String local, int vagas, LocalDate inicioAulas, LocalDate fimAulas, LocalDate inicioMatricula, LocalDate fimMatricula){
      this.local = local;
      this.vagas = vagas;
      this.vagasDisp = vagasDisp;
      this.inicioAulas = inicioAulas;
      this.fimAulas = fimAulas;
      this.inicioMatriculas = inicioMatriculas;
      this.fimMatriculas = fimMatriculas;
   }

   int getVagasDisponiveis(){
    return vagasDisp;
   }

   void setVagasDisponiveis(){
   }

   LocalDate getPeriodoMatriculas(){
    return inicioMatriculas;
   }

public String getLocal() {
      return local;
   }

   public void setLocal(String local) {
      this.local = local;
   }

   public int getVagas() {
      return vagas;
   }

   public void setVagas(int vagas) {
      this.vagas = vagas;
   }

   public void setVagasDisp(int vagasDisp) {
      this.vagasDisp = vagasDisp;
   }

   public LocalDate getInicioAulas() {
      return inicioAulas;
   }

   public void setInicioAulas(LocalDate inicioAulas) {
      this.inicioAulas = inicioAulas;
   }

   public LocalDate getFimAulas() {
      return fimAulas;
   }

   public void setFimAulas(LocalDate fimAulas) {
      this.fimAulas = fimAulas;
   }

   public LocalDate getInicioMatriculas() {
      return inicioMatriculas;
   }

   public void setInicioMatriculas(LocalDate inicioMatriculas) {
      this.inicioMatriculas = inicioMatriculas;
   }

   public LocalDate getFimMatriculas() {
      return fimMatriculas;
   }

   public void setFimMatriculas(LocalDate fimMatriculas) {
      this.fimMatriculas = fimMatriculas;
   }

}
