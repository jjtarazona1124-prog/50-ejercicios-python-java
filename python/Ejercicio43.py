i = float(input("Ingrese el momento de la inercia (kg*m**2): "))
velocidad = float(input("Ingrese la velocidad angular (rad/s): "))

m = i * velocidad

print("El momento angular  es:", m, "kg*m**2/s")