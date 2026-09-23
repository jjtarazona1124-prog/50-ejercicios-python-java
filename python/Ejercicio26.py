primer_termino = float(input("Ingrese el primer término (a1): "))
diferencia = float(input("Ingrese la diferencia común (d): "))
n = int(input("Ingrese la posición del término que desea calcular (n): "))

termino_n = primer_termino + (n - 1) * diferencia

print("El término", n, "de la progresión es:", termino_n)