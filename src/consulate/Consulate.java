package consulate;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class Consulate
{
	public abstract String getInformation();
	
	public String readJSON(String file, String consulate)
	{
		String res = "";
		try
		{
			InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			try
			{
				JSONObject dataJson = new JSONObject(s);
				JSONObject info = dataJson.getJSONObject(consulate);
				String boss = info.getString("boss");
				String addr = info.getString("addr");
				String web = info.getString("web");
				String tel = info.getString("tel");
				String email = info.getString("email");
				res = consulate + "\n总领事:" + boss + "\n地址:" + addr + "\n网址:" + web + "\n电话:" + tel + "\n邮箱:" + email;
			}
			catch(JSONException e)
			{
				e.printStackTrace();
			}
			br.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return res;
	}
}
