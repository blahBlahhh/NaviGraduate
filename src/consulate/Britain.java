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
			return "您所在的地区属于以下领事馆管辖：\n"+"中华人民共和国驻爱丁堡总领事馆\n"+"地址：55 Corstorphine Road，Edinburgh，EH12 5QG\n" +
					"电话：0131-3373220（电话，仅限工作时间），07766667116（手机，仅限紧急领事保护求助，非证件咨询电话），0131-3378871（传真）\n" +
					"工作时间：领事办公室星期二和星期四上午9：00--12：00，下午14：00--16：00对外办公。";
		case 2:
			return "您所在的地区属于以下领事馆管辖：\n"+"中华人民共和国驻曼彻斯特总领事馆\n"+"地址: 地址：Denison House, 71 Denison Road, Rusholme, Manchester M14 5RX, United Kingdom\n" +
					"电话：0044-16（在中国境内拨打）010-12308\n" +
					"（在英国境内拨打）0086-10-12308或者0044-7828-5292011-2247443（英国当地时间9：00-17：00）\n" +
					"邮箱 lingshixiezhu_man@163.com";
		case 3:
			return "您所在的地区属于以下领事馆管辖：\n"+"中华人民共和国驻贝尔法斯特总领事馆 \n"+"总领馆临时办公电话及传真：028-90682499\n"+"电子邮箱：chinaconsul_bft_uk@mfa.gov.cn\n"+
					"领事保护热线：07895 306461\n"+
					"领侨事务电子邮箱：chinacnbft@gmail.com\n";
		default:
			return null;
		}
	}

}
