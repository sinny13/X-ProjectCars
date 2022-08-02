package kr.mr.model;

public class ReserveDTO {

	private int revNum;
	private int revNames;
	private int revJumin1;
	private int revJumin2;
	private int revTel;
	private int revAddr;
	private int count;
	private int revDate1;
	private int revDate2;
	
	
	public ReserveDTO() {}


	public ReserveDTO(int revNum, int revNames, int revJumin1, int revJumin2, int revTel, int revAddr, int count,
			int revDate1, int revDate2) {
		super();
		this.revNum = revNum;
		this.revNames = revNames;
		this.revJumin1 = revJumin1;
		this.revJumin2 = revJumin2;
		this.revTel = revTel;
		this.revAddr = revAddr;
		this.count = count;
		this.revDate1 = revDate1;
		this.revDate2 = revDate2;
	}


	public int getRevNum() {
		return revNum;
	}


	public void setRevNum(int revNum) {
		this.revNum = revNum;
	}


	public int getRevNames() {
		return revNames;
	}


	public void setRevNames(int revNames) {
		this.revNames = revNames;
	}


	public int getRevJumin1() {
		return revJumin1;
	}


	public void setRevJumin1(int revJumin1) {
		this.revJumin1 = revJumin1;
	}


	public int getRevJumin2() {
		return revJumin2;
	}


	public void setRevJumin2(int revJumin2) {
		this.revJumin2 = revJumin2;
	}


	public int getRevTel() {
		return revTel;
	}


	public void setRevTel(int revTel) {
		this.revTel = revTel;
	}


	public int getRevAddr() {
		return revAddr;
	}


	public void setRevAddr(int revAddr) {
		this.revAddr = revAddr;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getRevDate1() {
		return revDate1;
	}


	public void setRevDate1(int revDate1) {
		this.revDate1 = revDate1;
	}


	public int getRevDate2() {
		return revDate2;
	}


	public void setRevDate2(int revDate2) {
		this.revDate2 = revDate2;
	}


	@Override
	public String toString() {
		return "ReserveDTO [revNum=" + revNum + ", revNames=" + revNames + ", revJumin1=" + revJumin1 + ", revJumin2="
				+ revJumin2 + ", revTel=" + revTel + ", revAddr=" + revAddr + ", count=" + count + ", revDate1="
				+ revDate1 + ", revDate2=" + revDate2 + "]";
	};
	
	
	
	
	
	
	
}
