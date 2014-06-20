$(function(){
    var page = 1;
    $.getJSON(
        "json/1",
        function(data){
            $(data).each(
                function(){
                    $('#contents')
                    .append($('<tr></tr>').append("<td>"+this.memberAccount +"</td>").append("<td>"+this.memberName +"</td>").append("<td>"+this.password +"</td>"));
                })
        });
    $('#read-more').click(
        function(){
            page = page + 1;
            $.getJSON(
                "json/"+page,
                function(data){
                    $(data).each(
                        function(){
                           $('#contents')
                           .append($('<tr></tr>').append("<td>"+this.memberAccount +"</td>").append("<td>"+this.memberName +"</td>").append("<td>"+this.password +"</td>"));
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