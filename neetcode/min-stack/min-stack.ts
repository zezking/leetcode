class MinStack {
    stack: number[]
    minStack: number[]
    constructor() {
        this.stack = []
        this.minStack = []
    }

    /**
     * @param {number} val
     * @return {void}
     */
    // 1, 2, 0
    //tempMin 1, 
    push(val: number) {
        this.stack.push(val)
        this.minStack.length === 0 ? this.minStack.push(val) : this.minStack.push(Math.min(val, this.minStack[this.minStack.length - 1]))
    }

    /**
     * @return {void}
     */
    pop() {
        this.stack.pop()
        this.minStack.pop()
    }

    /**
     * @return {number}
     */
    top() {
        return this.stack[this.stack.length - 1]
    }

    /**
     * @return {number}
     */
    getMin() {
        return this.minStack[this.minStack.length - 1]
    }
}
