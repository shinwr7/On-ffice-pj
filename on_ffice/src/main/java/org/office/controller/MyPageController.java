/*
*	작성자 : 고광훈
*	진행상황 : src/main/java 패키지 생성, office페이지 컨트롤러, Mapper, Service, VO 생성 
*	변수정리 : 
*	테스트 성공 유무 :  
*	오류사항 : 
*	etc...
*	
*/
package org.office.controller;

import org.office.service.MyPageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller //컴포넌트스캔
@Log4j
@RequestMapping("/mypage/*") //이 클래스를 사용하는 메서드이 들어오는 주소 앞 /mypage로 명명
@AllArgsConstructor // 의존성 주입
public class MyPageController {
	
	@Autowired
	private MyPageService service;
	
	

}