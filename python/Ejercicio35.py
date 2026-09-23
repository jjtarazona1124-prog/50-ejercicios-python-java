k = 8.99e9
carga = float(input("Ingrese la carga puntual (C): "))
radio = float(input("Ingrese la distancia desde la carga (m): "))

campo_electrico = k * carga / radio ** 2

print("El campo eléctrico es:", campo_electrico, "N/C")