package view;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class TesteProfessor{
    public static void main(String[] args) {
       
        ProfessorTitular professorTitular = new ProfessorTitular("Gleidson", "2511", 40, 10, 3500);
        System.out.println("Salário do Professor Titular: " + professorTitular.calcSalario());

        ProfessorHorista professorHorista = new ProfessorHorista("Santos", "654", 30, 10, 30);
        System.out.println("Salário do Professor Horista: " + professorHorista.calcSalario());
    }
}
