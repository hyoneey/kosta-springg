/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-05-17 01:23:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class uploadAjax_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \r\n");
      out.write("  \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".fileDrop {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tborder: 1px dotted blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("small {\r\n");
      out.write("\tmargin-left: 3px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: gray;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<h3>Ajax File Upload</h3>\r\n");
      out.write("\t<div class='fileDrop'></div>\r\n");
      out.write("\r\n");
      out.write("\t<div class='uploadedList'></div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 파일을 끌어다 놓아도 아무런 동작을 하지 않도록 하는 함수ㄴ -->\r\n");
      out.write("\t<script src=\"//code.jquery.com/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(\".fileDrop\").on(\"dragenter dragover\", function(event) {\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t/* drop이 발생하면 dataTransfer.files 부분으로, 전달된 파일 데이터를 가져오는 부분 */\r\n");
      out.write("  \t\t$(\".fileDrop\").on(\"drop\", function(event){\r\n");
      out.write("\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar files = event.originalEvent.dataTransfer.files;\t\t\r\n");
      out.write("\t\t\tvar file = files[0];\t\t\t\r\n");
      out.write("\t\t\tvar formData = new FormData();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tformData.append(\"file\", file);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\t  url: '/uploadAjax',\r\n");
      out.write("\t\t\t\t  data: formData,\r\n");
      out.write("\t\t\t\t  dataType:'text',\r\n");
      out.write("\t\t\t\t  processData: false,\r\n");
      out.write("\t\t\t\t  contentType: false,\r\n");
      out.write("\t\t\t\t  type: 'POST',\r\n");
      out.write("\t\t\t\t  success: function(data){\r\n");
      out.write("\t\t\t//\t\t  alert(data);\r\n");
      out.write("\t\t\t\t\t   var str =\"\";\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  if(checkImageType(data)){\r\n");
      out.write("\t\t\t\t\t\t  str =\"<div><a href=displayFile?fileName=\"+getImageLink(data)+\">\"\r\n");
      out.write("\t\t\t\t\t\t\t\t  +\"<img src='displayFile?fileName=\"+data+\"'/>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t  +\"</a><small data-src=\"+data+\">X</small></div>\";\r\n");
      out.write("\t\t\t\t\t  }else{\r\n");
      out.write("\t\t\t\t\t\t  str = \"<div><a href='displayFile?fileName=\"+data+\"'>\" \r\n");
      out.write("\t\t\t\t\t\t\t\t  + getOriginalName(data)+\"</a>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t  +\"<small data-src=\"+data+\">X</small></div></div>\";\r\n");
      out.write("\t\t\t\t\t  }\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t  $(\".uploadedList\").append(str); \r\n");
      out.write("\t\t\t\t  }\r\n");
      out.write("\t\t\t\t});\t\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/*jsp에서 파일 출력하기 */\r\n");
      out.write("\t\t//정규 표현식을 이용하여 확장자가 존재하는지 확인\r\n");
      out.write("\t\tfunction checkImageType(fileName){\r\n");
      out.write("\t\t\tvar pattern = /jpg|gif|png|jpeg/i;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn fileName.match(pattern);\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//파일 링크 처리 - 이름을 간단하게 줄여주는 함수\r\n");
      out.write("\t\t function getOriginalName(fileName){\t\r\n");
      out.write("\t\t\tif(checkImageType(fileName)){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar idx = fileName.indexOf(\"_\") + 1 ;\r\n");
      out.write("\t\t\treturn fileName.substr(idx);\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//파일 링크 처리\r\n");
      out.write("\t\tfunction getImageLink(fileName){\t\t\t\r\n");
      out.write("\t\t\tif(!checkImageType(fileName)){\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar front = fileName.substr(0,12); //년월일 로 경로 추출\r\n");
      out.write("\t\t\tvar end = fileName.substr(14); //앞에 _s 제거\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\treturn front + end;\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t//첨부파일 삭제\t\t\r\n");
      out.write("\t\t$(\".uploadedList\").on(\"click\", \"small\", function(event) {\r\n");
      out.write("\t\t\tvar that = $(this);\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl : \"deleteFile\",\r\n");
      out.write("\t\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\t\tdata : {\r\n");
      out.write("\t\t\t\t\tfileName : $(this).attr(\"data-src\")\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : \"text\",\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\tif (result == 'deleted') {\r\n");
      out.write("\t\t\t\t\t\tthat.parent(\"div\").remove();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
