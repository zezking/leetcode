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
