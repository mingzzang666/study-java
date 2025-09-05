package apiTest;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class MessageTest {
		public static void main(String[] args) {
			String api_key = "NCSYCSLNTDNXTZ4A";
		       String api_secret = "ZVLILOTJNJJAOR9PR4ZEVJVXK2JVJWMF";
		       Message coolsms = new Message(api_key, api_secret);

		       // 4 params(to, from, type, text) are mandatory. must be filled
		       HashMap<String, String> params = new HashMap<String, String>();
		       params.put("to", "01042666827");
		       params.put("from", "01071248936");
		       params.put("type", "SMS");
		       params.put("text", "SMS 발송 테스트 구민경");
		       params.put("app_version", "test app 1.2"); // application name and version

		       try {
		         JSONObject obj = (JSONObject) coolsms.send(params);
		         System.out.println(obj.toString());
		       } catch (CoolsmsException e) {
		         System.out.println(e.getMessage());
		         System.out.println(e.getCode());
		       }
			
			
			
			
			
		}
}
