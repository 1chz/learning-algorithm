let n = Int(readLine()!)!
let seats = Array(readLine()!).map { String($0) }
var arr = ["*"]
for i in 0..<n {
    if seats[i] == "S" && arr.last != "*" {
        arr.append("*")
        arr.append(seats[i])
        arr.append("*")
    } else if seats[i] == "S" {
        arr.append(seats[i])
        arr.append("*")
    } else if i > 1 && seats[i] == "L" && seats[i-1] == "L" && arr.last != "*" {
        arr.append(seats[i])
        arr.append("*")
    } else {
        arr.append(seats[i])
    }
}
if arr.last != "*" {
    arr.append("*")
}
let holder = arr.filter { $0 == "*" }.count
if n < holder {
    print(n)
} else {
    print(holder)
}
