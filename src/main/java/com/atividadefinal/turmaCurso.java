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
}
