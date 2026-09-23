densidad = float(input("Ingrese la densidad del fluido (kg/m³): "))
gravedad = 9.8
profundidad = float(input("Ingrese la profundidad (m): "))

presion = densidad * gravedad * profundidad

print("La presión hidrostática es:", presion, "Pascales")