# -*- coding: utf-8 -*-
"""
Created on Sun Oct 16 14:12:51 2022

@author: ANJH
"""
"""
실패
a,b = map(int, input().split(" "))

chess_board = []
for k in range(a):
    chess_board.append(list(map(str, list(input()))))

sum = 0
for i in range(a):
    for j in range(b):
        if chess_board[i][j] == 'W' and chess_board[i][j+1] =='B': continue
        elif chess_board[i][j] == 'B' and chess_board[i][j+1] =='W' : continue            
        else : sum +=1
print(sum)
"""

#정답
n,m=map(int,input().split())

mtr=[]
cnt=[]
for i in range(n):
    mtr.append(input())
    
for a in range(n-7):
    for b in range(m-7):#8*8로 자르기 위해, -7해준다
        w_index=0 #흰색으로 시작
        b_index=0 #검은색으로 시작
        for i in range(a,a+8):#시작지점
            for j in range(b,b+8):#시작지점
                if (i+j)%2==0:#짝수인 경우
                    if mtr[i][j]!='W':#W가 아니면, 즉 B이면
                        w_index+=1#W로 칠하는 갯수
                    else:#W일 때
                        b_index+=1#B로 칠하는 갯수
                else:#홀수인 경우
                    if mtr[i][j]!='W':#W가 아니면, 즉 B이면
                        b_index+=1#B로 칠하는 갯수
                    else:
                        w_index+=1#W로 칠하는 갯수
                        
        cnt.append(w_index) #W로 시작할 때 경우의 수
        cnt.append(b_index) #B로 시작할 때 경우의 수
print(min(cnt))