package com.microservices.grupo3.contacorrente.controller.dto;

public class SaldoCreditoDTO {
	
	private Double valorCredito;

	public SaldoCreditoDTO(Double valorCredito) {
		super();
		this.valorCredito = valorCredito;
	}

	public SaldoCreditoDTO() {
		super();
	}

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}
	
	

}
