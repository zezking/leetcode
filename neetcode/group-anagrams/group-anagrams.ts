//Categorize strings by sorted strings
//Time complexity: n is length of the array, k is the longest string for each array, we need to traverse through the array and sorted each string so it is O(n*k*log(k))
//Space complexity: create a Map size of n and store string in the length of k so it is O(n*k)
function groupAnagrams(strs: string[]): string[][] {
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

  result.push(...strsMap.values());
  return result;
}
