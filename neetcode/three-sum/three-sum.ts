function threeSum(nums: number[]): number[][] {
    const result:number[][] = []
    nums.sort((a,b)=>a-b)
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
            break
        }
        if (i > 0 && nums[i - 1] === nums[i]) {
            continue
        }
        let a = nums[i]
        let L = i + 1
        let R = nums.length - 1
        while (L < R) {
            if (a + nums[L] + nums[R] > 0) {
                R--;
            } else if (a + nums[L] + nums[R] < 0) {
                L++
            } else {
                result.push([a, nums[L], nums[R]])
                L++
                R--
                while (nums[L] === nums[L - 1] && L < R) {
                    L++
                }
            }
        }
    }
    return result
};