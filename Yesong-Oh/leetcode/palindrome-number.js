var isPalindrome = function (x) {
    x = String(x);
    let reverse = "";
    for (let i = x.length - 1; i >= 0; --i) {
        reverse += x[i];
    }
    return reverse === x;

};