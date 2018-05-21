package edu.zut.cs.software.hero.push.domain;

public class pushtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Push push=new Push();
		push.setMessage("今日XXX活动，本店开展XXX活动，菜品一律XX折，并赠送XXX！！");
		push.showMessage();
		push.setLucky();
		push.setFood(null);
	}
}
