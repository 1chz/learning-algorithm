let n = Int(readLine()!)!
var arr = readLine()!.split(separator: " ").map { Int(String($0))! }.sorted()
var sum = 0
var dp = Array(repeating: 0, count: n)
dp[0] = arr[0]
for i in 1..<n {
    dp[i] = dp[i-1] + arr[i]
}

print(dp.reduce(0, +))