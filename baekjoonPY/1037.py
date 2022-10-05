# -*- coding: utf-8 -*-
"""
Created on Wed Oct  5 17:42:44 2022

@author: ANJH
"""

n = int(input())
a = sorted(map(int, input().split()))
print(a[0]*a[-1])