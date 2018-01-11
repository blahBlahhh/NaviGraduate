package consulate;

public class Canada extends Consulate
{
	public int nationCode = 1;
	public int cityCode;
	
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
			return "�����ڵĵ������������¹ݷ���\n" + "�л����񹲺͹�פ���ô����¹�: \n" + 
			"��ַ: 515 St. Patrick Street, Ottawa, ON K1N 5H3 \n" + 
			" �绰: 613-7893434 \n " + 
			" �칫ʱ��: ���²�9:00-12:00, ��һ������; �������� 9:00-12:00 & 14:00-17:30, ��һ������; ";
		case 1:
			return "�����ڵĵ������������¹ݷ���\n" + "�л����񹲺͹�פ���׶������¹�: \n" + 
			"��ַ�� 240 St George st Toronto ON M5R 2N5 \n" + " �绰: 416-964-7260 \n" + 
			"��ݰ칫ʱ��: 9:00-12:00; 13:30-17:00 \n" + 
			"֤�������칫ʱ��: 9:00-12:00 Ϊ�����ա�����֤����֤����֤�����Ͻ��ʸ���˱��ҵ�� 14:00-16:00 ֻ����ȡ�� \n" + 
			"��������ȫ�����±�������: 12308";            
		case 2:
			return "�����ڵĵ������������¹ݷ���\n" + "�л����񹲺͹�פ�¸绪���¹�: \n" + 
			"��ַ: 999 West Broadway, Vancouver, BC, Canada. \n" + 
			" ��ѯ�绰: ��778��383-2637 ����һ������15:00-17:00�� \n" + 
			"֤�������ʱ��: ��һ������ 9:00AM-12:00PM \n";            
		case 3:
			return "�����ڵĵ������������¹ݷ���\n" + " �л����񹲺͹�פ�������������¹�: \n" + 
			" ��ַ: 1011 6th Ave.S.W. Calgary, Alberta, Canada T2P 0W1 \n" + "��ѯ�绰: 403-537-6905 \n" + 
			"ǩ֤�������ĵ�ַ: Suite 200 Century Park Place, 855-8th Ave, SW, Calgary, Alberta, T2P 3P1 \n" + 
			" ǩ֤�������ĵ绰: 403-930-2288 \n" + "֤�������ʱ��:��һ������ 9:00AM-12:00PM ";
		case 4:
			return " �����ڵĵ������������¹ݷ���\n" + " �л����񹲺͹�פ�������������¹�: \n" + 
			" ��ַ: 2100 Ste-Catherine West, 8th floor, Montreal, Quebec H3H 2T3 Canada \n" + 
			"��ϵ�绰: 001-514-4196748 \n" + "�칫ʱ��: 9:00AM-12:00PM��13:30PM-17:00PM \n" + 
			"֤�������칫ʱ��: 9:00AM-12:00PM";
            
		default:
			return null;
		}
	}

}
