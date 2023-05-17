function groupAnagrams(strs: string[]): string[][] {
  if (strs.length === 1) {
    return [strs];
  }
  const result: string[][] = [];
  const sortedStrs = strs.map((str) => str.split("").sort().join(""));
  const strsMap = new Map<string, string[]>();

  for (let i = 0; i < sortedStrs.length; i++) {
    if (strsMap.has(sortedStrs[i])) {
      strsMap.get(sortedStrs[i])?.push(strs[i]);
    } else {
      strsMap.set(sortedStrs[i], [strs[i]]);
    }
  }

  for (const value of strsMap.values()) {
    result.push(value);
  }
  return result;
}
