function carFleet(target, position, speed) {
    let fleetCount = 0
    const pairs = position.map((pos, i) => [pos, speed[i]])
    pairs.sort((a, b) => b[0] - a[0])
    const timeToTarget = new Array(position.length)
    console.log(pairs)
    for (let i = 0; i < position.length; i++) {
        timeToTarget[i] = (target - pairs[i][0]) / pairs[i][1]
        if (i >= 1 && timeToTarget[i] <= timeToTarget[i - 1]) {
            timeToTarget[i] = timeToTarget[i - 1]
        } else {
            fleetCount++
        }
    }
    return fleetCount
}