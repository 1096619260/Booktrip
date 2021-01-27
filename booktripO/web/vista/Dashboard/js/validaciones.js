
//alert("Bienvenidos a BookTrip");

function validar(){
    var nombre = document.getElementById('txtNombre').value;

    if (nombre === "") {
        alert("EL campo es obligatorio");
        return false;
    }else{
      alert("registro exitoso");
    }
   
}
    
