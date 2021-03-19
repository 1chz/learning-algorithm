let x = readLine()!.split(separator: " ").map { Int(String($0))! }
var coins = [Int]()
for _ in 0..<x[0] {
    let coin = Int(readLine()!)!
    coins.append(coin)
}

var k = x[1]
var count = 0
while k > 0 {
    for coin in coins.reversed() {
        while k - coin >= 0 {
            k -= coin
            count += 1
        }
    }
}
print(count)