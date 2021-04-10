# https://programmers.co.kr/learn/courses/30/lessons/42577

def solution(phone_book):
    answer = True
    dict ={}

    for cell_num in phone_book:
        dict[cell_num] = 1

    for cell_num in phone_book:
        test=""
        for number in cell_num:
            test += number
            if test in dict and test != cell_num :
                answer = False
    return answer

