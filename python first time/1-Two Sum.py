hash_table = {}
for i, num in enumerate(nums):
    if target - num in hash_table:
        return([hash_table[target - num], i])
        break    
    hash_table[num] = i
return([])
