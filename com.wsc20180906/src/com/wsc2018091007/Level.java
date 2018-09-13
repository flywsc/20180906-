package com.wsc2018091007;

public class Level {//这是一个级别类
	private  int leveIno;//级别号
	private int strLength;//各级别输出字符串的长度
	private int strTimes;//各级别输出字符串的次数
	private int timeLimit;//各级别的闯关时间限制
	private int perScore;//各级别正确输入一次的得分
	
	
	
	public Level(int leveIno, int strLength, int strTimes, int timeLimit, int perScore) {
		super();
		this.leveIno = leveIno;
		this.strLength = strLength;
		this.strTimes = strTimes;
		this.timeLimit = timeLimit;
		this.perScore = perScore;
	}
	public int getLeveIno() {
		return leveIno;
	}
	public void setLeveIno(int leveIno) {
		this.leveIno = leveIno;
	}
	public int getStrLength() {
		return strLength;
	}
	public void setStrLength(int strLength) {
		this.strLength = strLength;
	}
	public int getStrTimes() {
		return strTimes;
	}
	public void setStrTimes(int strTimes) {
		this.strTimes = strTimes;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public void setTimeLimit(int timeLimit) {
		this.timeLimit = timeLimit;
	}
	public int getPerScore() {
		return perScore;
	}
	public void setPerScore(int perScore) {
		this.perScore = perScore;
	}
	
}
