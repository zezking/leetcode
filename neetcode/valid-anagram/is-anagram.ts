function isAnagram(s: string, t: string): boolean {
  const counter: number[] = new Array(26).fill(0);
  if (s.length !== t.length) {
    return false;
  }

  for (let i = 0; i < s.length; i++) {
    counter[s[i].charCodeAt(0) - "a".charCodeAt(0)]++;
    counter[t[i].charCodeAt(0) - "a".charCodeAt(0)]--;
  }

  for (const count of counter) {
    if (count !== 0) {
      return false;
    }
  }

  return true;
}


/*
Time O(n)
Space O(n)
*/

function isAnagram2(s, t) {
  if (s.length !== t.length) {
    return false
  }
  const sHashMap = {}
  const tHashMap = {}
  for (let i = 0; i < s.length; i++) {
    sHashMap[s[i]] = sHashMap[s[i]] ? sHashMap[s[i]] + 1 : 1
    tHashMap[t[i]] = tHashMap[t[i]] ? tHashMap[t[i]] + 1 : 1
  }

  for (const c in sHashMap) {
    if (sHashMap[c] !== tHashMap[c]) {
      return false
    }
  }
  return true
}

function isAnagram3(s, t) {
  return s.sort() !== t.sort()
}