//alert("Bienvenidos a BookTrip");

function validarEstado(){
    var nombre = document.getElementById('txtNombre').value;

    if (nombre === "") {
        alert("EL campo es obligatorio");
        return false;
    }else{
      alert("registro exitoso");
    }
   
}

//var form = document.getElementById('formu');

function checkInputRol(){
    
    var nombre = document.getElementById('txtNom');
    var nombreValue = nombre.value.trim();
    
    if(nombreValue == ''){
        SetErrorFor(nombre , 'EL campo es obligatorio');
        return false;
    }else{
        setSuccessFor(nombre);
        
    }
    
}

function setErrorFor(input, message) {
    const formGroup = input.parentElement;
    const small = formGroup.querySelector('small');
    formGroup.className = 'form-group error';
    small.innerText = message;
}

function setSuccessFor(input) {
    var formGroup = input.parentElement;
    formGroup.className = 'form-group success';
}












    
function validarRol2(){
    var nombre = document.getElementById('txtNom').value;
    if (nombre === "") {
        alert("EL campo es obligatorio");
        return false;
    }else{
      alert("registro exitoso");
    }
   
}
    
