/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.36
 * Generated at: 2018-05-15 05:56:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style>\r\n");
      out.write("\t#modDiv {\r\n");
      out.write("\t\twidth: 300px;\r\n");
      out.write("\t\theight: 100px;\r\n");
      out.write("\t\tbackground-color: gray;\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\ttop: 50%;\r\n");
      out.write("\t\tleft: 50%;\r\n");
      out.write("\t\tmargin-top: -50px;\r\n");
      out.write("\t\tmargin-left: -150px;\r\n");
      out.write("\t\tpadding: 10px;\r\n");
      out.write("\t\tz-index: 1000;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.pagination {\r\n");
      out.write("\t\twidth: 100%;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.pagination li {\r\n");
      out.write("\t\tlist-style: none;\r\n");
      out.write("\t\tfloat: left;\r\n");
      out.write("\t\tpadding: 3px;\r\n");
      out.write("\t\tborder: 1px solid blue;\r\n");
      out.write("\t\tmargin: 3px;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.pagination li a {\r\n");
      out.write("\t\tmargin: 3px;\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h2>Ajax Test Page</h2>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 댓글 수정하는 부분 style=\"display: none;\"는 평상시에는 보이지않고 버튼을 클릭시만 보이게한다. -->\r\n");
      out.write("\t<div id='modDiv' style=\"display: none;\">\r\n");
      out.write("\t\t<div class='modal-title'></div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<input type='text' id='replytext'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"replyModBtn\">Modify</button>\r\n");
      out.write("\t\t\t<button type=\"button\" id=\"replyDelBtn\">DELETE</button>\r\n");
      out.write("\t\t\t<button type=\"button\" id='closeBtn'>Close</button>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 댓글 등록하는 부분 -->\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\tREPLYER <input type='text' name='replyer' id='newReplyWriter'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\tREPLY TEXT <input type='text' name='replytext' id='newReplyText'>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button id=\"replyAddBtn\">ADD REPLY</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 댓글 목록을 처리하는 부분: ajax가 들어갈 곳 -->\r\n");
      out.write("\t<ul id=\"replies\"></ul>\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 댓글 페이징 처리 -->\r\n");
      out.write("\t<ul class='pagination'></ul>\r\n");
      out.write("\r\n");
      out.write("\t<!-- jquery 2.1.4 -->\r\n");
      out.write("\t<script src=\"/resources/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- js -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t/* 댓글 목록 조회 -json 받기 */\r\n");
      out.write("\t\tvar bno =161;\r\n");
      out.write("\t//\tgetPageList(1);\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction getAllList(){\r\n");
      out.write("\t\t\t$.getJSON( \"/replies/all/\"+ bno, function(data) {\r\n");
      out.write("\t\t\t\t\tconsole.log(data.length);\r\n");
      out.write("\t\t\t\t\tvar str = \"\";\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t$(data).each( \r\n");
      out.write("\t\t\t\t\t\tfunction() {\r\n");
      out.write("\t\t\t\t\t\t\tstr += \"<li data-rno='\"+this.rno+\"' class='replyLi'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.rno\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \":\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ this.replytext\r\n");
      out.write("\t\t\t\t\t\t\t\t\t+ \" <button>MOD</button></li>\"; /* 댓글 수정하는 버튼 */\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t$(\"#replies\").html(str);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 등록 버튼을 눌렀을 때 처리되는 부분 */\r\n");
      out.write("\t\t$(\"#replyAddBtn\").on(\"click\", function() {\t\t\t\r\n");
      out.write("\t\t\tvar replyer = $(\"#newReplyWriter\").val();\r\n");
      out.write("\t\t\tvar replytext = $(\"#newReplyText\").val();\r\n");
      out.write("\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'post',\r\n");
      out.write("\t\t\t\turl : '/replies',\r\n");
      out.write("\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\"Content-Type\" : \"application/json\",\r\n");
      out.write("\t\t\t\t\t\"X-HTTP-Method-Override\" : \"POST\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\t\tdata : JSON.stringify({\r\n");
      out.write("\t\t\t\t\tbno : bno,\r\n");
      out.write("\t\t\t\t\treplyer : replyer,\r\n");
      out.write("\t\t\t\t\treplytext : replytext\r\n");
      out.write("\t\t\t\t}),\r\n");
      out.write("\t\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t\t\t\tif (result == 'SUCCESS') {\r\n");
      out.write("\t\t\t\t\t\talert(\"등록 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\tgetAllList(); //등록 후 목록을 다시 갱신하여 추가된 글을 볼 수 있게해야하므로 목록 함수 호출\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 댓글 목록 버튼 처리 */\r\n");
      out.write("\t\t$(\"#replies\").on(\"click\", \".replyLi button\", function() {\r\n");
      out.write("\t\t\tvar reply = $(this).parent();\r\n");
      out.write("\t\t\tvar rno = reply.attr(\"data-rno\"); //속성값 추출\r\n");
      out.write("\t\t\tvar replytext = reply.text();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t/* 댓글번호와 내용이 보이도록 처리 */\r\n");
      out.write("\t\t\t$(\".modal-title\").html(rno);\r\n");
      out.write("\t\t\t$(\"#replytext\").val(replytext);\r\n");
      out.write("\t\t\t$(\"#modDiv\").show(\"slow\");\r\n");
      out.write("\t\t\t//alert(rno+\" : \"+replytext);\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t/* 댓글 삭제 호출 처리 */\r\n");
      out.write("\t\t$(\"#replyDelBtn\").on(\"click\", function() {\r\n");
      out.write("\t\t\tvar rno =$(\".modal-title\").html();\r\n");
      out.write("\t\t\tvar replytext = $(\"#replytext\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'delete',\r\n");
      out.write("\t\t\t\turl : '/replies/' + rno,\r\n");
      out.write("\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\"Content-Type\" : \"application/json\",\r\n");
      out.write("\t\t\t\t\t\"X-HTTP-Method-Override\" : \"DELETE\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"result: \"+ result);\r\n");
      out.write("\t\t\t\t\tif(result == 'SUCCESS'){\r\n");
      out.write("\t\t\t\t\t\talert(\"삭제 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\t\tgetAllList();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\t\t\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 수정작업 처리하기 */\r\n");
      out.write("\t\t$(\"#replyModBtn\").on(\"click\",function(){\r\n");
      out.write("\t\t\tvar rno =$(\".modal-title\").html();\r\n");
      out.write("\t\t\tvar replytext = $(\"#replytext\").val();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\ttype : 'put',\r\n");
      out.write("\t\t\t\turl : '/replies/' + rno,\r\n");
      out.write("\t\t\t\theaders : {\r\n");
      out.write("\t\t\t\t\t\"Content-Type\" : \"application/json\",\r\n");
      out.write("\t\t\t\t\t\"X-HTTP-Method-Override\" : \"PUT\"\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\tdata : JSON.stringify({replytext:replytext}),\r\n");
      out.write("\t\t\t\tdataType : 'text',\r\n");
      out.write("\t\t\t\tsuccess : function(result){\r\n");
      out.write("\t\t\t\t\tconsole.log(\"result: \"+ result);\r\n");
      out.write("\t\t\t\t\tif(result == 'SUCCESS'){\r\n");
      out.write("\t\t\t\t\t\talert(\"수정 되었습니다.\");\r\n");
      out.write("\t\t\t\t\t\t$(\"#modDiv\").hide(\"slow\");\r\n");
      out.write("\t\t\t\t\t\t//getAllList();\r\n");
      out.write("\t\t\t\t\t\tgetPageList(replyPage); //페이지 번호를 입력받아 json을 통해 데이터 처리\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\t\t\r\n");
      out.write("\t\t\t});\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t});\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 댓글 페이지 처리  */\r\n");
      out.write("\t\tfunction getPageList(page){\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t$.getJSON(\"/replies/\"+bno+\"/\"+page , function(data){\t\t  \t\t  \r\n");
      out.write("\t\t\t\t  var str =\"\";\r\n");
      out.write("\t  \r\n");
      out.write("\t\t\t\t  $(data.list).each(function(){\r\n");
      out.write("\t\t\t\t\t  str+= \"<li data-rno='\"+this.rno+\"' class='replyLi'>\" \r\n");
      out.write("\t\t\t\t\t  +this.rno+\":\"+ this.replytext+\r\n");
      out.write("\t\t\t\t\t  \"<button>MOD</button></li>\";\r\n");
      out.write("\t\t\t\t  });\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  $(\"#replies\").html(str);\t  \r\n");
      out.write("\t\t\t\t  printPaging(data.pageMaker);\t  \r\n");
      out.write("\t\t\t  });\r\n");
      out.write("\t  }\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* pageMaker을 이용하여 화면에 페이지 번호를 출력 */\r\n");
      out.write("\t\tfunction printPaging(pageMaker){\t\r\n");
      out.write("\t\t\tvar str = \"\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(pageMaker.prev){\r\n");
      out.write("\t\t\t\tstr += \"<li><a href='\"+(pageMaker.startPage-1)+\"'> << </a></li>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfor(var i=pageMaker.startPage, len = pageMaker.endPage; i <= len; i++){\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar strClass= pageMaker.cri.page == i?'class=active':'';\r\n");
      out.write("\t\t\t\t  \tstr += \"<li \"+strClass+\"><a href='\"+i+\"'>\"+i+\"</a></li>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(pageMaker.next){\r\n");
      out.write("\t\t\t\tstr += \"<li><a href='\"+(pageMaker.endPage + 1)+\"'> >> </a></li>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('.pagination').html(str);\t\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t/* 페이지 번호에 대한 이벤트 처리 */\r\n");
      out.write("\t\tvar replyPage = 1;\t //수정 삭제 작업에 목록 페이지를 갱신할때 필요하므로 별도의 변수처리\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\".pagination\").on(\"click\", \"li a\", function(event){\r\n");
      out.write("\t\t\tevent.preventDefault();\t//<a hret=\"\">의 페이지 전환을 막는 역할을 하는 함수\r\n");
      out.write("\t\t\treplyPage = $(this).attr(\"href\");\t\t\r\n");
      out.write("\t\t\tgetPageList(replyPage);\r\n");
      out.write("\t\t\r\n");
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
