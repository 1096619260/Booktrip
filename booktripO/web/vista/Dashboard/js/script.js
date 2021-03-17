
function init(){
	var x = document.getElementById("Listado");
    var y = document.getElementById("Registrar");
    x.style.display = "block";
    y.style.display = "none";

}

function myFunctionB1() {
    var x = document.getElementById("Listado");
    var y = document.getElementById("Registrar");
    if (x.style.display === "none") {
        x.style.display = "block";
        y.style.display = "none";

    } else {
        x.style.display = "none";
        y.style.display = "none";  
    }
    
}

function myFunctionB2() {
    var x = document.getElementById("Listado");
    var y = document.getElementById("Registrar");
    if (y.style.display === "none") {
        y.style.display = "block";
        x.style.display = "none";
    } else {
        x.style.display = "none";
        y.style.display = "none";      
    }
}



init();