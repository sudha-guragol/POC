package in.ashokit.beans;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class EncodeDecodeUtils {

	
	//Encoding
	public static String encode(String text)
	{
		Encoder encoder = Base64.getEncoder();
		//converting string to byte array
		String encodedString = encoder.encodeToString(text.getBytes());
		return encodedString;
	}
	
	
	//Decoding
	
	public static String decode(String encodedStr)
	{
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedStr);
		return new String(decode);
	}
	
	public static void main(String[] args) {
		//String encodedStr = EncodeDecodeUtils.encode("abc@123");
		//OR
		String encodedStr = encode("abc@123");
		System.out.println("Encoded String ::" +encodedStr );
		
		
		//calling decode method
		
		//String decodedStr = EncodeDecodeUtils.decode(encodedStr);
		
		//Or
		String decodedStr = decode(encodedStr);
		System.out.println("Decoded String ::" +decodedStr);
	}
}
