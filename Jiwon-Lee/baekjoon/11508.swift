let n = Int(readLine()!)!
var drinks = [Int]()
for _ in 0..<n {
    let drink = Int(readLine()!)!
    drinks.append(drink)
}
drinks.sort(by: {$0 > $1})
var temp = [Int]()
var answer = 0
for d in drinks {
    if temp.count < 3 {
        temp.append(d)
    } else {
        answer += temp.reduce(0, +) - temp.min()!
        temp = [d]
    }
}

if !temp.isEmpty && temp.count == 3 {
    answer += temp.reduce(0, +) - temp.min()!
} else if !temp.isEmpty && temp.count > 0 {
    answer += temp.reduce(0, +)
}
print(answer)