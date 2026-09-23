import math

G = 6.674e-11
masa_planeta = float(input("Ingrese la masa del planeta (kg): "))
radio_planeta = float(input("Ingrese el radio del planeta (m): "))

velocidad_escape = math.sqrt(2 * G * masa_planeta / radio_planeta)

print("La velocidad de escape es:", velocidad_escape, "m/s")