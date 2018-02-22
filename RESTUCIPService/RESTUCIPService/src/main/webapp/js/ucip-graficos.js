function corregirData(data, campo) {
    if (data[campo].length === undefined) {
        var aux = data[campo];
        data[campo] = [];
        data[campo].push(aux);
    }
}

var msj = "La primera fecha (Desde) no puede ser mayor que la segunda fecha (Hasta), revise las fechas por favor!! \nNo se actualizará la gráfica hasta no ingresar correctamente las fechas.";

function initDatePicker() {
    var optionSet2 = optionsDatepicker;
    optionSet2.startDate = moment().startOf('year');
    $('#single_cal3').daterangepicker(optionSet2, function (start, end, label) {
        txtFecha3 = start.format('YYYY-MM-DD');
        //validarFecha(txtFecha3, txtFecha4);
        if (txtFecha4 < txtFecha3) {
            alert(msj);
            return false;
        }
        actualizarGraficoEstancias();




    });
    optionsDatepicker.startDate = moment();
    $('#single_cal4').daterangepicker(optionsDatepicker, function (start, end, label) {
        txtFecha4 = start.format('YYYY-MM-DD');
        console.log("txtFecha4 antes del if: " + txtFecha4);
        //validarFecha(txtFecha3, txtFecha4);
        if (txtFecha4 < txtFecha3) {
            alert(msj);
            return false;
        }
        actualizarGraficoEstancias();

    });

    var optionSet2 = optionsDatepicker;
    optionSet2.startDate = moment().startOf('month');
    $('#single_cal5').daterangepicker(optionSet2, function (start, end, label) {
        txtFecha5 = start.format('YYYY-MM-DD');
        if (txtFecha6 < txtFecha5) {
            alert(msj);
            return false;
        }
        actualizarGraficoMortalidad();
        actualizarCausaMortalidad();

    });
    optionsDatepicker.startDate = moment();
    $('#single_cal6').daterangepicker(optionsDatepicker, function (start, end, label) {
        txtFecha6 = start.format('YYYY-MM-DD');
        if (txtFecha6 < txtFecha5) {
            alert(msj);
            return false;
        }
        actualizarGraficoMortalidad();
        actualizarCausaMortalidad();

    });

    var optionSet2 = optionsDatepicker;
    optionSet2.startDate = moment().startOf('month');
    $('#single_cal7').daterangepicker(optionSet2, function (start, end, label) {
        txtFecha7 = start.format('YYYY-MM-DD');
        if (txtFecha8 < txtFecha7) {
            alert(msj);
            return false;
        }
        actualizarGraficoClasificaciones();


    });
    optionsDatepicker.startDate = moment();
    $('#single_cal8').daterangepicker(optionsDatepicker, function (start, end, label) {
        txtFecha8 = start.format('YYYY-MM-DD');
        console.log(txtFecha8);
        if (txtFecha8 < txtFecha7) {
            alert(msj);
            return false;
        }
        actualizarGraficoClasificaciones();


    });

    var optionSet2 = optionsDatepicker;
    optionSet2.startDate = moment().startOf('month');
    $('#single_cal9').daterangepicker(optionSet2, function (start, end, label) {
        txtFecha9 = start.format('YYYY-MM-DD');
        if (txtFecha10 < txtFecha9) {
            alert(msj);
            return false;
        }
        actualizarCountPacientes();
        actualizarCountEstancias();
        actualizarPacientesVentilados();
    });
    optionsDatepicker.startDate = moment();
    $('#single_cal10').daterangepicker(optionsDatepicker, function (start, end, label) {
        txtFecha10 = start.format('YYYY-MM-DD');
        if (txtFecha10 < txtFecha9) {
            alert(msj);
            return false;
        }
        actualizarCountPacientes();
        actualizarCountEstancias();
        actualizarPacientesVentilados();
    });

    var optionSet2 = optionsDatepicker;
    optionSet2.startDate = moment().startOf('month');
    $('#single_cal13').daterangepicker(optionSet2, function (start, end, label) {
        txtFecha13 = start.format('YYYY-MM-DD');
        if (txtFecha14 < txtFecha13) {
            alert(msj);
            return false;
        }
        actualizarExtubacionFallida();
    });
    optionsDatepicker.startDate = moment();
    $('#single_cal14').daterangepicker(optionsDatepicker, function (start, end, label) {
        txtFecha14 = start.format('YYYY-MM-DD');
        if (txtFecha14 < txtFecha13) {
            alert(msj);
            return false;
        }
        actualizarExtubacionFallida();
    });
}

var themeGraficos;
function graficarEstancias() {
    if ($('#graficoEstancias').length) {
        themeGraficos = {
            color: [
                '#26B99A', '#34495E', '#BDC3C7', '#3498DB',
                '#9B59B6', '#8abb6f', '#759c6a', '#bfd3b7'
            ],

            title: {
                itemGap: 8,
                textStyle: {
                    fontWeight: 'normal',
                    color: '#408829'
                }
            },

            legend: {
                textStyle: {
                    color: '#0066cc',
                    fontSize: 18,
                    fontWeight: 'bold'
                }
            },

            dataRange: {
                color: ['#1f610a', '#97b58d']
            },

            toolbox: {
                color: ['#408829', '#408829', '#408829', '#408829']
            },

            tooltip: {
                backgroundColor: 'rgba(0,0,0,0.5)',
                axisPointer: {
                    type: 'line',
                    lineStyle: {
                        color: '#408829',
                        type: 'dashed'
                    },
                    crossStyle: {
                        color: '#408829'
                    },
                    shadowStyle: {
                        color: 'rgba(200,200,200,0.3)'
                    }
                }
            },

            dataZoom: {
                dataBackgroundColor: '#eee',
                fillerColor: 'rgba(64,136,41,0.2)',
                handleColor: '#408829'
            },
            grid: {
                borderWidth: 0
            },

            categoryAxis: {
                axisLine: {
                    lineStyle: {
                        color: '#408829'
                    }
                },
                splitLine: {
                    lineStyle: {
                        color: ['#eee']
                    }
                }
            },

            valueAxis: {
                axisLine: {
                    lineStyle: {
                        color: '#408829'
                    }
                },
                splitArea: {
                    show: true,
                    areaStyle: {
                        color: ['rgba(250,250,250,0.1)', 'rgba(200,200,200,0.1)']
                    }
                },
                splitLine: {
                    lineStyle: {
                        color: ['#eee']
                    }
                }
            },
            timeline: {
                lineStyle: {
                    color: '#408829'
                },
                controlStyle: {
                    normal: {color: '#408829'},
                    emphasis: {color: '#408829'}
                }
            },

            k: {
                itemStyle: {
                    normal: {
                        color: '#68a54a',
                        color0: '#a9cba2',
                        lineStyle: {
                            width: 1,
                            color: '#408829',
                            color0: '#86b379'
                        }
                    }
                }
            },
            map: {
                itemStyle: {
                    normal: {
                        areaStyle: {
                            color: '#ddd'
                        },
                        label: {
                            textStyle: {
                                color: '#c12e34'
                            }
                        }
                    },
                    emphasis: {
                        areaStyle: {
                            color: '#99d2dd'
                        },
                        label: {
                            textStyle: {
                                color: '#c12e34'
                            }
                        }
                    }
                }
            },
            force: {
                itemStyle: {
                    normal: {
                        linkStyle: {
                            strokeColor: '#408829'
                        }
                    }
                }
            },
            chord: {
                padding: 4,
                itemStyle: {
                    normal: {
                        lineStyle: {
                            width: 1,
                            color: 'rgba(128, 128, 128, 0.5)'
                        },
                        chordStyle: {
                            lineStyle: {
                                width: 1,
                                color: 'rgba(128, 128, 128, 0.5)'
                            }
                        }
                    },
                    emphasis: {
                        lineStyle: {
                            width: 1,
                            color: 'rgba(128, 128, 128, 0.5)'
                        },
                        chordStyle: {
                            lineStyle: {
                                width: 1,
                                color: 'rgba(128, 128, 128, 0.5)'
                            }
                        }
                    }
                }
            },
            gauge: {
                startAngle: 225,
                endAngle: -45,
                axisLine: {
                    show: true,
                    lineStyle: {
                        color: [[0.2, '#339933'], [0.8, '#ffcc00'], [1, '#cc0000']],
                        width: 8
                    }
                },
                axisTick: {
                    splitNumber: 10,
                    length: 12,
                    lineStyle: {
                        color: 'auto'
                    }
                },
                axisLabel: {
                    textStyle: {
                        color: 'auto'
                    }
                },
                splitLine: {
                    length: 18,
                    lineStyle: {
                        color: 'auto'
                    }
                },
                pointer: {
                    length: '90%',
                    color: 'auto'
                },
                title: {
                    textStyle: {
                        color: '#333'
                    }
                },
                detail: {
                    textStyle: {
                        color: 'auto'
                    }
                }
            },
            textStyle: {
                fontFamily: 'Arial, Verdana, sans-serif',
            }
        };

    }
}

var txtFecha9 = moment().startOf('month').format('YYYY-MM-DD');
var txtFecha10 = moment().format('YYYY-MM-DD');
var txtFecha11 = moment().startOf('year').format('YYYY-MM-DD');
var txtFecha12 = moment().format('YYYY-MM-DD');
function actualizarCountPacientes() {

    var request = "http://" + hostURL + "/RESTUCIPService/rest/paciente/pacientecount/"
            + txtFecha9 + "/"
            + txtFecha10 + "/"
            + txtFecha11 + "/"
            + txtFecha12;

    consumirWS(request, function (data, status) {
        $("#cuentaPacientes-json").html(data.cuenta);
        $("#cunetaTotalPacientes-json").html(data.cuentaTotal);
    });
}

function actualizarCountEstancias() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/coutestanciaucip/"
            + txtFecha9 + "/"
            + txtFecha10 + "/"
            + txtFecha11 + "/"
            + txtFecha12;
    // alert('resuqest: ' + request);
    consumirWS(request, function (data, status) {
        //alert('Data: ' + data.cuenta);
        $("#cuentaEstancias-json").html(data.cuenta);
        $("#cunetaTotalEstancias-json").html(data.cuentaTotal);
    });
}

function actualizarPacientesVentilados() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/pacientesventilados/"
            + txtFecha9 + "/"
            + txtFecha10;
    // alert('resuqest: ' + request);
    consumirWS(request, function (data, status) {
        //alert('Data: ' + data.promedio);
        var x = Math.round((data.respiratora * 100)) / 100;
        var y = Math.round((data.promedioVentilatotio * 100)) / 100;
        $("#pacientesventilados-json").html(x);
        $("#promedioventilados-json").html(y);
    });
}


var txtFecha3 = moment().startOf('year').format('YYYY-MM-DD');
var txtFecha4 = moment().format('YYYY-MM-DD');
function actualizarGraficoEstancias() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/estadisticaIngresos/"
            + txtFecha3 + "/"
            + txtFecha4;
    consumirWS(request, function (data, status) {
        var dataXIngreso = [];
        var dataYIngreso = [];
        var suma = 0;

        if (data === null) {
            alert('No se encontraron estancias para este rango de fecha. \nPor lo tanto no se mostrara la gráfica.\nSeleccione otro rango de fecha!');
            data = 0;
        } else {
            corregirData(data, 'serieGrafico');
            for (var i = 0; i < data.serieGrafico.length; i++) {
                var x = data.serieGrafico[i].ejeX;
                var y = data.serieGrafico[i].ejeY;
                var fecha = moment(x, 'YYYY-MM').locale('es').format('MMMM YYYY');

                dataXIngreso.push(fecha);
                dataYIngreso.push(y);
                suma += parseInt(y);
            }
        }

        var echartBar = echarts.init(document.getElementById('graficoEstancias'), themeGraficos);
        echartBar.setOption({
            title: {
                text: 'Estancias',
                subtext: 'Ingresos por mes'
            },
            tooltip: {
                show: true,
                trigger: 'axis'
            },
            legend: {
                data: ['ingresos (' + suma + ')']
            },
            toolbox: {
                show: false
            },
            calculable: false,
            xAxis: [{
                    type: 'category',
                    data: dataXIngreso
                }],
            yAxis: [{
                    type: 'value'
                }],
            series: [{
                    name: 'ingresos (' + suma + ')',
                    type: 'bar',
                    label: {
                        normal: {
                            show: true,
                            position: 'top'
                        }
                    },
                    data: dataYIngreso,
                    markLine: {
                        data: [{
                                type: 'average',
                                name: 'Promedio'
                            }]
                    }
                }]
        });
    });
}

var txtFecha5 = moment().startOf('month').format('YYYY-MM-DD');
var txtFecha6 = moment().format('YYYY-MM-DD');
function actualizarGraficoMortalidad() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/indicadorMortalidad/"
            + txtFecha5 + "/"
            + txtFecha6;
    consumirWS(request, function (data, status) {
        var indicador = Math.round((data.indicador * 100)) / 100;
        //if (indicador >= 1) {
        //    alert("Mortalidad por encima de 1");
        //}

        if ($('#graficoMortalidad').length) {

            var echartGauge = echarts.init(document.getElementById('graficoMortalidad'), themeGraficos);
            echartGauge.setOption({
                tooltip: {
                    formatter: "{a} <br/>{b} : {c}"
                },
                toolbox: {
                    show: true,
                    feature: {
                        saveAsImage: {
                            show: true,
                            title: "Save Image"
                        }
                    }
                },
                series: [{
                        name: 'Mortalidad',
                        type: 'gauge',
                        center: ['50%', '50%'],
                        startAngle: 206, //180, //140,
                        endAngle: -25, //-140,
                        min: 0,
                        max: 2,
                        precision: 1,
                        splitNumber: 10,
                        axisLine: {
                            show: true,
                            lineStyle: {
                                color: [
                                    [0.45, '#339933'],
                                    [0.50, '#ffcc00'],
                                    [1, '#cc0000']
                                ],
                                width: 30
                            }
                        },
                        axisTick: {
                            show: true,
                            splitNumber: 5,
                            length: 8,
                            lineStyle: {
                                color: '#eee',
                                width: 1,
                                type: 'solid'
                            }
                        },
                        axisLabel: {
                            show: true,
                            textStyle: {
                                color: '#333'
                            }
                        },
                        splitLine: {
                            show: true,
                            length: 30,
                            lineStyle: {
                                color: '#eee',
                                width: 2,
                                type: 'solid'
                            }
                        },
                        pointer: {
                            length: '80%',
                            width: 8,
                            color: 'auto'
                        },
                        title: {
                            show: true,
                            offsetCenter: ['0%', 55],
                            textStyle: {
                                color: '#333',
                                fontSize: 20
                            }
                        },
                        detail: {
                            show: true,
                            backgroundColor: 'rgba(0,0,0,0)',
                            borderWidth: 0,
                            borderColor: '#ccc',
                            width: 100,
                            height: 80,
                            offsetCenter: ['0%', 88],
                            formatter: '{value}',
                            textStyle: {
                                color: 'auto',
                                fontSize: 30
                            }
                        },
                        data: [{

                                value: indicador,
                                name: 'Fall.: ' + data.mortalidad + '\nMortalidad'


                            }]
                    }]
            });
        }

    });
}

var txtFecha7 = moment().startOf('month').format('YYYY-MM-DD');
var txtFecha8 = moment().format('YYYY-MM-DD');
function actualizarGraficoClasificaciones() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/estadisticaClasificacion/"
            + txtFecha7 + "/"
            + txtFecha8;
    // alert('fecha clasificación: ' + request);
    consumirWS(request, function (data, status) {

        var dataXIngreso = [];
        var dataYIngreso = [];
        var suma = 0;

        if (data === null) {
            alert('No se encontraron clasificaciones para este rango de fecha. \nPor lo tanto no se mostrara la gráfica.\nSeleccione otro rango de fecha!');
            data = 0;
        } else {
            corregirData(data, 'serieGraficoClasificacion');
            for (var i = 0; i < data.serieGraficoClasificacion.length; i++) {
                var x = data.serieGraficoClasificacion[i].value;
                var y = data.serieGraficoClasificacion[i].name;
                dataXIngreso.push(x);
                dataYIngreso.push(y);
                suma += parseInt(x);
            }
        }

        if ($('#graficoClasificaciones').length) {

            var echartPie = echarts.init(document.getElementById('graficoClasificaciones'), themeGraficos);
            echartPie.setOption({
                title: {
                    text: 'Total estancias: ' + suma,
                    x: 'left'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} ({d}%)"
                },
                legend: {
                    textStyle: {
                        color: '#003366',
                        fontSize: 15,
                        fontWeight: 'bold'
                    },
                    orient: 'vertical',
                    //top: 'middle',
                    //bottom: -50,
                    left: 'left', //'position',
                    type: 'scroll',
                    right: 10,
                    top: 20,
                    bottom: 20,
                    data: dataYIngreso
                },
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'left',
                                    max: 1548
                                }
                            }
                        },
                        restore: {
                            show: true,
                            title: "Restore"
                        },
                        saveAsImage: {
                            show: true,
                            title: "Save Image"
                        }
                    }
                },
                calculable: true,
                series: [{
                        name: 'Clasificaciones',
                        type: 'pie',
                        radius: '70%',
                        center: ['65%', '55%'],
                        data: data.serieGraficoClasificacion
                    }],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            });
            var dataStyle = {
                normal: {
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    }
                }
            };
            var placeHolderStyle = {
                normal: {
                    color: 'rgba(0,0,0,0)',
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    }
                },
                emphasis: {
                    color: 'rgba(0,0,0,0)'
                }
            };
        }

    });
}

var txtFecha13 = moment().startOf('month').format('YYYY-MM-DD');
var txtFecha14 = moment().format('YYYY-MM-DD');
function actualizarExtubacionFallida() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/estadisticaExtubacion/"
            + txtFecha13 + "/"
            + txtFecha14;
    // alert('fecha clasificación: ' + request);
    consumirWS(request, function (data, status) {

        var dataXIngreso = [];
        var dataYIngreso = [];
        var suma = 0;

        if (data === null) {
            alert('No se encontraron estubaciones fallidas para este rango de fecha. \nPor lo tanto no se mostrara la gráfica.\nSeleccione otro rango de fecha!');
            data = 0;
        } else {
            corregirData(data, 'serieGraficoClasificacion');
            for (var i = 0; i < data.serieGraficoClasificacion.length; i++) {
                var x = data.serieGraficoClasificacion[i].value;
                var y = data.serieGraficoClasificacion[i].name;
                dataXIngreso.push(x);
                dataYIngreso.push(y);
                suma += parseInt(x);
            }
        }

        if ($('#graficoExtubaciones').length) {

            var echartPie = echarts.init(document.getElementById('graficoExtubaciones'), themeGraficos);
            echartPie.setOption({
                title: {
                    text: 'Extubaciones fallidas: ' + suma,
                    x: 'left'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} ({d}%)"
                },
                legend: {
                    textStyle: {
                        color: '#003366',
                        fontSize: 15,
                        fontWeight: 'bold'
                    },
                    orient: 'vertical',
                    //top: 'middle',
                    //bottom: -50,
                    left: 'left', //'position',
                    type: 'scroll',
                    right: 10,
                    top: 20,
                    bottom: 20,
                    data: dataYIngreso
                },
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'left',
                                    max: 1548
                                }
                            }
                        },
                        restore: {
                            show: true,
                            title: "Restore"
                        },
                        saveAsImage: {
                            show: true,
                            title: "Save Image"
                        }
                    }
                },
                calculable: true,
                series: [{
                        name: 'Estubaciones',
                        type: 'pie',
                        radius: '70%',
                        center: ['65%', '55%'],
                        data: data.serieGraficoClasificacion
                    }],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            });
            var dataStyle = {
                normal: {
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    }
                }
            };
            var placeHolderStyle = {
                normal: {
                    color: 'rgba(0,0,0,0)',
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    }
                },
                emphasis: {
                    color: 'rgba(0,0,0,0)'
                }
            };
        }

    });
}

function actualizarCausaMortalidad() {
    var request = "http://" + hostURL + "/RESTUCIPService/rest/estanciaucip/causaMortalidad/"
            + txtFecha5 + "/"
            + txtFecha6;
    consumirWS(request, function (data, status) {

        var dataXIngreso = [];
        var dataYIngreso = [];
        var suma = 0;

        if (data === null) {
            alert('No se encontraron causas de mortalidad para este rango de fecha. \nPor lo tanto no se mostrara la gráfica.\nSeleccione otro rango de fecha!');
            data = 0;
        } else {
            corregirData(data, 'serieGraficoClasificacion');
            for (var i = 0; i < data.serieGraficoClasificacion.length; i++) {
                var x = data.serieGraficoClasificacion[i].value;
                var y = data.serieGraficoClasificacion[i].name;
                dataXIngreso.push(x);
                dataYIngreso.push(y);
                suma += parseInt(x);
            }
        }

        if ($('#graficoCausaMortaliadad').length) {

            var echartPie = echarts.init(document.getElementById('graficoCausaMortaliadad'), themeGraficos);
            echartPie.setOption({
                title: {
                    text: 'Mortalidad: ' + suma,
                    x: 'left'
                },
                tooltip: {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} ({d}%)"
                },
                legend: {
                    textStyle: {
                        color: '#003366',
                        fontSize: 15,
                        fontWeight: 'bold'
                    },
                    orient: 'vertical',
                    //top: 'middle',
                    //bottom: -50,
                    left: 'left', //'position',
                    type: 'scroll',
                    right: 10,
                    top: 20,
                    bottom: 20,
                    data: dataYIngreso
                },
                toolbox: {
                    show: true,
                    feature: {
                        magicType: {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'left',
                                    max: 1548
                                }
                            }
                        },
                        restore: {
                            show: true,
                            title: "Restore"
                        },
                        saveAsImage: {
                            show: true,
                            title: "Save Image"
                        }
                    }
                },
                calculable: true,
                series: [{
                        name: 'Estubaciones',
                        type: 'pie',
                        radius: '60%',
                        center: ['60%', '60%'],
                        data: data.serieGraficoClasificacion
                    }],
                itemStyle: {
                    emphasis: {
                        shadowBlur: 10,
                        shadowOffsetX: 0,
                        shadowColor: 'rgba(0, 0, 0, 0.5)'
                    }
                }
            });
            var dataStyle = {
                normal: {
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    }
                }
            };
            var placeHolderStyle = {
                normal: {
                    color: 'rgba(0,0,0,0)',
                    label: {
                        show: false
                    },
                    labelLine: {
                        show: false
                    }
                },
                emphasis: {
                    color: 'rgba(0,0,0,0)'
                }
            };
        }
    });
}

initDatePicker();
graficarEstancias();
actualizarCountPacientes();
actualizarCountEstancias();
actualizarPacientesVentilados();
actualizarGraficoEstancias();
actualizarGraficoMortalidad();
actualizarGraficoClasificaciones();
actualizarExtubacionFallida();
actualizarCausaMortalidad();
