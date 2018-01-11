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
			return "您所在的地区由以下领事馆服务\n" + "中华人民共和国驻加拿大领事馆: \n" + 
			"地址: 515 St. Patrick Street, Ottawa, ON K1N 5H3 \n" + 
			" 电话: 613-7893434 \n " + 
			" 办公时间: 领事部9:00-12:00, 周一至周五; 其他部门 9:00-12:00 & 14:00-17:30, 周一至周五; ";
		case 1:
			return "您所在的地区由以下领事馆服务\n" + "中华人民共和国驻多伦多总领事馆: \n" + 
			"地址： 240 St George st Toronto ON M5R 2N5 \n" + " 电话: 416-964-7260 \n" + 
			"领馆办公时间: 9:00-12:00; 13:30-17:00 \n" + 
			"证件组对外办公时间: 9:00-12:00 为办理护照、旅行证、公证、认证、养老金资格审核表等业务； 14:00-16:00 只办理取件 \n" + 
			"呼叫中心全球领事保护热线: 12308";            
		case 2:
			return "您所在的地区由以下领事馆服务\n" + "中华人民共和国驻温哥华领事馆: \n" + 
			"地址: 999 West Broadway, Vancouver, BC, Canada. \n" + 
			" 咨询电话: （778）383-2637 （周一至周五15:00-17:00） \n" + 
			"证件组服务时间: 周一至周五 9:00AM-12:00PM \n";            
		case 3:
			return "您所在的地区由以下领事馆服务\n" + " 中华人民共和国驻卡尔加里总领事馆: \n" + 
			" 地址: 1011 6th Ave.S.W. Calgary, Alberta, Canada T2P 0W1 \n" + "咨询电话: 403-537-6905 \n" + 
			"签证服务中心地址: Suite 200 Century Park Place, 855-8th Ave, SW, Calgary, Alberta, T2P 3P1 \n" + 
			" 签证服务中心电话: 403-930-2288 \n" + "证件组服务时间:周一至周五 9:00AM-12:00PM ";
		case 4:
			return " 您所在的地区由以下领事馆服务\n" + " 中华人民共和国驻蒙特利尔总领事馆: \n" + 
			" 地址: 2100 Ste-Catherine West, 8th floor, Montreal, Quebec H3H 2T3 Canada \n" + 
			"联系电话: 001-514-4196748 \n" + "办公时间: 9:00AM-12:00PM、13:30PM-17:00PM \n" + 
			"证件组对外办公时间: 9:00AM-12:00PM";
            
		default:
			return null;
		}
	}

}
