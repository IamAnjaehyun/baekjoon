# -*- coding: utf-8 -*-
"""
Created on Thu Sep 29 17:09:10 2022

@author: ANJH
"""

a = int(input())
result = 1
if a>0:
    for i in range (1, a+1):
        result *= i

print(result)
