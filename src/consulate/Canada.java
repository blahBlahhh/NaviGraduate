package consulate;

public class Canada extends Consulate
{
	private String file = "src/consulate/CanadaInfo.json";
	
	public int nationCode = 1;
	public int cityCode;
	public String[] consulateName = {"驻多伦多总领事馆（加拿大）", "驻卡尔加里总领事馆（加拿大）", 
									"驻蒙特利尔总领事馆（加拿大）", "驻温哥华总领事馆（加拿大）"};
	
	public Canada(int code)
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
		default:
			return null;
		}
	}

}
