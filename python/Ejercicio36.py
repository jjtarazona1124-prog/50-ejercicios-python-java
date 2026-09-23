import math

radio = float(input("Ingrese el radio (r): "))
theta_grados = float(input("Ingrese el ángulo theta en grados (desde el eje Z): "))
phi_grados = float(input("Ingrese el ángulo phi en grados (en el plano XY): "))

theta = math.radians(theta_grados)
phi = math.radians(phi_grados)

x = radio * math.sin(theta) * math.cos(phi)
y = radio * math.sin(theta) * math.sin(phi)
z = radio * math.cos(theta)

print("Las coordenadas cartesianas son: (", x, ",", y, ",", z, ")")