package model;

public class Ingresso {
	
	private String codigoIdentificador;
    private float valor;

    public Ingresso(String codigoIdentificador, float valor) {
        this.setCodigoIdentificador(codigoIdentificador);
        this.valor = valor;
    }

    public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public float valorFinal(float taxaConveniencia) {
        return this.valor + taxaConveniencia;
    }

	public String getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(String codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}
}



