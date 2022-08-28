# -*- coding: utf-8 -*-
"""
Created on Sun Aug 28 15:52:15 2022

@author: ANJH
"""

cp = [1, 1, 2, 2, 2, 8]
li = list(map(int, input().split()))
for i in range(6):
    print(cp[i]-li[i], end=' ')