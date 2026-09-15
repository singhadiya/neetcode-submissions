class Solution {
    /**
     * @param {string} s
     * @return {boolean}
     */
    isPalindrome(s) {
        let length = s.length;
        if(length <2) {
            return true;
        }
        const str = s.replace(/\W/g,'').toLowerCase();
        length = str.length;
        for(let i=0;i<length/2;i++){
            if(str.at(i)!=str.at(length-i-1)){
               return false;
            };
        }
        return true;
    }
}
