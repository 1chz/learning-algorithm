while True:
    input_num = input()
    if input_num == "0":
        break 
    
    answer = "no"

    if input_num == input_num[::-1]:
        answer = "yes"

    print(answer)
    #feat(Jeongmu-Jo): [BOJ, 1037] 약수