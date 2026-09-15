class Solution {
    /**
     * @param {string[]} strs
     * @return {string[][]}
     */
    isAnagram(s,t){
        let map1 = new Map();
        let map2 = new Map();
        let length = s.length;
        if(s.length != t.length){
            return false;
        }
        for(let i=0 ;i<length; i++){
            if(map1.has(s.at(i))){
                map1.set(s.at(i),map1.get(s.at(i))+1)
            }else{
                map1.set(s.at(i),1)
            }
             if(map1.has(t.at(i))){
                map2.set(t.at(i),map.get(t.at(i))+1)
            }else{
                map2.set(t.at(i),1)
            }
        }
        for(let i=0; i<length; i++){
            if(map1.get(s.at(i))!=map2.get(s.at(i))){
                return false;
            }
        }
        return true;
    }
    groupAnagrams(strs) {
        let ans = new Map();
        let set = new Set();
        for(let str of strs){
            const sortedStr = str.split('').sort().join('');
            if(set.has(sortedStr)){
                ans.get(sortedStr).push(str);
            }else{
                set.add(sortedStr);
                ans.set(sortedStr,[str])
            }
        }
        let res = [];
        ans.forEach((value,key)=>{
            console.log("entry : ",value);
            res.push(value);
        })
        return res;
    }
}
