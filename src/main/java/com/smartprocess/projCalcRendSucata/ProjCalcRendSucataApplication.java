package com.smartprocess.projCalcRendSucata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.smartprocess.projCalcRendSucata.entities.RawMaterial;
import com.smartprocess.projCalcRendSucata.service.NetValue;

@SpringBootApplication
public class ProjCalcRendSucataApplication implements CommandLineRunner {

	@Autowired
	private NetValue netValue;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjCalcRendSucataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("\n----------------------------------------------");
		RawMaterial input1 = new RawMaterial(1111, "Perfil de processo", 1000);
		System.out.println("Códgo da Materia-Prima: " + input1.getCode());
		System.out.println("Descrição: " + input1.getDescricao());
		System.out.printf("Peso bruto: " + "%.2f" + " kg",input1.getPesoBruto());
		System.out.printf("\nPeso líquido: " + "%.2f" + " kg",netValue.netValue(input1));
		System.out.println("\n----------------------------------------------");
		
		RawMaterial input2 = new RawMaterial(1113, "Perfil pintado", 1000);
		System.out.println("Códgo da Materia-Prima: " + input2.getCode());
		System.out.println("Descrição: " + input2.getDescricao());
		System.out.printf("Peso bruto: " + "%.2f" + " kg",input2.getPesoBruto());
		System.out.printf("\nPeso líquido: " + "%.2f" + " kg",netValue.netValue(input2));
		System.out.println("\n----------------------------------------------");
		
		RawMaterial input3 = new RawMaterial(1115, "Perfil anodizado", 1000);
		System.out.println("Códgo da Materia-Prima: " + input3.getCode());
		System.out.println("Descrição: " + input3.getDescricao());
		System.out.printf("Peso bruto: " + "%.2f" + " kg",input3.getPesoBruto());
		System.out.printf("\nPeso líquido: " + "%.2f" + " kg",netValue.netValue(input3));
		System.out.println("\n----------------------------------------------");
		
		
	}
	
}
