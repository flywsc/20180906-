package com.wsc2018091007;



public class player {
	 int levelNo;// 玩家当前级别号
	 int curScore;// 积分
	 long startTime;// 开始时间
	 int elaspsedTime;// 已用时间

	  
	
	public player(int levelNo, int curScore) {
		super();
		this.levelNo = levelNo;
		this.curScore = curScore;
	}

	public int getLevelNo() {
		return levelNo;
	}

	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}

	public int getCurScore() {
		return curScore;
	}

	public void setCurScore(int curScore) {
		this.curScore = curScore;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public int getElaspsedTime() {
		return elaspsedTime;
	}

	public void setElaspsedTime(int elaspsedTime) {
		this.elaspsedTime = elaspsedTime;
	}

	public void play() {

	}

	
    //这里是判断玩家积分
	boolean ispass() {
		int time = curScore/lenvelhelper.lenvels[levelNo - 1].getPerScore();

		return time>= lenvelhelper.lenvels[levelNo - 1].getStrTimes();
	}
}
