function isAnagram(s: string, t: string): boolean {
  const letterMap: {[key: string]: number} = {};
  if (s.length !== t.length) {
    return false;
  }

  for (let i = 0; i < s.length; i++) {
    if (!letterMap[s[i]]) {
      letterMap[s[i]] = 1;
    } else {
      letterMap[s[i]]++;
    }
  }

  for (let i = 0; i < t.length; i++) {
    if (letterMap[t[i]]) {
      letterMap[t[i]]--;
    }
  }

  for (const key in letterMap) {
    if (letterMap[key] !== 0) {
      return false;
    }
  }
  return true;
}
