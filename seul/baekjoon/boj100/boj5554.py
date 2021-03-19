def solution(seconds: list) -> list:
    total_seconds = sum(seconds)
    m, s = divmod(total_seconds, 60)
    return [m, s]
