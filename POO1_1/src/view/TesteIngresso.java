package view;

import model.Ingresso;
import model.IngressoTop;

public class TesteIngresso {

	public static void main(String[] args) {
		Ingresso ingressoNormal = new Ingresso("003", 150.0f);
		IngressoTop ingressoTop = new IngressoTop("004", 400.0f, "VIP");

		float taxaConveniencia = 5.0f;

		System.out.println("Valor final do ingresso normal: R$" + ingressoNormal.valorFinal(taxaConveniencia));
		System.out.println("Valor final do ingresso VIP: R$" + ingressoTop.valorFinal(taxaConveniencia));
	}
}