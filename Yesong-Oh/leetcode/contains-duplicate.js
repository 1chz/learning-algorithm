var containsDuplicate = function(nums) {
    
    let count = {};  
    for(let number of nums){
       if(count[number]) return true;
       else
       count[number] = 1;
    }
      return false;
  };