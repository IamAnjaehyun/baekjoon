# -*- coding: utf-8 -*-
"""
Created on Mon Oct 10 23:54:14 2022

@author: ANJH
"""
n = int(input())
for i in range(1, n+1):
    print(' '*(i-1)+"*"*(n-i+1))