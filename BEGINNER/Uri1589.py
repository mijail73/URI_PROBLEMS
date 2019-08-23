n = int(input())
for x in list(range(n)):
    cadena = input()
    lista = cadena.split()
    resultado = int(lista[0]) + int(lista[1])
    print(resultado)
