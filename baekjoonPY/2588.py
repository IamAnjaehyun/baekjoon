# -*- coding: utf-8 -*-
"""
Created on Mon Aug 29 15:04:35 2022

@author: ANJH


"""

A = int(input())
B = int(input())

a, aa, aaa = map(int, str(A))
b, bb, bbb = map(int, str(B))

#print(a+aa+aaa)
#print(b+bb+bbb)

print(bbb*A)
print(bb*A)
print(b*A)
print(A*B)