var maximumProduct = function(nums) {
      
      nums.sort((a, b) => {
          return a - b;
      })
      
      let case1 = nums[0] * nums[1] * nums[nums.length - 1];
      let case2 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
      
      return Math.max(case1, case2);
      
        
  };