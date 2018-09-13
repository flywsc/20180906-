package com.wsc2018091007;

import java.util.Random;
import java.util.Scanner;

public class game {
	player player;

	public game(player play1) {
		this.player = player;
	}

	game() {
	};

	char factory() {
		int inl = 0;
		Random random = new Random();
		int val = random.nextInt(3) % (3 - 1 + 1) + 1;
		// 数字:48-57
		// 小写字母:97-122
		// 大写字母:65-90
		// random.nextInt(max)%(max-min+1) + min;
		if (val == 1) {
			inl = random.nextInt(57) % (57 - 48 + 1) + 48;
		} else if (val == 2) {
			inl = random.nextInt(122) % (122 - 97 + 1) + 97;
		} else if (val == 3) {
			inl = random.nextInt(90) % (90 - 65 + 1) + 65;
		}
		return (char) inl;
	}

	boolean Juge(String word) {// 这里是判断输入字符串跟随机字符串对比
		return word.equals(currentWord);
	}

	String currentWord = null;
	long currentTimespam = 0;

	void getworld(int wordlen) {
		String str = "";
		for (int i = 0; i <= wordlen; i++) {
			str += factory();
		}
		System.out.println(str);
		currentWord = str;
		currentTimespam = System.currentTimeMillis();
	}

	public void play(player player) {
		Scanner input = new Scanner(System.in);

		while (true) {
			if (!player.ispass()) {
				if (player.getCurScore() == 0) {
					player.startTime = System.currentTimeMillis();
				}
				getworld(lenvelhelper.lenvels[player.getLevelNo() - 1].getStrLength());
				String playerStr = input.next();
				if (Juge(playerStr)) {
					long currentTime = System.currentTimeMillis();
					if ((currentTime - currentTimespam) / 1000 > lenvelhelper.lenvels[player.getLevelNo() - 1]
							.getTimeLimit()) {
						System.out.println("您的输入太慢了");
					} else {
						player.setCurScore(
								player.getCurScore() + lenvelhelper.lenvels[player.getLevelNo() - 1].getPerScore());
						StringBuffer sb = new StringBuffer("你真快");
						sb.append("当前级别" + player.getLevelNo() + "");
						sb.append("当前积分" + player.getCurScore() + "");
						long yiTime = (System.currentTimeMillis() - player.getStartTime()) / 1000;
						sb.append("当前已经用时间" + yiTime);
						System.out.println(sb.toString());
					}
				} else {
                    System.out.println("输入出错，再来一次？");
					break;
				}

			} else {
				if (player.getLevelNo() == 6) {
					System.out.println("恭喜你，全部通关");
					break;
				} else {
					player.levelNo++;
					player.setCurScore(0);
					player.setStartTime(System.currentTimeMillis());
				}
			}
		}
	}

}
