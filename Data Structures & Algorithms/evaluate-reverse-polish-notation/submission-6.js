class Solution {
    /**
     * @param {string[]} tokens
     * @return {number}
     */
    evalRPN(tokens) {
        let stack = [];
        for(let t of tokens){
            if(t === "+"){
                stack.push(stack.pop()+stack.pop());
                console.log("stock",stack);
            }else if(t === "-"){
                const top  = stack.pop();
                const bottom = stack.pop();
                stack.push(bottom - top);
                console.log("stock",stack);
            }else if(t === "*"){
                const top  = stack.pop();
                const bottom = stack.pop();
                stack.push(bottom*top); 
                console.log("stock",stack);
            }else if(t === "/"){
                const top  = stack.pop();
                const bottom = stack.pop();
                stack.push(Math.trunc(bottom/top)); 
                console.log("stock",stack);
            }else{
                stack.push(Number.parseInt(t));
                console.log("stock",stack);

            }
        }
        return stack.pop();
    }
}
