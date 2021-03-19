var n = 1000 - Int(readLine()!)!
var count = 0

if n / 500 > 0 {
    let c = n / 500
    n -= c * 500
    count += c
}
if n / 100 > 0 {
    let c = n / 100
    n -= c * 100
    count += c
}
if n / 50 > 0 {
    let c = n / 50
    n -= c * 50
    count += c
}
if n / 10 > 0 {
    let c = n / 10
    n -= c * 10
    count += c
}
if n / 5 > 0 {
    let c = n / 5
    n -= c * 5
    count += c
}
count += n
print(count)