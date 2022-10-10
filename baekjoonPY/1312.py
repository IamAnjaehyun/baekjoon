# -*- coding: utf-8 -*-
"""
Created on Sat Oct  8 16:13:00 2022

@author: ANJH
"""

a,b,c = map(int, input().split())

answer = 0

for i in range(c+1):
    answer = a//b
    a = a%b * 10
    
print(answer)