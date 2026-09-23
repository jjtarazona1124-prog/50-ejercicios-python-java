k = float(input("Ingrese la constante elástica del resorte (N/m): "))
x = float(input("Ingrese la deformación del resorte (m): "))

energia_potencial = 0.5 * k * x ** 2

print("La energía potencial elástica es:", energia_potencial, "Joules")