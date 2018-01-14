package consulate;

public class America extends Consulate
{
	private String file = "src/consulate/AmericaInfo.json";
	
	public int nationCode = 0;
	public int cityCode;
	public String[] consulateName = {"驻旧金山总领事馆（美国）", "驻洛杉矶总领事馆（美国）", 
									"驻纽约总领事馆（美国）", "驻休斯敦总领事馆（美国）", "驻芝加哥总领事馆（美国）"};
	
	public America(int code)
	{
		this.cityCode = code;
	}

	@Override
	public String getInformation()
	{
		switch(this.cityCode)
		{
		case 0:
			return readJSON(this.file, this.consulateName[0]);
		case 1:
			return readJSON(this.file, this.consulateName[1]);
		case 2:
			return readJSON(this.file, this.consulateName[2]);
		case 3:
			return readJSON(this.file, this.consulateName[3]);
		case 4:
			return readJSON(this.file, this.consulateName[4]);
		default:
			return null;
		}
	}

}
