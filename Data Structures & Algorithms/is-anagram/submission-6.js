class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        let map1 = new Map();
        let map2 = new Map();
        let sLength = s.length;
        if(sLength!=t.length){
            return false;
        }
        for(let i=0; i<sLength; i++){
            if(map1.has(s.at(i))){
                const data = map1.get(s.at(i));
                map1.set(s.at(i),data+1)
            }else{
                map1.set(s.at(i),1);
            }
            if(map2.has(t.at(i))){
                const data = map2.get(t.at(i));
                map2.set(t.at(i),data+1)
            }else{
                map2.set(t.at(i),1);
            }
        }
        for(let i=0; i<sLength; i++){
            if(map1.get(s.at(i))!=map2.get(s.at(i))){
                return false;
            }
        }
        return true;
    }
}
