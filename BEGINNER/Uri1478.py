# 1478	Square Matrix II	Accepted	Python 3	1.256	8/30/19, 9:16:22 AM
def llenaMatriz(entrada):
    numeroinferior = 1
    matrix = [[1 for x in range(entrada)] for y in range(entrada)]
    for row in range(len(matrix)):
        for val in range(len(matrix)):
            if(row > val):  # matriz inferior, sin diagonal
                numeroinferior -= 1
                matrix[row][val] = numeroinferior
                matrix[val][row] = numeroinferior
        numeroinferior = row + 3
    return matrix


# def imprimeMatriz(matrix):
#     for row in matrix:
#         for val in row:
#             print('{:3}'.format(val), end="")
#         print()
#     print('\n')
def imprimeMatriz(matrix):
    for i in range(len(matrix)):
        for j in range(len(matrix)):
            if j == 0:
                print('{:3}'.format(matrix[i][j]), end="")
            else:
                print(' {:3}'.format(matrix[i][j]), end="")
        print()


def main():
    entrada = int(input())
    while(entrada != 0):
        imprimeMatriz(llenaMatriz(entrada))
        print()
        entrada = int(input())


if __name__ == "__main__":
    main()
