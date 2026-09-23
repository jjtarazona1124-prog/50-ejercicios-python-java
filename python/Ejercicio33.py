masa = float(input("Ingrese la masa del objeto (kg): "))
velocidad_tangencial = float(input("Ingrese la velocidad_tangencial  (m/s):") )
radio= float(input("ingrese el radio (m): "))


fuerza_centrípeta = masa * velocidad_tangencial**2 / radio

print("La fuerza centripeta es:", fuerza_centrípeta, "newton")