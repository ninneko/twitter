$(function(){
    $.getJSON(
        "json/1",
        function(data){
            $(data).each(
                function(){
                    $('#contents')
                    .append($('<tr></tr>').append("<td>"+this.memberAccount +"</td>").append("<td>"+this.memberName +"</td>"));
                })
        });
    $('#read-more').click(
        function(){
            $.getJSON(
                "json/2",
                function(data){
                    $(data).each(
                        function(){
                           $('#contents')
                           .append($('<tr></tr>').append("<td>"+this.memberAccount +"</td>").append("<td>"+this.memberName +"</td>"));
                       })
                })
        })
/*
    $(".pagingnavi a").click(function(){
    	$.getJSON(
         $(this).attr("href"),
         function(data){
            $("#contents").empty();
            $(data).each(
             function() {
                 $('#contents').append(
                  $('<tr></tr>').append("<td>"+this.memberAccount +"</td>").append("<td>"+this.memberName +"</td>"));
             })
        })
        return false;
    })
*/
})