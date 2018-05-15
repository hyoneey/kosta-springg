package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyDAO {
	
	public List<ReplyVO> list(Integer bno) throws Exception; //댓글리스트
	
	public void create(ReplyVO vo) throws Exception; //특정 게시물 댓글 등록
	
	public void update(ReplyVO vo) throws Exception;//특정 게시물  댓글 수정
	
	public void delete(Integer rno) throws Exception;//특정 게시물 댓글 삭제

	public List<ReplyVO> listPage(Integer bno, Criteria cri) throws Exception; //댓글 페이징 처리- bno을 통해 특정게시물의 댓글 목록조회
	
	public int count(Integer bno) throws Exception; //해당 게시물의 댓글 수
}