package consulate;

public class Canada extends Consulate
{
	private String file = "src/consulate/CanadaInfo.json";
	
	public int nationCode = 1;
	public int cityCode;
	public String[] consulateName = {"פ���׶������¹ݣ����ô�", "פ�������������¹ݣ����ô�", 
									"פ�������������¹ݣ����ô�", "פ�¸绪�����¹ݣ����ô�"};
	
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
