package consulate;

public class America extends Consulate
{
	public int nationCode = 0;
	public int cityCode;
	
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
			return "您所在的地区由以下领事馆服务\n"+"中华人民共和国驻纽约总领事馆：\n"+
	        "地址: 纽约市曼哈顿12马路520号，42与43街之间，邮编：10036\n" +
	        "	电话：212-2449392 / 212-2449456\n" +
	        "	办公时间: 周一至周五 上午9:00-12:00, 下午1:30-5:00（节假日除外）\n" +
	        "        护照/签证/公证/认证事务办公时间为: 周一至周五 上午9：00-下午2：30（节假日除外）\n";
		case 1:
			return "您所在的地区由以下领事馆服务\n"
	        +"中华人民共和国驻旧金山总领事馆：\n"+"地址：1450 Laguna Street,San Francisco, CA 94115（If you go high way 101, exit at Fell Street. You can also get there by bus #38, stop at Laguna.）\n" +
	        "	电话：415-852-5900/415-872-9091（证件类资询）/415-852-5924（工作时间）/415-216-8525（非工作时间）\n" +
	        "	办公时间：\n" +
	        "	签证部门：每星期一至星期五，上午9:00至下午2:30（中午不休息）。\n" +
	        "	其他部门：每星期一至星期五，上午9:00至中午12:00，下午1:30至5:00。";
		case 2:
			return "您所在的地区由以下领事馆服务\n"+"中华人民共和国驻芝加哥总领事馆：\n"+"总领馆\n" +
			"地址：100 West Erie Street\n" +
			"          Chicago, IL 60654 USA \n" +
			"电话：312-803-0095\n" +
			"传真：312-803-0110\n" +
			"电子邮箱: chineseconsulgeneral.chicago@gmail.com;\n" +
			"（有关签证、护照、公证、认证等业务咨询，请发签证组咨询邮箱chinavisachicago@gmail.com）\n" +
			"￼\n" +
			"\n" +
			"签证组（办理签证、护照、公证、认证业务）\n" +
			"地址：1 East Erie Street,Suite 500\n" +
			"           Chicago, IL 60611 USA\n" +
			"电话：312-453-0210转3000 （接听时间：周一至周五上午9:30—12:00；下午1:30—2:30）\n" +
			"传真：312-453-0211\n" +
			"电子邮箱: chinavisachicago@gmail.com";
		case 3:
			return "您所在的地区由以下领事馆服务\n"+"中华人民共和国驻休斯顿总领事馆：\n"+"地址：3417 Montrose Blvd., Houston, TX 77006\n" +
			"办公时间：周一至周五（上午9：00—12：00，下午1：30—5：00）\n" +
			"签证大厅：周一至周五（上午9：00—11：30，下午1：30—3：00）\n" +
			"*总 机 713-520-1462 ；\n" +
			"*办公值班电话  713-521-9996（24小时）；\n" +
			"*侨务领事保护 713-521-9215  (办公时间），713-302-8655（24小时）；\n" +
			"** 证件业务咨询\n" +
			"Email：OfficialVisaHouston@gmail.com\n" +
			"咨询电话：832-240-3780（办公时间）\n" +
			"（为保证咨询质量，请先点击访问我馆“证件服务”栏目了解基本办证须知，如有疑问再致电）\n" +
			" 传真：713-521-0237\n" +
			"￼";
		case 4:
			return "您所在的地区由以下领事馆服务\n"+"中华人民共和国驻洛杉矶总领事馆：\n"+"总领馆：\n" +
			"办公地址：443 Shatto Place, Los Angeles, CA 90020\n" +
			"联系电话：(213) 807-8088　\n" +
			"办公时间：上午9:00—12:00，下午2:00—5:00\n" +
			"\n" +
			"证件组：\n" +
			"办公地址：3rd Floor, 500 Shatto Place, Los Angeles, CA 90020　　\n" +
			"对外办公时间：周一至周五（节假日除外），上午9:00—下午2:00　　\n" +
			"咨询电话：1-（213）201-1765，上午10:00--11:30 下午2:00--3:30　　\n" +
			"咨询信箱：losangeles_consulate@hotmail.com";
		default:
			return null;
		}
	}

}
