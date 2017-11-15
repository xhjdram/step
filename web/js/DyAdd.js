
    function dynamicsAddSelected(position, dict_type_code, dict_id, selectedName) {
        var $select = $("<select name='" + selectedName + "'></select>");
        $select.append("<option value=''>请选择</option>");
        $.post("${pageContext.request.contextPath }/base_dictAction", {dict_type_code: dict_type_code},
            function (data) {
                $.each( data, function(i, n){
                    alert(1);
                    var $option= $("<option value='"+n["dict_id"]+"'>"+n["dict_item_name"]+"</option>");
                    if(n["dict_id"]==dict_id){
                        $option.attr("selected","selected");
                    };
                    $select.append($option);

                });

            },"json");
        $("#" + position).append($select);
    }
