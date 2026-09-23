masa = float(input("Ingrese la masa de la particula (kg): "))
velocidad = float(input("Ingrese la velocidad de la particula (m/s): "))
h = 6.626e-34

longitud = h / (masa * velocidad)

print ("La longitud de la onda  es :", longitud, "m" )