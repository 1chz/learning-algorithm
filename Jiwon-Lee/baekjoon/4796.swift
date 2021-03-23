var t = 1
while let input = readLine() {
    var lpv = input.split(separator: " ").map { Int(String($0))! }
    if lpv.reduce(0, +) == 0 { break }
    var day = 0

    if lpv[2] / lpv[1] >= 0 {
        day += (lpv[2] / lpv[1]) * lpv[0]
        lpv[2] -= (lpv[2] / lpv[1]) * lpv[1]
    }
    if lpv[2] <= lpv[0] {
        day += lpv[2]
        lpv[2] = 0
    } else {
        day += lpv[0]
        lpv[2] = 0
    }

    print("Case \(t): \(day)")
    t += 1
}