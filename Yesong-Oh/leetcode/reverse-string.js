/*
* reverse function method
*/ 
 var reverseString = function(s) {
    s.reverse().join("");
};


/*
* Two-pointer method
*/ 
var reverseString = function(s) {
    let [left, right] = [0, s.length-1];
    
    while(left <= right){
        let tmp = s[left];
        s[left] = s[right];
        s[right] = tmp;
            
        left++;
        right--;     
    }
};