- [Ejercicio 1](#ejercicio-1)
- [Ejercicio 2](#ejercicio-2)
  - [a](#a)
  - [b](#b)
  - [Formato](#formato)
    - [Ejemplo:](#ejemplo)
- [Ejercicio 3: Vertices Madre](#ejercicio-3-vertices-madre)
  - [Formato](#formato-1)
    - [Ejemplo](#ejemplo-1)

# Ejercicio 1
Agregar funcion al TAD Grafo
```java
public int[][] getAdjMatrix();
```
que nos devuelve una **copia** de la matriz de adyacencia. Para la implementacion de listas de adyacencia, arman una nueva matriz a partir de las listas de adyacencias.

# Ejercicio 2
Dado un grafo dirigido y **no** ponderado, encontrar los caminos mas cortos

## a
Resolverlo con algoritmo de Dijkstra

## b
Resolverlo con algoritmo de Floyd

## Formato
Entrada:
```
<#vertices>
<#aristas>
<ori> <dest> <costo>
<ori> <dest> <costo>
<ori> <dest> <costo>
.
.
.
<ori> <dest> <costo>
<#preguntas>
<ori> <dest>
.
.
.
<ori> <dest>

```

Salida:
```
<costo>
<costo>
.
.
.
<costo>
```

### Ejemplo:
Entrada:
```
5
8
4 3 14
5 4 10
1 1 2
2 3 8
3 3 14
4 4 5
3 1 4
5 5 13
6
1 5
2 3
5 4
5 2
1 3
2 1
```

Salida:
```
28
8
10
32
4
12
```

# Ejercicio 3: Vertices Madre
Dado un grafo dirigido y no ponderado se desea saber todos los vertices madre que contiene.

Un vertice madre es aquel que es posible de ir a cualquier otro vertice (no necesariamente si mismo).

Restricciones
Resolver en orden temporal: O(V^3).

## Formato
```
<#vertices>
<#aristas>
<ori> <dest>
<ori> <dest>
<ori> <dest>
.
.
.
<ori> <dest>
<#preguntas>
<ori> <dest>
.
.
.
<ori> <dest>
```

Salida:
```
<costo>
<costo>
.
.
.
<costo>
```

### Ejemplo
Entrada:
```
3
2
2 3
1 2
```
Salida:
```
1

```
