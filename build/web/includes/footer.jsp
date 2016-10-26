<%@ page import="java.util.GregorianCalendar, java.util.Calendar" %>
<%  
    GregorianCalendar currentDate = new GregorianCalendar();
    int currentYear = currentDate.get(Calendar.YEAR);
%>

<p>&copy; Copyright<span>${year.currentYear}</span> Mike Murach &amp; Associates </p>



</body>
</html>