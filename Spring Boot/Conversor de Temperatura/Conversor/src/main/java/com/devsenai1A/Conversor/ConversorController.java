package com.devsenai1A.Conversor;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

	
	@PostMapping("/converter")
	@ResponseBody
	public Map<String, Object>converterJson(
		@RequestParam double temperatura,
		@RequestParam String operacao){
			double resultado = 0;
			String erro = null;
			
			switch(operacao) {
			case "CpF": resultado = temperatura * 1.8 + 32; break;
			case "CpK": resultado = temperatura + 273 ; break;
			case "FpC": resultado = (temperatura-32)/1.8; break;
			case "FpK": resultado = (temperatura-32) * 5/9 + 273; break;
			case "KpC": resultado = temperatura - 273; break;
			case "KpF": resultado = (temperatura-273) * 1.8 + 32 ; break;
			
			}
			
			System.out.println("Result: " + resultado);
			System.out.println("Error: " + erro);
		
			Map<String, Object> resp = new HashMap<>();
			resp.put("resultado", resultado);
			resp.put("erro", erro);
			return resp;

			
		}
	
	
	
	
	
}
