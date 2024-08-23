function dailyTemperatures(temperatures: number[]) {
  const result = new Array(temperatures.length).fill(0);
  const stack: number[][] = [];

  for (let i = 0; i < temperatures.length; i++) {
    const t = temperatures[i];
    while (stack.length > 0 && t > stack[stack.length - 1][0]) {
      const [stackT, stackIndex] = stack.pop() as number[];
      result[stackIndex] = i - stackIndex;
    }
    stack.push([t, i]);
  }
  return result;
}
