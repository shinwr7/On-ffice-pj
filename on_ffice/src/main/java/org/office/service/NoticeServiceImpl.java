package org.office.service;

import java.util.List;

import org.office.domain.NoticeVO;
import org.office.mapper.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticemapper;

	@Override
	public List<NoticeVO> list() {
		List<NoticeVO> NoticeList = noticemapper.noticeList();
		log.info("service noticelist" + NoticeList);
		log.info("전체 글 목록 조회");
		return NoticeList;
	}

	@Override
	public void write(NoticeVO vo) {

		log.info("글작성 실행");
		log.info("처음 글 쓰는거임");
		log.info("관리자에게 문의하세요");

		noticemapper.writeSelectkey(vo);

	}

	@Override
	public void delete(int notice_num) {
		log.info(notice_num + "번째 글 삭제 요청");
		log.info("글 삭제 실행");
		noticemapper.delete(notice_num);

	}

	@Override
	public void update(NoticeVO vo) {
		log.info(vo.getNotice_num() + "번째 글 갱신 요청");
		log.info("글 갱신 실행");
		noticemapper.update(vo);
	}

	@Override
	public NoticeVO detail(int notice_num) {
		log.info(notice_num + "번째 글 상세보기 요청");
		log.info("글 상세보기 실행");
		NoticeVO vo = noticemapper.notice_detail(notice_num);
		int hits = vo.getNhits();

		return vo;

	}

	@Override
	public void nhit_up(int notice_num) {
		log.info("글 조회수 증가");
		noticemapper.nhit_up(notice_num);

	}

	
	@Override
	public List<NoticeVO> category(String ncategory) {
		log.info(ncategory + "만 보기");
		List<NoticeVO> list = noticemapper.noticeList();
		List<NoticeVO> nc = noticemapper.category(list, ncategory);
		return nc;
	}


}
