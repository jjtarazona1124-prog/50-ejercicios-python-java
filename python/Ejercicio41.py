volumen = float(input("Ingrese el volumen del gas (L): "))
n = float(input("Ingrese la cantidad de sustancia en moles (mol): "))
temperatura = float(input("Ingrese la temperatura (K): "))
r = 0.0821 

presion = n * r * temperatura / volumen

print ("La presion del gas  es :", presion, "atm" )