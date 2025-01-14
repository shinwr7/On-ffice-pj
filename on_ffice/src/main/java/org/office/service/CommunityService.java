package org.office.service;
/*
*	작성자 : 배용우
*	진행상황 :  
*	변수정리 : 
*	테스트 성공 유무 :  테스트코딩을 작성했을 경우 성공유무 판단
*	오류사항 : 어떤 문제때문에 해결을 못하고 있다 기술
*	etc...
*	
*/

import java.util.List;

import org.office.domain.CommunityVO;

public interface CommunityService {
	
	//글 조회 서비스
	public List<CommunityVO> list();
	
	//글 상세보기 서비스
	public CommunityVO detail(int community_num);
	
	// 글 작성 서비스
	public void write(CommunityVO vo);
	
	// 글 삭제 서비스
	public void delete(int community_num);
	
	// 글 갱신 서비스
	public void update(CommunityVO vo);
	
	// 글 조회수 증가 서비스
	public void chit_up(int community_num);


}
