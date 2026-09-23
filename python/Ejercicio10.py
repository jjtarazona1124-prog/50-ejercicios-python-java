a = float(input("Ingrese el valor de la primera variable: "))
b = float(input("Ingrese el valor de la segunda variable: "))

print("Antes del intercambio: a =", a, ", b =", b)

temp = a
a = b
b = temp

print("Después del intercambio: a =", a, ", b =", b)