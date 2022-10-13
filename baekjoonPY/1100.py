chess_board = []
for k in range(8):
    chess_board.append(list(map(str, list(input()))))

sum = 0
for i in range(8):
    for j in range(8):
        if (i + j) % 2 == 0 and chess_board[i][j] == 'F':#하얀칸+F
            sum += 1
print(sum)