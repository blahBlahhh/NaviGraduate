package consulate;

public class Britain extends Consulate
{
	private String file = "src/consulate/BritainInfo.json";
	
	public int nationCode = 2;
	public int cityCode;
	public String[] consulateName = {"פ�����������¹ݣ�Ӣ����", "פ������˹�������¹ݣ�Ӣ����", "פ����˹�������¹ݣ�Ӣ����"};
	
	public Britain(int code)
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
		default:
			return null;
		}
	}

}
