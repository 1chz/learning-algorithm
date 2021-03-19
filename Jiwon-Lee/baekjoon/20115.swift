let n = Int(readLine()!)!
var drinks = readLine()!.split(separator: " ").map { Double(String($0))! }
drinks.sort(by: {$0 > $1})
var sum = Double(drinks[0])
for i in 1..<n {
    sum += drinks[i] / 2
}
print(sum)
