# 오늘의 날짜는?
from datetime import datetime, timezone
utc = datetime.now(timezone.utc)
print(utc.year, utc.month, utc.day, sep='\n')