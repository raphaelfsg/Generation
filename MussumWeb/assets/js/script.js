var nome = window.document.getElementById('nome');
var nomeOK = false;

var email = document.querySelector('#email');
var emailOK = false;

var mensagem = document.querySelector('#mensagem');
var mensagemOK = false;


function validarNome() {
    let txtNome = document.querySelector("#TXTNome");
    if(nome.value.length < 3) {
        txtNome.innerHTML = 'Nome inválido!'
        txtNome.style.display = 'block'
    } else {
        txtNome.style.display = 'none'
        nomeOK = true
    }
};

function validarEmail() {
    let txtEmail = document.querySelector('#TXTEmail');
    if(email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = 'E-mail inválido!'
        txtEmail.style.display = 'block'
    } else {
        txtEmail.style.display = 'none'
        emailOK = true
    }
};

function validarMensagem() {
    let txtMensagem = document.querySelector('TXTMensagem')
    if(mensagem.value.length >= 100) {
        txtMensagem.innerHTML= 'Texto limitado a 100 caracteres'
        txtMensagem.style.display = 'block'
    } else {
        txtMensagem.style.display = 'none'
        mensagemOK = true
    }
};

function enviar() {
    if(nomeOK == true && emailOK == true && mensagemOK == true) { 
        alert('Formulário enviado com sucesso')
    } else {
        alert('Preencha o cadastro corretamente')
    }
};
