/*
* toLowerCase function method
*/ 
var toLowerCase = function(str) {
    return str.toLowerCase();  
};



/*
* ASCII method
*/ 
var toLowerCase = function(str) {
    let res = "";
    for(let char of str){
        if(char >= 'A' && char <= 'Z'){
           let code = char.charCodeAt(0);
           res += String.fromCharCode(code + 32);
        }else{
            res += char;
        }
    }
      return res;
};