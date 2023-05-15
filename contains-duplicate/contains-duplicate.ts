function containsDuplicate(nums: number[]): boolean {
  const sortedArr = nums.sort();

  for (let i = 1; i < sortedArr.length; i++) {
    if (sortedArr[i] === sortedArr[i - 1]) {
      return true;
    }
  }

  return false;
}
