# -*- coding: utf-8 -*-
"""
Created on Mon Sep 12 22:46:10 2022

@author: ANJH
"""
num = map(int, input().split())

result = 0

for i in num:
   result += i ** 2

print(result%10)