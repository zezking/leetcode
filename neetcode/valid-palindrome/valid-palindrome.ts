const validPalindrome = (s: string) => {
  const characters = s.replace(/\s/g, "").replace(/\W/g, "");

  let leftP = 0;
  let rightP = characters.length - 1;
  console.log(characters);
  while (leftP < rightP) {
    if (
      characters[leftP].toLocaleLowerCase() !==
      characters[rightP].toLocaleLowerCase()
    ) {
      return false;
    }
    leftP++;
    rightP--;
  }

  return true;
};
