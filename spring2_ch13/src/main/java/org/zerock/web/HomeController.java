package org.zerock.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.ProductVO;

@Controller
public class HomeController {
	
	@RequestMapping("/hi")
	public void doA() {
		System.out.println("hi 컨트롤러 호출	");
	}

	/*@RequestMapping("/hi")
	public @Revoid doA() {
		System.out.println("hi 컨트롤러 호출	");
	}*/
	
	@RequestMapping("/doJSON")
	public @ResponseBody ProductVO doJSON(){
		
		ProductVO vo = new ProductVO("샘플상품", 30000);
		
		return vo;
		
	}
}
