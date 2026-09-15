class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isValid(s) {
        let stack = [];
        for(let c of s){
            console.log("c : ",c);
            if(c === '(' || c ==='{' || c === '['){
                stack.push(c);
            }else if(c == ')' &&  stack.length > 0 && stack[stack.length-1]==='('){
                stack.pop();
            }else if(c == '}' &&  stack.length > 0 && stack[stack.length-1]==='{'){
                stack.pop();
            }else if(c == ']' &&  stack.length > 0 && stack[stack.length-1]==='['){
                stack.pop();  
            }else{  
                stack.push(c);
            }
        }
        return stack.length === 0;
    }
}
