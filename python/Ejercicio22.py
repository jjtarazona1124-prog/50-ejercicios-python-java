import math

x1 = float(input("Ingrese la coordenada X del primer punto: "))
y1 = float(input("Ingrese la coordenada Y del primer punto: "))
x2 = float(input("Ingrese la coordenada X del segundo punto: "))
y2 = float(input("Ingrese la coordenada Y del segundo punto: "))

distancia = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

print("La distancia entre los dos puntos es:", distancia)