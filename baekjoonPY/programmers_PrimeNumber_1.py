# -*- coding: utf-8 -*-
"""
Created on Fri Sep 30 12:39:47 2022

@author: ANJH
"""

def prime_number(x):
    if x>1 :
        for i in range(2,x):
            if x % i == 0:
                return False
    else:
        return False
    return True

def solution(nums):
    nums_len = len(nums)
    answer = 0
    for i in range(nums_len):
        for j in range(i+1, nums_len):
            for k in range(j+1, nums_len):
                sum = nums[i] + nums[j] + nums[k]     
                if prime_number(sum) == True:
                    answer += 1
    return answer