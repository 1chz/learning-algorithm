var isValid = function(s) {
    let stack = [];
    let map = {
        ")": "(",
        "]": "[",
        "}": "{"
    }
   
    for(let i in s){
    if(s[i] === "(" || s[i] === "[" || s[i] === "{"){
        stack.push(s[i]);
        }
       else{
            if(stack[stack.length - 1] === map[s[i]]){
                stack.pop();
            }
            else return false;
        }
       
    } 
    return stack.length === 0;

};