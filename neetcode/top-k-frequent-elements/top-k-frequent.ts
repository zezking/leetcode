function topKFrequent(nums: number[], k: number): number[] {
  const group = new Map<number, number>();

  for (const num of nums) {
    if (!group.has(num)) {
      group.set(num, 1);
    } else {
      group.set(num, group.get(num)! + 1);
    }
  }

  const sortGroup = new Map([...group.entries()].sort((a, b) => b[1] - a[1]));

  const result = Array.from(sortGroup.keys()).slice(0, k);

  return result;
}
