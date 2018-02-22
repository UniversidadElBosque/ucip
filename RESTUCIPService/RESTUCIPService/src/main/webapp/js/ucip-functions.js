
function consumirWS(path, func) {
    $.ajax({
        url: path,
        data: {},
        type: "GET",
        beforeSend: function (xhr) {
            xhr.setRequestHeader('Authorization', 'Bearer ' + getToken());
        },
        success: func
    });
}

var optionsDatepicker;

function init_daterangepicker() {
    optionsDatepicker = {
        singleDatePicker: true,
        singleClasses: "picker_1",
        startDate: moment(),
        endDate: moment(),
        minDate: '01/01/2000',
        maxDate: moment(),
        showDropdowns: true,
        //showWeekNumbers: true,
        timePicker: false,
        //timePickerIncrement: 1,
        //timePicker12Hour: true,
        //opens: 'left',
        //buttonClasses: ['btn btn-default'],
        //applyClass: 'btn-small btn-primary',
        //cancelClass: 'btn-small',
        format: 'YYYY-MM-DD',
        separator: ' to ',
        locale: {
            format: 'YYYY-MM-DD',
            //applyLabel: 'Seleccionar',
            //cancelLabel: 'Cerrar',
            //fromLabel: 'Desde',
            //toLabel: 'Hasta',
            //customRangeLabel: 'Rango',
            daysOfWeek: ['Do', 'Lu', 'Ma', 'Mi', 'Ju', 'Vi', 'Sa'],
            monthNames: ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio', 'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'],
            firstDay: 1
        }
    };

    if (typeof ($.fn.daterangepicker) === 'undefined') {
        alert('error');
        return;
    }
    console.log('init_daterangepicker');
    var optionSet1 = optionsDatepicker;
    optionSet1.startDate = moment().startOf('month');
    $('#single_cal1').daterangepicker(optionSet1, function (start, end, label) {
        txtFecha1 = start.format('YYYY-MM-DD');
        console.log(txtFecha1);
        if (txtFecha2 <= txtFecha1) {
            alert("La primera fecha no puede ser mayor, revise las fechas!!");
            return false;
        }
    });
    var optionSet2 = optionsDatepicker;
    optionSet2.startDate = moment();
    $('#single_cal2').daterangepicker(optionSet2, function (start, end, label) {
        txtFecha2 = start.format('YYYY-MM-DD');
        console.log(txtFecha2);
        if (txtFecha2 <= txtFecha1) {
            alert("La primera fecha no puede ser mayor, revise las fechas!!");
            return false;
        }
    });

}
$(document).ready(function () {
    $('.ir-arriba').click(function () {
        $('body, html').animate({
            scrollTop: '0px'
        }, 300);
    });
    $(window).scroll(function () {
        if ($(this).scrollTop() > 0) {
            $('.ir-arriba').slideDown(300);
        } else {
            $('.ir-arriba').slideUp(300);
        }
    });
});

validarLogin();
init_daterangepicker();
