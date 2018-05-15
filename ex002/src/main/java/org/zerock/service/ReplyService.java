package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyService {
	
	public void addReply(ReplyVO vo) throws Exception; //댓글 입력
	
	public List<ReplyVO> listReply(Integer bno) throws Exception; //조회
	
	public void modifyReply(ReplyVO vo) throws Exception;  //수정
	
	public void removeReply(Integer rno) throws Exception; //삭제
	
	public List<ReplyVO> listReplyPage(Integer bno, Criteria cri) throws Exception; //댓글 페이징처리
	
	public int count(Integer bno) throws Exception; //댓글 페이징 갯수
}
