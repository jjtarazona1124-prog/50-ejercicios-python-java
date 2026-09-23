numero = float(input("Ingrese un número: "))

if numero > 0:
    signo = 1
elif numero < 0:
    signo = -1
else:
    signo = 0

print("El signo del número es:", signo)