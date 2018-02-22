function cargarClasificacion() {
    consumirWS("http://" + hostURL + "/RESTUCIPService/rest/claspaciente/clasifi",
            function (data) {
                var lista = data.clasificacionPaciente;
                for (var i = 0; i < lista.length; i++) {
                    var clasificacion = lista[i];
                    //Agregar a la lista
                    var liClasif = document.createElement('li');
                    $(liClasif).attr("id", 'clasif-' + clasificacion.id);
                    $("#listaClasificacion").append(liClasif);

                    //Incluir elemento párrafo
                    var parrafo = document.createElement('span');
                    $(liClasif).prepend(parrafo);
                    parrafo.innerHTML = clasificacion.label;

                    //Incluir un control de seleccion
                    var check = document.createElement('input');
                    $(check).attr("id", 'check-clas-' + clasificacion.id);
                    $(check).attr("type", 'checkbox');
                    $(check).attr("value", clasificacion.id);
                    $(check).attr("class", 'checkClasif');
                    $(liClasif).prepend(check);

                    $(liClasif).on("click", {id: clasificacion.id}, function (event) {
                        if (event.target.id.startsWith('clasif')) {//Evitando doble evento
                            event.stopPropagation();//Para no volver a llamar al click del padre
                            var selector = document.getElementById('check-clas-' + event.data.id);
                            if (selector.checked === true) {
                                selector.checked = false;
                            } else {
                                selector.checked = true;
                            }
                        }

                    });
                }
            }
    );

}

function cargarCampos(id) {

    consumirWS("http://" + hostURL + "/RESTUCIPService/rest/items/campos/" + id,
            function (data, status) {

                var lista = data.dashItem;

                var tabla = document.getElementById('tbl-' + id);
                var aux = document.createElement('ul');
                $(aux).attr("id", 'subtbl-' + id);

                var linkTodos = document.createElement('a');
                $(linkTodos).attr("id", 'link-' + id);
                $(linkTodos).attr("href", 'javascript:void();');
                $(linkTodos).attr("class", 'link-todos');
                $(linkTodos).html("Seleccionar todos");
                //Asociar un evento
                $(linkTodos).on("click", {id: id}, function (event) {
                    var selector = document.getElementById('subtbl-' + event.data.id);
                    var estado = $(selector).find(":checkbox")[0].checked;
                    $(selector).find(":checkbox").each(function () {
                        if (estado === true) {
                            this.checked = false;
                        } else {
                            this.checked = true;
                        }

                    });
                });

                $(tabla).append(linkTodos);
                $(tabla).append(aux);

                for (var i = 0; i < lista.length; i++) {
                    var item = lista[i];

                    //Agregar a la lista
                    var campo = document.createElement('li');
                    $(campo).attr("id", 'campo-' + item.id);
                    campo.innerHTML = item.label;
                    $(aux).append(campo);

                    //Incluir un control de seleccion
                    var check = document.createElement('input');
                    $(check).attr("id", 'check-' + item.id);
                    $(check).attr("type", 'checkbox');
                    $(check).attr("value", item.id);
                    $(check).attr("class", 'checkVariable');
                    $(campo).prepend(check);

                    //Asociar un evento
                    $(campo).on("click", {id: item.id}, function (event) {
                        if (event.target.id.startsWith('campo')) {//Evitando doble evento
                            event.stopPropagation();//Para no volver a llamar al click del padre
                            var selector = document.getElementById('check-' + event.data.id);
                            if (selector.checked === true) {
                                selector.checked = false;
                            } else {
                                selector.checked = true;
                            }
                        }

                    });

                }

            }
    );

}

var arrCargarCampos = [];//Permite determinar si ya se cargaron los campos

function cargarTablas() {
    consumirWS("http://" + hostURL + "/RESTUCIPService/rest/items/tablas",
            function (data, status) {
                var lista = data.dashItem;

                for (var i = 0; i < lista.length; i++) {
                    var item = lista[i];

                    //Agregar a la lista
                    var liTabla = document.createElement('li');
                    $(liTabla).attr("id", 'tbl-' + item.id);
                    $("#tablas").append(liTabla);

                    //Incluir elemento párrafo
                    var parrafo = document.createElement('span');
                    $(liTabla).prepend(parrafo);
                    parrafo.innerHTML = item.label;

                    //Incluir un control de seleccion
                    var check = document.createElement('input');
                    $(check).attr("id", 'check-' + item.id);
                    $(check).attr("type", 'checkbox');
                    $(check).attr("value", item.id);
                    $(check).attr("class", 'checkVariable');
                    $(liTabla).prepend(check);

                    //Asociar un evento
                    $(liTabla).on("click", {id: item.id}, function (event) {
                        //alert('liTabla...');
                        event.stopPropagation();//Para no volver a llamar al click del padre
                        var selector = document.getElementById('check-' + event.data.id);

                        if (event.target.id.startsWith('tbl')) {//Evitando doble evento

                            if (selector.checked === true) {
                                selector.checked = false;
                            } else {
                                selector.checked = true;
                            }

                        }

                        if (!arrCargarCampos[event.data.id]) {
                            arrCargarCampos[event.data.id] = true;
                            cargarCampos(event.data.id);
                        }

                        if (selector.checked === true) {
                            //alert('checked: ' + selector.checked + ' show');
                            $('#link-' + event.data.id).collapse("show");
                            $('#subtbl-' + event.data.id).collapse("show");
                        } else {
                            //alert('checked: ' + selector.checked + ' hide');
                            $('#link-' + event.data.id).collapse("hide");
                            $('#subtbl-' + event.data.id).collapse("hide");
                        }

                    });

                }

            }
    );
}

var txtFecha1 = moment().startOf('month').format('YYYY-MM-DD');
var txtFecha2 = moment().format('YYYY-MM-DD');

function consultar() {
    if (txtFecha1 === undefined || txtFecha2 === undefined) {
        alert('Por favor seleccionar las fechas');
        return false;
    }

    if (txtFecha2 <= txtFecha1) {
        alert('La primera fecha (Desde) no puede ser mayor o igual a la segunda fecha (Hasta).\nNo se ejecutara la consulta hasta que no se ingrese correctamente las fechas.');
        return false;
    }


    var listaChecksVariables = $(".checkVariable:checked");
    if (listaChecksVariables.length < 1) {
        alert('Por favor seleccionar al menos un modulo');
        return false;
    }

    var vvariables = 0;
    for (var i = 0; i < listaChecksVariables.length; i++) {
        var aux = $(listaChecksVariables[i]).attr('value');
        if (aux > vvariables) {
            vvariables = aux;
        }
    }
    // 41 : el numero de modulos o tablas de variables ucip son 40
    if (vvariables < 41) {
        alert('Por favor seleccione al menos una variable');
        return false;
    }


    var txt = '';
    for (var i = 0; i < listaChecksVariables.length; i++) {
        var check = listaChecksVariables[i];
        txt += $(check).attr("value") + '-';
    }

    //alert('variables: ' + JSON.stringify(txt));

    var listaChecksClasificacion = $(".checkClasif:checked");
    if (listaChecksClasificacion.length < 1) {
        alert('Por favor seleccionar al menos una clasificación');
        return false;
    }

    var txt2 = '';
    for (var i = 0; i < listaChecksClasificacion.length; i++) {
        var check = listaChecksClasificacion[i];

        txt2 += $(check).attr("value") + '-';

    }

    var request = "http://" + hostURL + "/RESTUCIPService/rest/items/consulta/"
            + txt + "/"
            + txt2 + "/"
            + txtFecha1 + "/"
            + txtFecha2;

    //alert('request: ' + request);

    consumirWS(request,
            function (data, status) {
                if (data.length === 0) {
                    alert('No hay resultados para esta consulta');
                }

                //Contando registros
                $("#cuenta-json").html(data.length);

                //alert("Data: " + data + "\nStatus: " + status);
                $("#jsontotable").html("");

                $.jsontotable(data, {id: '#jsontotable', header: 1});
                //$.jsontotable(data, {id: '#jsontotable', header: false});
            }
    );

}

function exportar() {
    $(".jsontotable table").tableToXLS();
}

cargarClasificacion();
cargarTablas();