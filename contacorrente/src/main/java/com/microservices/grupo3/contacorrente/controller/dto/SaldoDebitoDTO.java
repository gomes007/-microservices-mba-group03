package com.microservices.grupo3.contacorrente.controller.dto;

public class SaldoDebitoDTO {
	
	private Double valorDebito;

	public SaldoDebitoDTO(Double valorDebito) {
		super();
		this.valorDebito = valorDebito;
	}

	public Double getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(Double valorDebito) {
		this.valorDebito = valorDebito;
	}
	
	

}
