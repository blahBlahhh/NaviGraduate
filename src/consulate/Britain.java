package consulate;

public class Britain extends Consulate
{
	public int nationCode = 2;
	public int cityCode;
	
	public Britain(int code)
	{
		this.cityCode = code;
	}

	@Override
	public String getInformation()
	{
		switch(this.cityCode)
		{
		case 1:
			return "�����ڵĵ��������������¹ݹ�Ͻ��\n"+"�л����񹲺͹�פ�����������¹�\n"+"��ַ��55 Corstorphine Road��Edinburgh��EH12 5QG\n" +
					"�绰��0131-3373220���绰�����޹���ʱ�䣩��07766667116���ֻ������޽������±�����������֤����ѯ�绰����0131-3378871�����棩\n" +
					"����ʱ�䣺���°칫�����ڶ�������������9��00--12��00������14��00--16��00����칫��";
		case 2:
			return "�����ڵĵ��������������¹ݹ�Ͻ��\n"+"�л����񹲺͹�פ����˹�������¹�\n"+"��ַ: ��ַ��Denison House, 71 Denison Road, Rusholme, Manchester M14 5RX, United Kingdom\n" +
					"�绰��0044-16�����й����ڲ���010-12308\n" +
					"����Ӣ�����ڲ���0086-10-12308����0044-7828-5292011-2247443��Ӣ������ʱ��9��00-17��00��\n" +
					"���� lingshixiezhu_man@163.com";
		case 3:
			return "�����ڵĵ��������������¹ݹ�Ͻ��\n"+"�л����񹲺͹�פ������˹�������¹� \n"+"�������ʱ�칫�绰�����棺028-90682499\n"+"�������䣺chinaconsul_bft_uk@mfa.gov.cn\n"+
					"���±������ߣ�07895 306461\n"+
					"��������������䣺chinacnbft@gmail.com\n";
		default:
			return null;
		}
	}

}
