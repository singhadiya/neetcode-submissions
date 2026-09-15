class Solution {
    /**
     * @param {string[]} strs
     * @returns {string}
     */
    encode(strs) {
        let encodedStr = '';
        for(let str of strs){
            encodedStr += str.length + 'e' + str;
        }
        console.log("strs : ",encodedStr);
        return encodedStr;
    }

    /**
     * @param {string} str
     * @returns {string[]}
     */
    decode(str) {
        let ans = [];
        let i=0;
        while(i<str.length){
            const index = str.indexOf("e",i);
            console.log("error : ",str.substring(i, index));
            const number = Number.parseInt(str.substring(i,index));
            ans.push(str.substring(index+1,index+number+1));
            i = index+number+1;
        }
        return ans;
    }
}
