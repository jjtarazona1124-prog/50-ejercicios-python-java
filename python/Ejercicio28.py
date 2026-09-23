import math

radio = float(input("Ingrese el radio (r): "))
angulo_grados = float(input("Ingrese el ángulo en grados (θ): "))

angulo_radianes = math.radians(angulo_grados)

x = radio * math.cos(angulo_radianes)
y = radio * math.sin(angulo_radianes)

print("Las coordenadas cartesianas son: (", x, ",", y, ")")