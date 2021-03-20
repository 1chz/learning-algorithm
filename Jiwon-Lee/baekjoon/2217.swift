let n = Int(readLine()!)!
var rope = [Int]()
for _ in 0..<n {
    rope.append(Int(readLine()!)!)
}
rope.sort(by: {$0 > $1})
var answer = rope[0]
var stack = [rope[0]]
for i in 1..<n {
    stack.append(rope[i])
    answer = max(answer, stack.min()! * (i+1))
}
print(answer)