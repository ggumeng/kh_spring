package templateMethod.client;

import templateMethod.framework.dao.AbstractMemberDao;

public class Run {

	public static void main(String[] args) {
		
		String userId = "DEV";
		String password = new MemberDao().selectPassword(userId);
		System.out.println("DEV 사용자의 비밀번호는 " + password +"입니다.");

	}

}
