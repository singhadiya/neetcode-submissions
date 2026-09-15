class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        count = 0
        for num in nums:
            if num in map:
                return [map[num],count]
            map[target - num] = count
            count +=1
        return [0,1]