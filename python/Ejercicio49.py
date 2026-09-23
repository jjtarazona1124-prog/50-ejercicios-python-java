import math

mu_0 = 4 * math.pi * 1e-7
n_vueltas = int(input("Ingrese el número de vueltas de la bobina: "))
area = float(input("Ingrese el área de la sección transversal (m²): "))
radio = float(input("Ingrese el radio medio del toroide (m): "))

inductancia = (mu_0 * n_vueltas ** 2 * area) / (2 * math.pi * radio)

print("La inductancia es:", inductancia, "Henrios")