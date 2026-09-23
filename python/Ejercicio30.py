velocidad_inicial = float(input("Ingrese la velocidad inicial (m/s): "))
aceleracion = float(input("Ingrese la aceleración (m/s²): "))
tiempo = float(input("Ingrese el tiempo transcurrido (s): "))

velocidad_final = velocidad_inicial + aceleracion * tiempo

print("La velocidad final es:", velocidad_final, "m/s")