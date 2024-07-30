function trap(height) {
  let L = 0;
  let R = height.length - 1;
  let maxLeft = height[L];
  let maxRight = height[R];
  let res = 0;
  while (L < R) {
    if (maxLeft < maxRight) {
      L++;
      maxLeft = Math.max(maxLeft, height[L]);
      res += maxLeft - height[L];
    } else {
      R--;
      maxRight = Math.max(maxRight, height[R]);
      res += maxRight - height[R];
    }
  }
  return res;
}
