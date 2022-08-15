# Shell

Un shell es un interprete (o sea, que tecnicamente estamos usando un lenguage de programacion) que usamos en la terminal para interactuar con la computadora. Si usamos windows, seguro escuchamos alguna vez cmd o powershell, estos son dos ejemplos de shells. En principio, nosotros vamos a trabajar con bash o con zsh (son muy parecidos)

## Bash (y POSIX)

Este es el shell mas viejo de todos. Esta en cualquier linux/unix/macOS que usemos

La sintaxis que usa es compatible con POSIX. Esto significa que cumple ciertos estandares. Por ejemplo:

- Definir una variable: para definir una variable usamos `VAR=valor`, para utilizar una variable usamos `$VAR`, por ejemplo para imprimir la variable VAR en pantalla, usamos `echo $VAR`
- Los comandos devuelven `0` en caso de que la ejecucion haya sido exitosa, y cualquier otro numero en caso de que la ejecucion haya fallado
- Concatenar comandos
    - &&: `cmd1 && cmd2` ejecutar cmd1 y si la ejecucion es exitosa ejecutar cmd2, sino no
    - ||: `cmd1 || cmd2` ejecutar cmd1 y si falla ejecutar cmd2, sino no
    - ;: `cmd1; cmd2` ejecutar cmd1 y luego ejecutar cmd2, no me importa si fallo o fue exitoso
- Alias a un comando: una sentencia que nos va a importar un monton es `alias`, esto nos permite crear un alias a un comando. Por ejemplo para actualizar los programas en ubuntu, usamos `sudo apt update && sudo apt upgrade`, como es medio largo de escribir, podemos hacer un `alias apt-upgrade="sudo apt update && sudo apt upgrade"` y luego cuando queremos actualizar los programas solo llamamos a `apt-upgrade`
- Pasar output de un programa a otro: cuando queremos que el output de un programa en vez de ser impreso en pantalla sea procesado por otro programa, usamos `|`, por ejemplo `cat lista.txt | sort` va a leer el archivo lista.txt y luego lo va a ordenar, en pantalla imprime el contenido de lista.txt ordenado de forma alfabetica
- Redirigir el input: Hay veces que en vez de escribir nosotros el input lo queremos leer de otro lado, por ejemplo un archivo, para eso usamos `<` , ejemplo `sort < lista.txt`
- Redirigir el output: Hay veces que no queremos que imprima en pantalla, sino en un archivo. Para eso usamos `>`, por ejemplo `echo Hola > hola.txt`. Esto crea un archivo nuevo y escribe Hola. En caso de que el archivo ya existiera, borra el contenido y deja solo escrito Hola
    - Si no queremos borrar el contenido, usamos `>>` en vez, y lo imprime en una nueva linea al final del archivo

Obviamente hay sentencias if/for/etc. como cualquier lenguage de programacion, pero en general no los vamos a usar mucho

## ZSH

Es como bash, pero mas moderno, nos permite tener colores, personalizar el prompt y utilizar plugins

Toda la sintaxis que hablamos antes sirve para zsh

En macOS viene por defecto, en linux la tenemos que instalar

- Ubuntu/Mint/PopOS: `sudo apt install zsh`
- Arch/Manjaro: `sudo pacman -S zsh`

Una vez que lo instalamos usamos el comando `chsh /bin/zsh` para cambiar el shell de nuestro usuario a zsh, reiniciamos la terminal y deberia quedar andando
