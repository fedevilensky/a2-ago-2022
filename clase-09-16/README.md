# Ejercicio 1
Dado un grafo: denso, dirigido, y no ponderado
Se va a preguntar por la existencia de una arista, en caso afirmativo imprimir 1, en caso negativo imprimir 0

Aclaracion: el primer vertice es 1

Formato de entrada:
```
<cantidad de vertices>
<cantidad de aristas>
<desde> <hasta>
<desde> <hasta>
.
.
.
<cantidad de aristas para responder>
<desde> <hasta>
<desde> <hasta>
.
.
.
```
Salida: n lineas indicando si la arista pedida existe o no

Ejemplo:

Entrada:
```
2
1
1 2
2
1 2
2 1
```
Salida:
```
1
0
```
# Ejercicio 2
Idem, pero el grafo ahora es no dirigido

Ejemplo:

Entrada:
```
2
1
1 2
2
1 2
2 1
```
Salida:
```
1
1
```
# Ejercicio 3
Ahora vamos a trabajar con un grafo: dirigido, disperso, y ponderado

Vamos a recibir un grafo, y nos van a pedir los pesos de las aristas. Solo debemos
imprimir aquellas aristas que existan

Formato entrada:
```
<cantidad de vertices>
<cantidad de aristas>
<desde> <hasta> <peso>
<desde> <hasta> <peso>
.
.
.
<cantidad de aristas para responder>
<desde> <hasta>
<desde> <hasta>
.
.
.
```
Formato de la salida: se imprime un peso en cada linea, solo los que existen

Ejemplo:

Entrada:
```
2
1
1 2 4
2
2 1
1 2
```
Salida:
```
4
```
# Ejercicio 4
Ver que pasa cuando usamos una implementacion "no optima" para los ejercicios 1 y 3
