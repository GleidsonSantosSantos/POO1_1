package model;

public class IngressoTop extends Ingresso {
	private String funcao;

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public IngressoTop(String codigoIdentificador, float valor, String funcao) {
		super(codigoIdentificador, valor);
		this.funcao = funcao;
	}
}
