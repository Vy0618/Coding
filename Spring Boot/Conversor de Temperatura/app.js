document.getElementById('conversorForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const temperatura = parseFloat(document.getElementById('temperatura').value);
      const operacao = document.getElementById('operacao').value;
    
let resultado = 0;
let erro = 0;

document.getElementById('conversorForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const temperatura = parseFloat(document.getElementById('temperatura').value);

    const operacao = document.getElementById('operacao').value;
    
    let resultado = 0;
    let erro = 0;

    document.getElementById('resultado').textContent = "";
    document.getElementById('erro').textContent = "";

    try {
        const response = await fetch('http://localhost:8080/converter', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: new URLSearchParams({
                temperatura:temperatura,
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

			document.getElementById('resultado').textContent = resultado;
			document.getElementById('erro').textContent = erro;



			
if (erro==0){
	document.getElementById("resultado").textContent= resultado;

} else{
	document.getElementById("erro").textContent= erro;
}



});
