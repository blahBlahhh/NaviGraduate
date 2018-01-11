# Information is based on "中国外交部" http://www.fmprc.gov.cn/web/

import requests
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

with open('consulate.txt', 'w') as f:
    for key, url in nation_url.items():
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
        f.write(key + '\n')
        f.write(boss + '\n')
        f.write(addr + '\n')
        f.write(web + '\n')

        pattern = re.compile('电　*话：(.*?)<', re.S)
        tel = re.findall(pattern, detail)[0]
        # print(tel)
        f.write(tel + '\n')

        pattern = re.compile('电子邮箱：.*?mailto:(.*?)"', re.S)
        email = re.findall(pattern, detail)
        if email:
            email = email[0]
            f.write(email + '\n')
        # print(email)
        f.write('\n')