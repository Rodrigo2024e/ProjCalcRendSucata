package com.smartprocess.projCalcRendSucata.entities;

public class RawMaterial {

	private Integer code;
	private String descricao;
	private double pesoBruto;
	
	public RawMaterial() {
	}

	public RawMaterial(Integer code, String descricao, double pesoBruto) {
		this.code = code;
		this.descricao = descricao;
		this.pesoBruto = pesoBruto;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	
	
}
