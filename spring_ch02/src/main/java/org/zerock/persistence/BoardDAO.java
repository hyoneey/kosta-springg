package org.zerock.persistence;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardDAO {
	
	public void create(BoardVO vo)throws Exception; //입력
	
	public BoardVO read(Integer bno) throws Exception; //조회
	
	public void update(BoardVO vo)throws Exception; //수정
	
	public void delete(Integer bno)throws Exception; //삭제
	
	public List<BoardVO> listAll() throws Exception; //리스트 목록
	
	public List<BoardVO> listPage(int page) throws Exception; //페이징 처리
	
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	
	public int countPaging(Criteria cri) throws Exception; //전체 페이지를 카운트해주는 함수

}
