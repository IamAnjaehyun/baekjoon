# -*- coding: utf-8 -*-
"""
Created on Mon Sep 12 22:37:13 2022

@author: ANJH
"""
count = int(input())
for i in range(count):
    for j in range(i+1):
        print("*",end="")
    print("")