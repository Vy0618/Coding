

document.getElementById('calcForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const n1 = parseFloat(document.getElementById('n1').value);
      const n2 = parseFloat(document.getElementById('n2').value);
      const operacao = document.getElementById('operacao').value;
    
let resultado = 0;
let erro = 0;

document.getElementById('calcForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const n1 = parseFloat(document.getElementById('n1').value);
    const n2 = parseFloat(document.getElementById('n2').value);
    const operacao = document.getElementById('operacao').value;
    
    let resultado = 0;
    let erro = 0;

    document.getElementById('resultado').textContent = "";
    document.getElementById('erro').textContent = "";

    try {
        const response = await fetch('http://localhost:8080/calcular', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: new URLSearchParams({
                n1: n1,
                n2: n2,
                operacao: operacao
            })
        });

        if (!response.ok) {
            throw new Error('Erro na requisição');
        }

        const data = await response.json();

        if (data.erro) {
            document.getElementById('erro').textContent = data.erro;
        } else {
            document.getElementById('resultado').textContent = data.resultado;
        }

    } catch (err) {
        document.getElementById('erro').textContent = 'Erro ao processar a requisição';
    }
});


	
	

 

// switch(operacao) {
// 			case "somar" : resultado = n1 + n2; break;
// 			case "subtrair" : resultado = n1 - n2; break;
// 			case "multiplicar" : resultado = n1 * n2; break;
// 			case "dividir" :
// 				 if (n2 == 0) {
// 				erro="Não é possível dividir por zero";
// 			}
// 				else {
// 					resultado = n1 / n2; break;
// 			}
// 			default: erro = "operação inválida";
			
// 			}

	

			document.getElementById('resultado').textContent = resultado;
			document.getElementById('erro').textContent = erro;



			
if (erro==0){
	document.getElementById("resultado").textContent= resultado;

} else{
	document.getElementById("erro").textContent= erro;
}



});
