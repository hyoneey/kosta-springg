<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	#modDiv {
		width: 300px;
		height: 100px;
		background-color: gray;
		position: absolute;
		top: 50%;
		left: 50%;
		margin-top: -50px;
		margin-left: -150px;
		padding: 10px;
		z-index: 1000;
	}
	
	.pagination {
		width: 100%;
	}
	
	.pagination li {
		list-style: none;
		float: left;
		padding: 3px;
		border: 1px solid blue;
		margin: 3px;
	}
	
	.pagination li a {
		margin: 3px;
		text-decoration: none;
	}
</style>
</head>
<body>
	<h2>Ajax Test Page</h2>
	
	<!-- 댓글 수정하는 부분 style="display: none;"는 평상시에는 보이지않고 버튼을 클릭시만 보이게한다. -->
	<div id='modDiv' style="display: none;">
		<div class='modal-title'></div>
		<div>
			<input type='text' id='replytext'>
		</div>
		<div>
			<button type="button" id="replyModBtn">Modify</button>
			<button type="button" id="replyDelBtn">DELETE</button>
			<button type="button" id='closeBtn'>Close</button>
		</div>
	</div>
	
	<!-- 댓글 등록하는 부분 -->
	<div>
		<div>
			REPLYER <input type='text' name='replyer' id='newReplyWriter'>
		</div>
		<div>
			REPLY TEXT <input type='text' name='replytext' id='newReplyText'>
		</div>
		<button id="replyAddBtn">ADD REPLY</button>
	</div>

	<!-- 댓글 목록을 처리하는 부분: ajax가 들어갈 곳 -->
	<ul id="replies"></ul>
	
	<!-- 댓글 페이징 처리 -->
	<ul class='pagination'></ul>

	<!-- jquery 2.1.4 -->
	<script src="/resources/plugins/jQuery/jQuery-2.1.4.min.js"></script>

	<!-- js -->
	<script>
		/* 댓글 목록 조회 -json 받기 */
		var bno =161;
	//	getPageList(1);
	
		function getAllList(){
			$.getJSON( "/replies/all/"+ bno, function(data) {
					console.log(data.length);
					var str = "";
	
					$(data).each( 
						function() {
							str += "<li data-rno='"+this.rno+"' class='replyLi'>"
									+ this.rno
									+ ":"
									+ this.replytext
									+ " <button>MOD</button></li>"; /* 댓글 수정하는 버튼 */
					});
	
					$("#replies").html(str);
			});
		}
		
		/* 등록 버튼을 눌렀을 때 처리되는 부분 */
		$("#replyAddBtn").on("click", function() {			
			var replyer = $("#newReplyWriter").val();
			var replytext = $("#newReplyText").val();

			$.ajax({
				type : 'post',
				url : '/replies',
				headers : {
					"Content-Type" : "application/json",
					"X-HTTP-Method-Override" : "POST"
				},
				dataType : 'text',
				data : JSON.stringify({
					bno : bno,
					replyer : replyer,
					replytext : replytext
				}),
				success : function(result) {
					if (result == 'SUCCESS') {
						alert("등록 되었습니다.");
						getAllList(); //등록 후 목록을 다시 갱신하여 추가된 글을 볼 수 있게해야하므로 목록 함수 호출
					}
				}
			});
			
		});
		
		/* 댓글 목록 버튼 처리 */
		$("#replies").on("click", ".replyLi button", function() {
			var reply = $(this).parent();
			var rno = reply.attr("data-rno"); //속성값 추출
			var replytext = reply.text();
			
			/* 댓글번호와 내용이 보이도록 처리 */
			$(".modal-title").html(rno);
			$("#replytext").val(replytext);
			$("#modDiv").show("slow");
			//alert(rno+" : "+replytext);
		});

		/* 댓글 삭제 호출 처리 */
		$("#replyDelBtn").on("click", function() {
			var rno =$(".modal-title").html();
			var replytext = $("#replytext").val();
			
			$.ajax({
				type : 'delete',
				url : '/replies/' + rno,
				headers : {
					"Content-Type" : "application/json",
					"X-HTTP-Method-Override" : "DELETE"
				},
				dataType : 'text',
				success : function(result){
					console.log("result: "+ result);
					if(result == 'SUCCESS'){
						alert("삭제 되었습니다.");
						$("#modDiv").hide("slow");
						getAllList();
					}
				}		
			});	
		});
		
		/* 수정작업 처리하기 */
		$("#replyModBtn").on("click",function(){
			var rno =$(".modal-title").html();
			var replytext = $("#replytext").val();
			
			$.ajax({
				type : 'put',
				url : '/replies/' + rno,
				headers : {
					"Content-Type" : "application/json",
					"X-HTTP-Method-Override" : "PUT"
				},
				data : JSON.stringify({replytext:replytext}),
				dataType : 'text',
				success : function(result){
					console.log("result: "+ result);
					if(result == 'SUCCESS'){
						alert("수정 되었습니다.");
						$("#modDiv").hide("slow");
						//getAllList();
						getPageList(replyPage); //페이지 번호를 입력받아 json을 통해 데이터 처리
					}
				}		
			});	
			 
		});	
		
		/* 댓글 페이지 처리  */
		function getPageList(page){	
	
			$.getJSON("/replies/"+bno+"/"+page , function(data){		  		  
				  var str ="";
	  
				  $(data.list).each(function(){
					  str+= "<li data-rno='"+this.rno+"' class='replyLi'>" 
					  +this.rno+":"+ this.replytext+
					  "<button>MOD</button></li>";
				  });
				  
				  $("#replies").html(str);	  
				  printPaging(data.pageMaker);	  
			  });
	  }		
		
		/* pageMaker을 이용하여 화면에 페이지 번호를 출력 */
		function printPaging(pageMaker){	
			var str = "";
			
			if(pageMaker.prev){
				str += "<li><a href='"+(pageMaker.startPage-1)+"'> << </a></li>";
			}
			
			for(var i=pageMaker.startPage, len = pageMaker.endPage; i <= len; i++){				
					var strClass= pageMaker.cri.page == i?'class=active':'';
				  	str += "<li "+strClass+"><a href='"+i+"'>"+i+"</a></li>";
			}
			
			if(pageMaker.next){
				str += "<li><a href='"+(pageMaker.endPage + 1)+"'> >> </a></li>";
			}
			
			$('.pagination').html(str);				
		}
		
		/* 페이지 번호에 대한 이벤트 처리 */
		var replyPage = 1;	 //수정 삭제 작업에 목록 페이지를 갱신할때 필요하므로 별도의 변수처리
		
		$(".pagination").on("click", "li a", function(event){
			event.preventDefault();	//<a hret="">의 페이지 전환을 막는 역할을 하는 함수
			replyPage = $(this).attr("href");		
			getPageList(replyPage);
		
		});
	</script>

</body>
</html>