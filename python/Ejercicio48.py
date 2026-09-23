import math

r11 = float(input("Ingrese el elemento (fila 1, columna 1) de la matriz: "))
r12 = float(input("Ingrese el elemento (fila 1, columna 2) de la matriz: "))
r21 = float(input("Ingrese el elemento (fila 2, columna 1) de la matriz: "))
r22 = float(input("Ingrese el elemento (fila 2, columna 2) de la matriz: "))

angulo_radianes = math.atan2(r21, r11)
angulo_grados = math.degrees(angulo_radianes)

print("El ángulo de rotación es:", angulo_grados, "grados")