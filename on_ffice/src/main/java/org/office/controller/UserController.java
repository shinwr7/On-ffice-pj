package org.office.controller;

import org.office.domain.UserVO;
import org.office.service.MyPageService;
import org.office.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller //컴포넌트스캔
@Log4j
@RequestMapping("/user/*") //이 클래스를 사용하는 메서드이 들어오는 주소 앞 /user로 명명
@AllArgsConstructor // 의존성 주입

public class UserController {

		
		@Autowired
		private UserService service;
		
		@GetMapping("/login")
		private String Gologin() {
			
			log.info("login.jsp로 이동");
			
			return "/login";
		}
		
		@PostMapping("/login")
		private String login(String uid, String upw, Model model) {
			UserVO vo = service.login(uid);
			log.info("login로직 접속");
			log.info("받아온 uid : " + uid);
			log.info("받아온 upw : " + upw);
			
			if(vo == null) {
				return "/login";
			} else {
				if(!vo.getUid().equals(uid)) {
					return "/login";
				} else if(!vo.getUpw().equals(upw)) {
					return "/login";
				} else {
					return ""; // 로비 창으로 보내기
				}
			}
		}
	}

