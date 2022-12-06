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

   void turmaCurso(String local, int vagas, Date inicioAulas, Date fimAulas, Date inicioMatricula, Date fimMatricula){

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
