<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script>
        $(function(){
            $.ajax({
                url: "/first-service/ajax",
                data: {"aa":1},
                dataType: 'JSON',
                type: 'POST',
                /*beforeSend : function(xhr){
                    xhr.setRequestHeader(header, token);
                },*/
                success: function(result) {
                    console.log('success');
                    console.log(result);
                },
                error: function(error) {
                    console.log('error');
                    console.log(error);
                }
            });
        });
    </script>
</head>

<body>
    ${test}
</body>
</html>