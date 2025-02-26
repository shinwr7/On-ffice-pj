/*
*	작성자 : 고광훈
*	진행상황 : src/main/java 패키지 생성, office페이지 컨트롤러, Mapper, Service, VO 생성 
*	변수정리 : 
*	테스트 성공 유무 :  
*	오류사항 : 
*	etc...
*	
*	9/21 getInfo작성
*/
package org.office.service;

import java.util.List;

import org.office.domain.MealVO;
import org.office.domain.TodoVO;
import org.office.domain.UserVO;

public interface MyPageService {

	//서비스 하나당 기능 하나
	public UserVO getInfo(String uid);
	public MealVO getMeal(String dailymeal);
	public List<TodoVO> getTodoList(int empno);
	public void insertTodo(TodoVO vo);
	public void passTodo(TodoVO vo);
	public TodoVO getTodo(int todo_num);
	public void statTodo(TodoVO vo);
}
