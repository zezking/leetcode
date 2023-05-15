function containsDuplicate(nums: number[]): boolean {
  const sortedArr = nums.sort();

  for (let i = 1; i < sortedArr.length; i++) {
    if (sortedArr[i] === sortedArr[i - 1]) {
      return true;
    }
  }

  return false;
}

//Use hash set
function containsDuplicate2(nums: number[]): boolean {
  const hashSet = new Set();

  for (let i = 0; i < nums.length; i++) {
    if (hashSet.has(nums[i])) {
      return true;
    }
    hashSet.add(nums[i]);
  }

  return false;
}
