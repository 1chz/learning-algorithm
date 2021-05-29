# boj 10699 오늘 날짜 b5
# noj.am/10699

import time
print(time.localtime().tm_year, end="-")
print(f"time.localtime().tm_mon" if len(str(time.localtime().tm_mon))
      == 2 else f"0{time.localtime().tm_mon}", end="-")
print(time.localtime().tm_mday)
