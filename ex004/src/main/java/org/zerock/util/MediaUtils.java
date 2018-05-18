package org.zerock.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;

public class MediaUtils {
	//이미지 타입인지 판단해주는 함수
	//따로 클래스를 생성한 이뉴는 파일을 다운로드 할 것인지, 보여줄 것인지 결정하기 위해서 하는것
	
	private static Map<String, MediaType> mediaMap;
	
	static{
		
		mediaMap = new HashMap<String, MediaType>();		
		mediaMap.put("JPG", MediaType.IMAGE_JPEG);
		mediaMap.put("GIF", MediaType.IMAGE_GIF);
		mediaMap.put("PNG", MediaType.IMAGE_PNG);
	}
	
	public static MediaType getMediaType(String type){
		
		return mediaMap.get(type.toUpperCase());
	}
}



