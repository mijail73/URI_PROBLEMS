# 	Time limit exceeded	Python 3	2.000	8/25/19, 4:02:32 PM
def llenaMatriz(entrada):
    numerosuperior = 1
    numeroinferior = 1
    matrix = [[1 for x in range(entrada)] for y in range(entrada)]
    for row in range(len(matrix)):
        for val in range(len(matrix)):
            if(row > val):  # matriz inferior, sin diagonal
                numeroinferior -= 1
                matrix[row][val] = numeroinferior
            elif(val > row):  # matriz superior, sin diagonal
                numerosuperior += 1
                matrix[row][val] = numerosuperior
        numeroinferior = row + 3
        numerosuperior = 1
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
