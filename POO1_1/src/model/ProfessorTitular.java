package model;

public class ProfessorTitular extends Professor {
	
	private int anosInstituicao;
	private double salarioBase;

	
	public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao, double salarioBase) {
		super(nome, matricula, idade);
		this.anosInstituicao = anosInstituicao;
		this.salarioBase = salarioBase;
	}

	
	public double calcSalario() {
		
		double aumento = (anosInstituicao / 5) * 0.05 * salarioBase;
		return salarioBase + aumento;
	}
}