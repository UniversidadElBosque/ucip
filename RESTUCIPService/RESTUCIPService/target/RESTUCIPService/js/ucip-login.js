var hostPROD = "aretico.com:1115";
var hostDES = "localhost:8084";
var hostURL= hostPROD;

function validateForm() {
    var user = document.getElementById("username").value;
    var user = user.trim();
    var pass = document.getElementById("password").value;
    var pass = pass.trim();

    if (user === "") {
        document.getElementById('error').innerHTML = "Por favor ingrese un usuario";
        return false;
    }
    if (pass === "") {
        document.getElementById('error').innerHTML = "Por favor ingrese una contraseña";
        return false;
    }

    var request = "http://" + hostURL +"/RESTUCIPService/rest/usuario/validarUsuario/"
            + user + "/"
            + pass;

    $.getJSON(request, function (data, status) {
        //alert("data: " + JSON.stringify(data));
        //alert('token: ' + data.token);

        if(data.token !== 'false'){
            guardarToken(data.token);
            location.href = "http://" + hostURL + "/RESTUCIPService/echarts.html";
        } else {
            document.getElementById('error').innerHTML = "Usuario o contraseña incorrecto, verifique!";
        }
    });
}

function guardarToken(token){
    // Check browser support
    if (typeof(Storage) !== "undefined") {
        // Store
        localStorage.setItem("token", token);
    } else {
        console.log("Navegador sin LocalStorage!!");
    }
}

function getToken(){
    return localStorage.getItem("token");
}

function logout(){
    localStorage.removeItem("token");
    location.href = "http://" + hostURL + "/RESTUCIPService/login.html";
}

function validarLogin(){
    var tmp = localStorage.getItem("token");
    //alert(tmp);
    if(tmp === null){
        logout();
    }
}
