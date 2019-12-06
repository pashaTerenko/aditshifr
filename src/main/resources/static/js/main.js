$(document).ready(function(){
    assignButtons()


});

function assignButtons() {
    $("#submitButtone").click(function (e) {

        if (($("#input").val() != "")&&($("#inputb").val() != "") ) {
            var slug=$("#input").val();
            var b=$("#inputb").val();


            $.getJSON('/encrypt?plain='+slug+'&b='+b, function(data) {
                $("#c1").text(data.mes);
            });


        }
    });

    $("#submitButtond").click(function (e) {

        if (($("#input").val() != "")&&($("#inputb").val() != "") ) {
            var slug=$("#input").val();
            var b=$("#inputb").val();



            $.getJSON('/decrypt?plain='+slug+'&b='+b, function(data) {
                $("#c1").text(data.mes);
            });


        }
    });
}
