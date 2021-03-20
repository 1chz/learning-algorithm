let a = 300
let b = 60
let c = 10
var count = Array(repeating: 0, count: 3)
var t = Int(readLine()!)!
if t/a > 0 {
    let temp = t/a
    count[0] += temp
    t -= temp * a
}
if t/b > 0 {
    let temp = t/b
    count[1] += temp
    t -= temp * b
}
if t/c > 0 {
    let temp = t/c
    count[2] += temp
    t -= temp * c
}
if t != 0 {
    print(-1)
} else {
    print(count.map { String($0) }.joined(separator: " "))
}