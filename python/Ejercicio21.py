masa1 = float(input("Ingrese la masa del primer objeto (kg): "))
masa2 = float(input("Ingrese la masa del segundo objeto (kg): "))
distancia = float(input("Ingrese la distancia  entre los centros de los dos objetos (m): "))
gravedad = (6.674e-11)

fuerza_gravitacional = gravedad * masa1 * masa2 /distancia**2

print ("La fuerza gravitacional es :", fuerza_gravitacional, "newton" )