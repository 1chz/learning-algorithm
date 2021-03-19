let n = Int(readLine()!)!
var arr = [[Int]]()
for _ in 0..<n {
    let v = readLine()!.split(separator: " ").map { Int(String($0))! }
    arr.append(v)
}
arr.sort(by: { $0[1] == $1[1] ? $0[0] < $1[0] : $0[1] < $1[1] })
var cnt = 1
var end = arr[0][1]
for i in 1..<n {
    if arr[i][0] >= end {
        cnt += 1
        end = arr[i][1]
    }
}

print(cnt)