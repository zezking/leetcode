//Brute force solution
//Time complexity: O(n^2)
//space complexity: O(1)
function twoSum(nums: number[], target: number): number[] {
  for (let i = 0; i < nums.length - 1; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if (nums[i] + nums[j] === target) {
        return [i, j];
      }
    }
  }
  return [];
}

//Two-pass HashMap solution
//Time complexity O

function twoSum2(nums: number[], target: number): number[] {
  const hashMap = new Map<number, number>();

  for (let i = 0; i < nums.length; i++) {
    hashMap.set(nums[i], i);
  }
  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    if (hashMap.has(complement) && hashMap.get(complement) !== i) {
      const j = hashMap.get(complement) as number;
      return [i, j];
    }
  }
  return [];
}
