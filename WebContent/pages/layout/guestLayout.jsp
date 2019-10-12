Some common content<br/>
<!-- <%= request.getAttribute("resData") %> -->

<%if("login".equals(request.getAttribute("page"))){ %>
	<jsp:include page='/pages/common/login.jsp' />
<%}else if("other".equals(request.getAttribute("page"))){%>
	<jsp:include page='/pages/common/other.jsp' />
<%}%>