function productExceptSelf(nums: number[]): number[] {
  const result = new Array(nums.length);

  let prefix = 1;
  let postfix = 1;

  //calculate prefix
  for (let i = 0; i < nums.length; i++) {
    result[i] = prefix;
    prefix *= nums[i];
  }

  //multiply the postfix
  for (let i = nums.length - 1; i > -1; i--) {
    result[i] *= postfix;
    postfix *= nums[i];
  }

  return result;
}
