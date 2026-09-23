import math

a = float(input("Ingrese la parte real (a): "))
b = float(input("Ingrese la parte imaginaria (b): "))

r = math.sqrt(a ** 2 + b ** 2)
theta_radianes = math.atan2(b, a)
theta_grados = math.degrees(theta_radianes)

print("La forma polar es: r =", r, ", θ =", theta_grados, "grados")