class MinStack {
    constructor() {
        this.stack = [];
    }

    /**
     * @param {number} val
     * @return {void}
     */
    push(val) {
        this.stack.push(val);
        return;
    }

    /**
     * @return {void}
     */
    pop() {
        this.stack.pop();
        return;
    }

    /**
     * @return {number}
     */
    top() {
        return this.stack[this.stack.length-1];
    }

    /**
     * @return {number}
     */
    getMin() {
        let length = this.stack.length;
        if(length ==0){
            return 0
        }
        let temp = [];
        let min = this.stack[0];
        while(this.stack.length > 0){
            const d = this.stack.pop();
            min = Math.min(min,d);
            temp.push(d);
        }
        while(temp.length >0){
            this.stack.push(temp.pop());
        }
        return min;
    }
}
