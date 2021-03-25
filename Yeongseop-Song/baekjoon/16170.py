# boj 16170 오늘의 날짜는?
# noj.am/16170

import time
_T = time.localtime
print(_T().tm_year, _T().tm_mon, _T().tm_mday, sep="\n")
