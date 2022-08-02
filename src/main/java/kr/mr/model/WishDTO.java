package kr.mr.model;

public class WishDTO {
	
	private int wID;
	private String id; // 멤버
	private int cNum; // 차량
	

	public WishDTO() {}


	public WishDTO(int wID, String id, int cNum) {
		super();
		this.wID = wID;
		this.id = id;
		this.cNum = cNum;
	}


	public int getwID() {
		return wID;
	}


	public void setwID(int wID) {
		this.wID = wID;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public int getcNum() {
		return cNum;
	}


	public void setcNum(int cNum) {
		this.cNum = cNum;
	}

	
	
	
	
}
