def llenaMatriz(entrada):
    numero = 2
    inicio = 1
    extremo = entrada - 2
    matrix = [[1 for x in range(entrada)] for y in range(entrada)]
    for a in list(range(entrada - 2)):
        for i in list(range(inicio, extremo + 1)):
            for j in list(range(inicio, extremo + 1)):
                matrix[i][j] = numero
        numero += 1
        inicio += 1
        extremo -= 1
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
