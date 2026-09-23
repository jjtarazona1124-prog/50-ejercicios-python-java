epsilon_0 = 8.854e-12
epsilon_r = float(input("Ingrese la permitividad relativa del material (1 para vacío/aire): "))
area = float(input("Ingrese el área de las placas (m²): "))
distancia = float(input("Ingrese la distancia entre las placas (m): "))

capacitancia = epsilon_0 * epsilon_r * area / distancia

print("La capacitancia es:", capacitancia, "Faradios")