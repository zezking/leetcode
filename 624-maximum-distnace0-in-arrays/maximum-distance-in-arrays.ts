function maxDistance(arrays: number[][]): number {
  let distance = 0;
  let min = arrays[0][0];
  let max = arrays[0][arrays[0].length - 1];

  for (let i = 1; i < arrays.length; i++) {
    const n = arrays[i].length;
    const currentMin = arrays[i][0];
    const currentMax = arrays[i][n - 1];

    distance = Math.max(
      distance,
      Math.abs(currentMin - max),
      Math.abs(currentMax - min)
    );
    min = Math.min(currentMin, min);
    max = Math.max(currentMax, max);
  }

  return distance;
}
