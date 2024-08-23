function numIdenticalPairs(nums: number[]): number {
  let result = 0;
  const hashMap = {};
  for (let i = 0; i < nums.length; i++) {
    if (!hashMap[nums[i]]) {
      hashMap[nums[i]] = 1;
    } else {
      hashMap[nums[i]]++;
    }
  }

  for (const key of Object.keys(hashMap)) {
    const n = hashMap[key];
    result += (n * (n - 1)) / 2;
  }
  return result;
}
