class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        len_S = len(s)
        len_T = len(t)

        if len_S != len_T:
            return False

        arr = [0]*26
        for i in range(0,len_S,1):
            arr[ord(s[i])-ord('a')] +=1
            arr[ord(t[i])-ord('a')] -=1
        
        for i in range(0,26,1):
            if arr[i] != 0:
                return False
        return True

        