alert("Bienvenidos a BookTrip");



$(function validarEstado(){
    var nombre;
    $(".btnRegistrar").on('click', function(){
        nombre=$("#txtNom").val();
        if (nombre.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }else{
           alert('Registro exitoso')
        }
    });
});
// v tipo inmueble

 $(function validarTipoInmueble(){
    var nombre;
    $(".btnGuardar").on('click', function(){
        nombre=$("#txtNom").val();
        if (nombre.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }else{
           alert('Registro exitoso')
        }
    });
});
