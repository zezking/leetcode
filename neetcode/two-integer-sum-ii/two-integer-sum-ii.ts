const twoIntegerSumII=(numbers:number[], target:number)=>{
    //brute force with o(n2) time complexity
    // let leftP=0
    // let rightP=numbers.length-1
    // while(leftP<numbers.length-1){
    //     while(rightP>leftP){
    //         if(numbers[leftP]+numbers[rightP]===target){
    //             return [leftP+1, rightP+1]
    //         } 
    //         rightP--;
    //     }
    //     leftP++;
    //     rightP=numbers.length-1
    // }

    let L=0
    let R=numbers.length-1

    while (L<R){
        if(numbers[R]+numbers[L]>target){
            R-=1
        } else if (numbers[R]+numbers[L]<target){
            L+=1
        } else {
            return [L+1,R+1]
        }
    }

}