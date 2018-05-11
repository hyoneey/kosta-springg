package org.zerock.domain;

public class Criteria { //페이징 처리를 위한 클래스

	private int page;
	private int perPageNum;
	
	public Criteria(){
		this.page = 1;
		this.perPageNum = 5;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		
		if(page <= 0){
			this.page = 1;
			return;
		}
		
		this.page = page;
	}

	public int getPerPageNum() {
		return perPageNum;
	}

	public void setPerPageNum(int perPageNum) {
		
		if(perPageNum <= 0 || perPageNum > 100){
			this.perPageNum = 5;
			return;
		}
		this.perPageNum = perPageNum;
	}
	
	//sql mapper를 위한 메소드
	public int getPageStart(){
		return (this.page-1) * perPageNum;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + "]";
	}
	
	
}
