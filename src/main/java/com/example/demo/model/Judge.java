package com.example.demo.model;

public class Judge{
	/* 法官编号 */
	private String judgeId;
	/* 法官姓名 */
	private String judgeName;
	/* 庭室 */
	private String dept;
	/* 旧存案件数 */
	private Integer jc = 0;
	/* 已结案案件数 */
	private Integer yja = 0;
	/* 办理中案件数 */
	private Integer blz = 0;
	
	public String getJudgeId() {
		return judgeId;
	}
	public void setJudgeId(String judgeId) {
		this.judgeId = judgeId;
	}
	public String getJudgeName() {
		return judgeName;
	}
	public void setJudgeName(String judgeName) {
		this.judgeName = judgeName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Integer getJc() {
		return jc;
	}
	public void setJc(Integer jc) {
		this.jc = jc;
	}
	public Integer getYja() {
		return yja;
	}
	public void setYja(Integer yja) {
		this.yja = yja;
	}
	public Integer getBlz() {
		return blz;
	}
	public void setBlz(Integer blz) {
		this.blz = blz;
	}
	
}
