#lista vacia
vacia = []

#lista de cinco
cinco = ['tigre','lobo','leon','cocodrilo','tiburon']

#numero de elementos en la lista vacia
num_vacia= len(vacia)
print("num de elementos en la lista vacia: ",num_vacia)

#numero de elementos en la lista de 5
num_cinco= len(cinco)
print("num de elemendos en la lista de 5: ", num_cinco)

#las posiciones pedidas
posicion1 = cinco[0]
posicion2 = cinco[2]
posicion3 = cinco[4]
print("el primer elemento es:",posicion1, "\nel tercer elemento es:", posicion2,"\nel quinto elemento es:",posicion3)

#lista datos personales
datos_personales=['sebastian', '18 años', '1.80', 'soltero', 'paraiso#2']
print ("original:", datos_personales)

#lista datos personales con adicion appent
nuevos_datos_append= datos_personales.append('colombiano')
print("con dato agregado append: ", datos_personales)

#lista de datros personales con adicion insert
it_companies=[ 'Facebook', 'Google', 'Microsoft', 'Apple', 'IBM', 'Oracle', 'Amazon']
print("original:", it_companies)
nuevos_datos_insert = it_companies.insert(0,"tecno")
print("con dato agregado insert: ", it_companies)

#comprobar existencia
existencia= 'tecno' in it_companies
print("la empresa",it_companies[0],existencia)

#ordenar con sort
it_companies.sort()
print("la lista ordenada con sort es:",it_companies)

#ordenar con reverse
it_companies.reverse()
print("la lista ordenada con reverse es:",it_companies)

#eliminar con pop
it_companies.pop(0)
print("el primer elemento eliminado con pop queda:",it_companies)

#eliminar con delete
del it_companies[0]
print("el primer elemento eliminado con delete queda:", it_companies)

#vaciar lista
it_companies.clear()
print("lista vacia:", it_companies)