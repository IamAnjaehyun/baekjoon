# -*- coding: utf-8 -*-
"""
Created on Sun Sep 18 11:46:33 2022

@author: ANJH
"""

while 1:
    a,b = map(int, input().split())
    if a==0 and b==0:
        break
    if(a>b):
        print("Yes")
    else:
        print("No")
            
