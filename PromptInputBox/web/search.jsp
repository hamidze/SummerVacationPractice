<%--
  Created by IntelliJ IDEA.
  User: Thpffcj
  Date: 2017/7/11
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <style type="text/css">
          #mydiv{
              position: absolute;
              left: 50%;
              top: 50%;
              margin-left: -200px;
              margin-top: -50px;
          }

          .mouseOver{
              background: #708090;
              color: #FFFAFA;
          }

          .mouseOut{
              background: #FFFAFA;
              color: #000000;
          }
      </style>

      <script type="text/javascript">

          var xmlHttp;
          //获得用户输入内容的关联信息函数
          function getMoreContents() {
              //首先要获得用户的输入
              var content = document.getElementById("keyword");
              if(content.value == ""){
                  clearContent();
                  return;
              }
              //然后要给服务器发送用户输入的对象
              //使用XmlHttp对象
              xmlHttp = createXMLHttp();
              //要给服务器发送数据
              var url = "search?keyword="+escape(content.value);
              //true表示javascript脚本会在send()方法之后继续执行
              xmlHttp.open("GET", url, true);
              //xmlHttp绑定回调方法,会在xmlHttp状态改变的时候调用
              xmlHttp.onreadystatechange = callback;
              xmlHttp.send(null);
          }

          function createXMLHttp() {
              //对于大多数浏览器都适用
              var xmlHttp;
              if(window.XMLHttpRequest){
                  xmlHttp = new XMLHttpRequest();
              }
              //考虑浏览器的兼容性
              if(window.ActiveXObject){
                  xmlHttp = new ActiveXObject("Microsoft.XMLHTTP")
                  if(!xmlHttp){
                      xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
                  }
              }
              return xmlHttp;
          }

          function callback() {
              if(xmlHttp.readyState == 4){
                  if(xmlHttp.status == 200){
                      //获得响应的数据
                      var result = xmlHttp.responseText;
                      //解析
                      var json = eval("("+result+")");
                      //获得数据之后，就可以动态的显示数据
                      setContent(json);
                  }
              }
          }

          function setContent(contents) {
              clearContent();
              setLocation();
              var size = contents.length;
              for(var i=0; i<size; i++){
                  var nextNode = contents[i];
                  var tr = document.createElement("tr");
                  var td = document.createElement("td");
                  td.setAttribute("border","0");
                  td.setAttribute("bgcolor","#FFFAFA");
                  td.onmouseover = function () {
                      this.className = 'mouseOver';
                  };
                  td.onmouseout = function () {
                      this.className = 'mouseOut';
                  };
                  td.onclick = function () {

                  };
                  var text = document.createTextNode(nextNode);
                  td.appendChild(text);
                  tr.appendChild(td);
                  document.getElementById("content_table_body").appendChild(tr)
              }
          }

          function clearContent() {
              var contentTableBody = document.getElementById("content_table_body");
              var size = contentTableBody.childNodes.length;
              for(var i=size-1; i>=0; i--){
                  contentTableBody.removeChild(contentTableBody.childNodes[i]);
              }
              document.getElementById("popDiv").style.border = "none";
          }

          function keywordBlur() {
              clearContent();
          }

          function setLocation() {
              var content = document.getElementById("keyword");
              var width = content.offsetWidth;
              var left = content["offsetLeft"];
              var top = content["offsetTop"]+content.offsetHeight;
              var popDiv = document.getElementById("popDiv");
              popDiv.style.border = "black 1px solid";
              popDiv.style.left = left+"px";
              popDiv.style.top = top+"px";
              popDiv.style.width = width+"px";
              document.getElementById("content_table").style.width = width+"px";
          }
      </script>
  </head>
  <body>
    <div id="mydiv">
        <!--输入框 -->
        <input type="text" size="50" id="keyword" onkeyup="getMoreContents()" onblur="keywordBlur()"
            onfocus="getMoreContents()"/>
        <input type="button" value="百度一下" width="50">

        <div id="popDiv">
            <table id="content_table" bgcolor="#FFFAFA" border="0" cellpadding="0" cellspacing="0">
                <tbody id="content_table_body">

                </tbody>
            </table>
        </div>
    </div>
  </body>
</html>
