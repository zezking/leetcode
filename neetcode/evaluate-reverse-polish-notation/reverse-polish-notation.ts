function evalRPN(tokens) {
    const stack: number[] = []
    const operands = ["+", '-', "*", '/']
    for (const token of tokens) {
        if (!operands.includes(token)) {
            stack.push(parseInt(token))
        } else if (token === '+') {
            const a = stack.pop()
            const b = stack.pop()

            if (a && b) {
                stack.push(a + b)
            }

        } else if (token === '-') {
            const a = stack.pop()
            const b = stack.pop()

            if (a && b) {
                stack.push(b - a)
            }
        } else if (token === '*') {
            const a = stack.pop()
            const b = stack.pop()

            if (a && b) {
                stack.push(a * b)
            }
        } else if (token === '/') {
            const a = stack.pop()
            const b = stack.pop()
            if (a && b) {
                stack.push(Math.trunc(b / a))
            }
        }
    }
    return stack.pop()
}