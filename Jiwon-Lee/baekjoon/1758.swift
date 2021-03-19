let n = Int(readLine()!)!
var tips = [Int]()
for _ in 0..<n {
    let tip = Int(readLine()!)!
    tips.append(tip)
}
tips.sort(by: {$0 > $1})
var maxT = 0
for i in 0..<n {
    let a = tips[i] - ((i+1) - 1)
    if a < 0 {
        continue
    }
    maxT += a
}
print(maxT)