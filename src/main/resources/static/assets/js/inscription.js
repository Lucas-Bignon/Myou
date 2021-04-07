/**
 * Javascript AP
 * */

function addUser(form) {
    const user = {  prenom:form.prenom.value, 
                    nom:form.nom.value,
                    email:form.email.value, 
                    password:form.password.value, 
                    agree:form.accepter.value
    }
    fetch("http://localhost:81/myou/myou.js", {
        method: 'POST',
        headers: {
            'Accept':'application/json, text/plain, */*',
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({prenom:user.prenom, nom:user.nom, email:user.email, password:user.password, agree:user.agree}) 
    })
    .then(function(response) {

        console.log(response.status + "Test"); // Will show you the status

        if (response.status == 409) {
            duplicateValue("Cette mail est déjà utiliser");
        }else{
            setTimeout(() => document.location.href="/index.html", 3000);
            alert("Vous allez étre redirigez vers la page d'accueil");
        }
        return response.json();
    })
    .then(data => {
        console.log(data)
    })

    console.log(user);

    function duplicateValue(message) {
        const mailInput = document.querySelector("#email_input");
        mailInput.classList.add("errorInput");
        document.querySelector("#messageInformation").innerHTML=`
            <p>${message}</p>
        `
    }

    
}

