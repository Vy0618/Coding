document.getElementById('submit-btn').addEventListener('click', async function (e) {
    e.preventDefault();

    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;

    try {
        const response = await fetch('http://localhost:8080/authlogin/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                email: email,
                password: password
            })
        });

        const text = await response.text(); // porque o controller retorna STRING

        if (!response.ok) {
            window.location.href="failure.html";
        } else {
              window.location.href="sucess.html";
        }

    } catch (err) {
        alert("ERRO")
    }
});