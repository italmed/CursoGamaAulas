function login() {

    let a; // let criando  variável somente dentro dessa função (DÊ PREFERENCIA AO LET)
    var b; // var cria uma variável que pode ser usada para todas as funções do mesmo arquivo
    const c = 2; //declaração de uma constante, onde não se pode trocar o valor

    let nome = document.getElementById ("txtname"); 
    let resposta = document.getElementById("resposta");
    console.log(nome.value);

    if(nome.value == "Itallo"){
        alert("Login com sucesso")
        resposta.value = "Olá, " + nome.value;
    } else{
        alert("quem é você?")
        resposta.value = "Usuário desconhecido. Olá, " + nome.value;
    }
}