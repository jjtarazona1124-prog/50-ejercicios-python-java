import math

c = 3e8
longitud_propia = float(input("Ingrese la longitud propia del objeto (m): "))
velocidad = float(input("Ingrese la velocidad del objeto (m/s): "))

longitud_contraida = longitud_propia * math.sqrt(1 - (velocidad ** 2 / c ** 2))

print("La longitud contraída es:", longitud_contraida, "m")