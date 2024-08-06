<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<!-- Header -->
    <jsp:include page="header.jsp" />

    <div class="container-fluid">
        <div class="row">
            <!-- Sidebar -->
            <div class="col-md-2">
                <jsp:include page="sidebar.jsp" />
            </div>
            <!-- Main Content -->
            <div class="col-md-10">
                <jsp:include page="${body}" />
            </div>
        </div>
    </div>

    <!-- Footer -->
    <jsp:include page="footer.jsp" />	
</body>
</html>