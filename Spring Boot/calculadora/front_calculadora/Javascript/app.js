

document.getElementById('calcForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const n1 = parseFloat(document.getElementById('n1').value);
      const n2 = parseFloat(document.getElementById('n2').value);
      const operacao = document.getElementById('operacao').value;
    
let resultado = 0;
let erro = 0;

switch(operacao) {
			case "somar" : resultado = n1 + n2; break;
			case "subtrair" : resultado = n1 - n2; break;
			case "multiplicar" : resultado = n1 * n2; break;
			case "dividir" :
				 if (n2 == 0) {
				erro="Não é possível dividir por zero";
			}
				else {
					resultado = n1 / n2; break;
			}
			default: erro = "operação inválida";
			
			}

	

			document.getElementById('resultado').textContent = resultado;
			document.getElementById('erro').textContent = erro;

alert(resultado)

});
