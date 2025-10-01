package com.devsenai1A.calculadora;

import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@RestController
public class calculadoraController {
	
		/*@GetMapping("/somar")
		public double somar(@RequestParam double a, @RequestParam double b) {
		return a + b;
	}
		@GetMapping("/subtrair")
		public double subtrair(@RequestParam double a, @RequestParam double b) {
		return a - b;
	}
		@GetMapping("/multiplicar")
		public double multiplicar(@RequestParam double a, @RequestParam double b) {
		return a * b;
	}
		@GetMapping("/dividir")
		public double dividir(@RequestParam double a, @RequestParam double b) {
		return a / b;
	}
		*/
		
		@PostMapping ("/calcular")
		@ResponseBody
		public Map<String, Object>calcularJson(
				@RequestParam double n1,
				@RequestParam double n2,
				@RequestParam String operacao){
			double resultado = 0;
			String erro = null;
			
			switch(operacao) {
			case "somar" : resultado = n1 + n2; break;
			case "subtrair" : resultado = n1 = n2; break;
			case "multiplicar" : resultado = n1 * n2; break;
			case "dividir" : if (n2 == 0) {
				erro="Não é possíve dividir por zero";
			}
				else {
					resultado = n1 / n2; break;
			}
			default: erro = "operação inválida";
			
			}
			Map<String, Object> resp = new HashMap<>();
			resp.put("resultado: ", resultado);
			resp.put("erro: ", erro);
			return resp;
			
		}	
			
}