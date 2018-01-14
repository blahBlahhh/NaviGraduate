# Information is based on "中国外交部" http://www.fmprc.gov.cn/web/

import requests
import json
import re

base = "http://www.fmprc.gov.cn/web/zwjg_674741/zwzlg_674757/"
entrance = base + "yz_674759/"

r = requests.get(entrance)
r.encoding = 'utf-8'
detail = r.text
pattern = re.compile('<a href="../(.*?)">(.*?)洲')
continent = re.findall(pattern, detail)
continent_url = {item[1] + "洲": base + item[0] for item in continent}
print(continent_url)

# for url in continent_url.values:
#     r = requests.get(url)
#     r.encoding = 'utf-8'
#     detail = r.text
#     pattern = re.compile('<a href="./(.*?)".*?>(.*?）)</a>')
#     nation = re.findall(pattern, detail)
#     print(nation)

url = continent_url['北美洲']  # 根据需求更改大洲
r = requests.get(url)
r.encoding = 'utf-8'
detail = r.text
pattern = re.compile('<a href="./(.*?)".*?>(.*?）)</a>')
nation = re.findall(pattern, detail)
nation_url = {item[1]: url + item[0] for item in nation}
print(nation_url)

with open('CanadaInfo.json', 'w') as f:
    j_data = {}
    for key, url in nation_url.items():
        if "加拿大" in key:
            print(key+url)
            r = requests.get(url)
            r.encoding = 'utf-8'
            detail = r.text
            pattern = re.compile('总 *领 *事 *：(.*?）).*?'  # 温哥华迷之span标签
                                 '地　*址：(.*?)<.*?'
                                 '网　*址：.*?href="(.*?)"', re.S)
            [(boss, addr, web)] = re.findall(pattern, detail)
            # print(boss)
            # print(addr)
            # print(web)
            j_data[key] = {}
            j_data[key]["boss"] = boss.replace("\u3000", "")
            j_data[key]["addr"] = addr
            j_data[key]["web"] = web

            pattern = re.compile('电　*话：(.*?)<', re.S)
            tel = re.findall(pattern, detail)[0]
            # print(tel)
            j_data[key]["tel"] = tel

            pattern = re.compile('电子邮箱：.*?mailto:(.*?)"', re.S)
            email = re.findall(pattern, detail)
            if email:
                email = email[0]
                j_data[key]["email"] = email
            # print(email)
    f.write(json.dumps(j_data, ensure_ascii=False))

