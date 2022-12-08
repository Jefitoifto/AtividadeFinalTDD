    package com.atividadefinal;

    import org.junit.jupiter.api.*;

   // import static org.junit.jupiter.api.Assertions.*;

    import java.time.LocalDate;

    /**
     * Unit test for simple App.
     */
    public class AppTest 
    {
        @Test
        @DisplayName("Teste do celular")
        public void cadastraNumero(){
            Celular celular = new Celular("3636-5454");
            Celular celular2 = new Celular("1010-2020");
            Celular celular3 = new Celular("4040-5050");
        }

        @Test
        @DisplayName("Teste de cadastro de Estudante")
        public void cadastraEstudante(){
            Estudante estudante = new Estudante ("José Marcos","01",LocalDate.parse("1800-01-02"),
            "Rua 4, Alameda 8, Avenida","jose@estudante.com");
            Estudante estudante2 = new Estudante("Jeferson Oliveira","02",LocalDate.parse("2000-12-05"),
            "Rua 2, Alameda 4, Avenida","jeferson@estudante.com");
            Estudante estudante3 = new Estudante("Adão Ferraz","03",LocalDate.parse("1993-11-10"),
            "Rua 1, Alameda 9, Avenida","adao.ferraz@estudante.com");
            /*estudante.setNome("João Paulo");
            estudante.setAdress("Rua 4 Lote 5 Avenida");
            estudante.setEmailinst("joao@aluno.com");
            estudante.setMatricula(01);
            estudante.setNascimento("1998-8-05");*/
        }

        @Test
        @DisplayName("Teste de cadastro dos cursos")
        public void cadastraCurso(){
            Curso curso1 = new Curso("Agrononegócio","60 Horas","Curso para aprender mexer com mato e animais");
            Curso curso2 = new Curso("Programação", "120 Horas", "Aprenda a programar em java");
            Curso curso3 = new Curso("Agrimensusa","60 Horas","Aprenda a medir terras.");
        }
        
        @Test
        @DisplayName("Testando turmas curso") //Local, Vagas, VagasDisp,inicioAulas, fimAulas, inicioMatriculas, fimMatriculas 
        public void turmaCursoEstudante(){
        turmaCurso agronegocio = new turmaCurso("Palmas-TO", 4, 
        LocalDate.parse("2023-03-01"), LocalDate.parse("2024-03-07"), 
        LocalDate.parse("2022-12-07"), LocalDate.parse("2022-12-30"));

        turmaCurso programacao = new turmaCurso("Palmas-TO", 4, 
        LocalDate.parse("2023-03-01"), LocalDate.parse("2024-03-07"), 
        LocalDate.parse("2022-12-07"), LocalDate.parse("2022-12-30"));

        turmaCurso agrimensura = new turmaCurso("Palmas-TO", 4, 
        LocalDate.parse("2023-03-01"), LocalDate.parse("2024-03-07"), 
        LocalDate.parse("2022-12-07"), LocalDate.parse("2022-12-30"));
        }

        @Test
        @DisplayName("Teste de matricula do estudante em uma turma")
        public void testeMatricula(){
            estudantesMatriculados estudantesMat = new estudantesMatriculados();
            Celular celular = new Celular("3636-5454");

            Estudante estudante = new Estudante ("José Marcos","01",LocalDate.parse("1800-01-02"),
            "Rua 4, Alameda 8, Avenida","jose@estudante.com");

            Curso curso1 = new Curso("Agrononegócio","60 Horas","Curso para aprender mexer com mato e animais");

            turmaCurso agronegocio = new turmaCurso("Palmas-TO", 4, 
        LocalDate.parse("2023-03-01"), LocalDate.parse("2024-03-07"), 
        LocalDate.parse("2022-12-07"), LocalDate.parse("2022-12-30"));
            
            try {
                if (estudante.nome == ""){
                }else if((estudante.nome == "")){
                }else if(estudante.emailinst == ""){
                }else if(estudante.nascimento.isAfter(null)){
                }else if(estudante.matricula == ""){
                }else{System.out.println("Cadastro realizado");}
            } catch (Exception e) {
                System.out.println("Todos os campos devem ser informados");
            }
            
            //if(estudante.nascimento = ){

           // }

            }
    }
    
