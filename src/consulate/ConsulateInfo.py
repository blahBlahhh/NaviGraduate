# Information is based on "�й��⽻��" http://www.fmprc.gov.cn/web/

import requests
import json
import re

base = "http://www.fmprc.gov.cn/web/zwjg_674741/zwzlg_674757/"
entrance = base + "yz_674759/"

r = requests.get(entrance)
r.encoding = 'utf-8'
detail = r.text
pattern = re.compile('<a href="../(.*?)">(.*?)��')
continent = re.findall(pattern, detail)
continent_url = {item[1] + "��": base + item[0] for item in continent}
print(continent_url)

# for url in continent_url.values:
#     r = requests.get(url)
#     r.encoding = 'utf-8'
#     detail = r.text
#     pattern = re.compile('<a href="./(.*?)".*?>(.*?��)</a>')
#     nation = re.findall(pattern, detail)
#     print(nation)

url = continent_url['������']  # ����������Ĵ���
r = requests.get(url)
r.encoding = 'utf-8'
detail = r.text
pattern = re.compile('<a href="./(.*?)".*?>(.*?��)</a>')
nation = re.findall(pattern, detail)
nation_url = {item[1]: url + item[0] for item in nation}
print(nation_url)

with open('CanadaInfo.json', 'w') as f:
    j_data = {}
    for key, url in nation_url.items():
        if "���ô�" in key:
            print(key+url)
            r = requests.get(url)
            r.encoding = 'utf-8'
            detail = r.text
            pattern = re.compile('�� *�� *�� *��(.*?��).*?'  # �¸绪��֮span��ǩ
                                 '�ء�*ַ��(.*?)<.*?'
                                 '����*ַ��.*?href="(.*?)"', re.S)
            [(boss, addr, web)] = re.findall(pattern, detail)
            # print(boss)
            # print(addr)
            # print(web)
            j_data[key] = {}
            j_data[key]["boss"] = boss.replace("\u3000", "")
            j_data[key]["addr"] = addr
            j_data[key]["web"] = web

            pattern = re.compile('�硡*����(.*?)<', re.S)
            tel = re.findall(pattern, detail)[0]
            # print(tel)
            j_data[key]["tel"] = tel

            pattern = re.compile('�������䣺.*?mailto:(.*?)"', re.S)
            email = re.findall(pattern, detail)
            if email:
                email = email[0]
                j_data[key]["email"] = email
            # print(email)
    f.write(json.dumps(j_data, ensure_ascii=False))

