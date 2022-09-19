package in.ashokit.bean;

import java.util.Base64;
import java.util.Base64.Decoder;

public class PwdDecoder {
	public static String decode(String encodedValue)
	{
		Decoder decoder=Base64.getDecoder();
		byte[] decode=decoder.decode(encodedValue);
		return new String(decode);
	}


}
