package com.atividadefinal;

import java.sql.Date;

public class turmaCurso {
   String local;
   int vagas;
   int vagasDisponiveis;
   Date inicioAulas; 
   Date fimAulas;
   Date inicioMatriculas;
   Date fimMatriculas;

   void turmaCurso(String local, int vagas, Date inicioAulas, 
         Date fimAulas, Date inicioMatricula, Date fimMatricula, int vagasDisponiveis,
         Date inicioMatriculas, Date fimMatriculas){
            
      this.local = local;
      this.vagas = vagas;
      this.vagasDisponiveis = vagasDisponiveis;
      this.inicioAulas = inicioAulas;
      this.fimAulas = fimAulas;
      this.inicioMatriculas = inicioMatriculas;
      this.fimMatriculas = fimMatriculas;
   }

   public turmaCurso(String local, int vagas, int vagasDisponiveis, Date inicioAulas, Date fimAulas,
         Date inicioMatriculas, Date fimMatriculas) {
      
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

   public void setVagasDisponiveis(int vagasDisponiveis) {
      this.vagasDisponiveis = vagasDisponiveis;
   }

   public Date getInicioAulas() {
      return inicioAulas;
   }

   public void setInicioAulas(Date inicioAulas) {
      this.inicioAulas = inicioAulas;
   }

   public Date getFimAulas() {
      return fimAulas;
   }

   public void setFimAulas(Date fimAulas) {
      this.fimAulas = fimAulas;
   }

   public Date getInicioMatriculas() {
      return inicioMatriculas;
   }

   public void setInicioMatriculas(Date inicioMatriculas) {
      this.inicioMatriculas = inicioMatriculas;
   }

   public Date getFimMatriculas() {
      return fimMatriculas;
   }

   public void setFimMatriculas(Date fimMatriculas) {
      this.fimMatriculas = fimMatriculas;
   }

   int getVagasDisponiveis(){
    return vagasDisponiveis;
   }
   void setVagasDisponiveis(){
   }
   Date getPeriodoMatriculas(){
    return inicioMatriculas;
   }
}
