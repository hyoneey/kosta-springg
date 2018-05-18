//해당 파일이 이미지인 경우 체크하는 함수 
function checkImageType(fileName){
	var pattern = /jpg|gif|png|jpeg/i;
	
	return fileName.match(pattern);
}

//파라미터로 서버에서 전송된 파일을 사용
//- 썸네일이미지, 파일의 경로를 걔산, 다운로드, 원본이미지파일 경로 계산
function getFileInfo(fullName){	
	var fileName,imgsrc, getLink;	
	var fileLink;
	
	if(checkImageType(fullName)){
		imgsrc = "/displayFile?fileName="+fullName;
		fileLink = fullName.substr(14);
		
		var front = fullName.substr(0,12); // /2015/07/01/ 
		var end = fullName.substr(14);
		
		getLink = "/displayFile?fileName="+front + end;	
	}else{
		imgsrc ="/resources/dist/img/file.png"; //화면상에 보여주느 썸네일 혹은 파일 이미지의 경로
		fileLink = fullName.substr(12);
		getLink = "/displayFile?fileName="+fullName; //원본파일을 볼 수 있는 경로
	}
	fileName = fileLink.substr(fileLink.indexOf("_")+1); // 경로나 uuid가 제외된 파일의 이름
	
	return  {fileName:fileName, imgsrc:imgsrc, getLink:getLink, fullName:fullName};
	
}

