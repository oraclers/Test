package com.test;

import java.util.UUID;

/*
 * 
 * user表插入数据的脚本，userName，id需要参数化
 * user_expand表参数化user,id
 * 
 */
public class UserTableInsertScript {

	public static void main(String[] args) {
		for (int i = 2000; i < 2020; i++) {
			String username = "9996887" + Integer.toString(i);
			String id = getUUID();
			String userSqlScr = "INSERT INTO `user` (`username`, `salt`, `hash`, `userMobileNumber`, `creationDate`, `updateDate`, `enabled`, `id`, `tooltip`, `realname`, `eMail`, `gender`, `autoSave`, `headPortrait`, `invitePersonId`) VALUES ('"
					+ username
					+ "', 'YNPdxJAVh0', 'QWgsF/r8OOXf4ocnAwBLFw==', '"
					+ username
					+ "', 1471933805936, 1471933805936, 1, '"
					+ id
					+ "', '{\\\"noviceGuide\\\":0}', NULL, NULL, NULL, 0, NULL, NULL);";
			
			String userExtSqlScr="INSERT INTO `user_expand` (`id`, `userId`, `download_pro_times`, `upload_psd_times`, `total_download_pro_times`, `total_upload_psd_times`, `creationDate`, `invalidDate`, `version`, `subAmount`, `total_upload_sheet_times`, `total_make_sheet_times`) VALUES ('"
					+ id
					+ "', '"
					+ id
					+ "', 1, -1, 3, -1, 1471933805936, 4627607405936, 1, 0, 4, 11);";
			
			System.out.println(userSqlScr);
			System.out.println(userExtSqlScr);
		}
		
		

		
		
	}

	/**
	 * 生成32位编码
	 * 
	 * @return string
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

}
