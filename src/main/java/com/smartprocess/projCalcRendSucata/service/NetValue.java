package com.smartprocess.projCalcRendSucata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartprocess.projCalcRendSucata.entities.RawMaterial;

@Service
public class NetValue {

	@Autowired
	private MaterialYield materialYield;
	
	public double netValue(RawMaterial rawMaterial) {
		
		double discount = rawMaterial.getPesoBruto() - materialYield.yield(rawMaterial);
		 return rawMaterial.getPesoBruto() - discount;
	}
	
}
