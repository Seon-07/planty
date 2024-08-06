$(document).ready(function() {
	$("#btn_login").click(function() {
        $.ajax({
            type: "POST",
            url: "/login",
            data: {
                id: $("#id").val(),
                pw: $("#pw").val()
            },
            success: function(response) {
                alert('로그인 성공');
            },
            error: function(xhr, status, error) {
                alert('로그인 실패: ' + error);
            }
        });
	});
});