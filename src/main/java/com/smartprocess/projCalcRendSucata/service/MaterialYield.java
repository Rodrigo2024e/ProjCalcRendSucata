package com.smartprocess.projCalcRendSucata.service;

import org.springframework.stereotype.Service;

import com.smartprocess.projCalcRendSucata.entities.RawMaterial;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@Service
public class MaterialYield {

	public double yield(RawMaterial rawMaterial) {
		
		if (rawMaterial.getCode() == 1111) {
			return rawMaterial.getPesoBruto() * 0.97;
			
		} else if (rawMaterial.getCode() == 1113) {
			return rawMaterial.getPesoBruto() * 0.86;
			
		} else if (rawMaterial.getCode() == 1115) {
			return rawMaterial.getPesoBruto() * 0.92;
			
		} else {
			return 0;
		}
		
	}
	
	
}
