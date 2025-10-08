package com.devsenai1A.conversordeMoedas;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversordeMoedas {
	
@PostMapping("/converter")
@ResponseBody
public Map<String, Object>converterJson(
		@RequestParam double n1,
		@RequestParam String m1,
		@RequestParam String m2){
	double resultado = 0;
	String erro = null;
	
	switch(m1) {
	
	case "Real":
		if(m2.equals("Dolar")) {
			resultado = n1 * 0.19; 
		} else if(m2.equals("Euro")) {
			resultado = n1 * 0.16; 
		} else {
			erro = "Moeda de destino inválida";
		}
		break;
	case "Dolar":
		if(m2.equals("Real")) {
			resultado = n1 * 5.34; 
		} else if(m2.equals("Euro")) {
			resultado = n1 * 0.86; 
		} else {
			erro = "Moeda de destino inválida";
		}
		break;
	case "Euro":
		if(m2.equals("Real")) {
			resultado = n1 * 6.22;
		} else if(m2.equals("Dolar")) {
			resultado = n1 * 1.16; 
		} else {
			erro = "Moeda de destino inválida";
		}
		break;
	}
	
	
	
	Map<String, Object> resp = new HashMap<>();
	resp.put ("resultado", resultado);
	resp.put ("erro", erro);
	return resp;

	}
}
