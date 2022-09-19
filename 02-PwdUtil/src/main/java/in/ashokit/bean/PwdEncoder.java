package in.ashokit.bean;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PwdEncoder {
	
	public static String encode(String pwd)
	{
		Encoder encoder=Base64.getEncoder();
		String encodedString=encoder.encodeToString(pwd.getBytes());
		return encodedString;
	}


}
