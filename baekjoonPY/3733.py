# -*- coding: utf-8 -*-
"""
Created on Thu Sep 15 23:21:13 2022

@author: ANJH
"""

while True:
	try : N, S = map(int, input().split())
	except EOFError : break
	else : print(S // (N + 1))