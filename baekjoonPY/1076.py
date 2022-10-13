# -*- coding: utf-8 -*-
"""
Created on Thu Oct 13 23:17:52 2022

@author: ANJH
"""
import math

a = input()
b = input()
c = input()
resisters = {'black': 0, 'brown': 1, 'red': 2, 'orange': 3,
             'yellow': 4, 'green': 5, 'blue': 6, 'violet': 7,
             'grey': 8, 'white': 9}


result = (((resisters[a]*10) + resisters[b]) * (10** resisters[c]))
print(int(result))