package cn.white.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;

public class NoteUtil {

	/**
	 * UUID:防止用户id重复
	 * 
	 * @return 随机UUID
	 */
	public static String createId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

	/**
	 * 密码加密 明文md5
	 * 
	 * @param src
	 *            密码明文
	 * @return 加密后的密文
	 * @throws NoSuchAlgorithmException
	 */
	public static String md5(String src) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] output = md.digest(src.getBytes());
		String s = Base64.encodeBase64String(output);
		return s;
	}

}
