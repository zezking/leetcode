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

//Bucket sort solution
function topKFrequent2(nums: number[], k: number): number[] {
  const count = new Array<number[]>(nums.length + 1);
  const group = new Map<number, number>();
  const result: number[] = [];

  for (const num of nums) {
    if (!group.has(num)) {
      group.set(num, 1);
    } else {
      group.set(num, group.get(num)! + 1);
    }
  }

  for (let i = 0; i < count.length; i++) {
    count[i] = [];
  }

  for (const [key, counts] of group) {
    count[counts].push(key);
  }

  for (let i = count.length - 1; i > -1; i--) {
    if (count[i].length !== 0 && k > 0) {
      result.push(...count[i]);
      k--;
    }
  }
  return result;
}
