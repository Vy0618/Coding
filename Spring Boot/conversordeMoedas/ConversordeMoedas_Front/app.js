document.getElementById('conversorForm').addEventListener('submit', async function (e) {
    e.preventDefault();
    const n1 = parseFloat(document.getElementById('n1').value);
    const m1 = document.getElementById('m1').value;
    const m2 = document.getElementById('m2').value;

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
                n1:n1,
                m1:m1,
                m2:m2
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

		
