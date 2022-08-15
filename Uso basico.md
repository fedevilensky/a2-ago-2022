# Uso basico

Tanto en linux como en macOS, TODO ES UN ARCHIVO. Esto es, no hay diferencia a nivel del sistema operativo entre un archivo, un programa, o incluso el hardware. Por ejemplo, en linux, en la carpeta `/dev/` se encuentran todos los dispositivos. Entonces podemos ir a `/dev/cpu/`, y vemos todos los nucleos del cpu listados

Esto tiene la consecuencia de que, a diferencia de windows, podemos manejar basicamente cualquier cosa desde la linea de comando

Por defecto los programas que tenemos disponibles para usar son los que estan en alguna de las carpetas definidas en la variable `PATH`, para verla en patalla, usamos `echo $PATH`

## File system

Entre distintas distribuciones/sistemas operativos hay algunas diferencias, pero los conceptos se mantienen

| `/` | La raiz. Todo se encuentra aca. En windows no existe un equivalente, pero seria un nivel arriba de `C:` |
| --- | --- |
| `/home` | Donde se encuentra la carpeta home de todos los usuarios, solo se tiene acceso a la carpeta de mi usuario |
| `/home/<mi-usuario>`, `$Home`, `~` | En esta carpeta se encuentra todo lo pertinente a mi usuario. El escritorio, las descargas, mis documentos, mis archivos de configuracion. Aca es donde hacemos casi todo, y es el unico lugar donde podemos hacer las cosas sin sudo |
| `~/.config` | En esta carpeta se encuentran un monton de carpetas, con las configuraciones para los distitnos programas |
| `/dev` | Devices |
| `/bin`, `/sbin`, `/usr/bin`, `/usr/local/bin`, `/usr/local/sbin `| Binaries. En estas carpetas se encuentran los archivos binarios (programas) que podemos usar desde la linea de comando. En caso de querer instalar programas para MI usuario, es recomendable crear una carpeta `~/bin` e incluirla en el path |
| `/lib`, `/lib64` | Libraries. En estas carpetas se encuentran las libraries compartidas entre distintos programas. Por ejemplo las librerias estandar de C y C++ se encuentran en estas carpetas. NO TOCAMOS ESTO NUNCA |
| `/etc` | Nadie sabe que significa. Se encuentran los archivos de configuracion que no son particulares de un usuario, sino que son de todo el sistema operativo. Los podemos editar con sudo, pero lo mas recomendable es hacer una copia en ~/.config y editar esa copia |
| `/mnt` | Aqui es donde montamos otros discos/particiones del disco para poder accederlos. Por ejemplo: `mount /dev/ssd0p3 /mnt` monta la particion 3 del disco 0 en la carpeta `/mnt`. Ahora podemos acceder al disco como a cualquier otra carpeta. Para desmontarlo usamos `umount /mnt`  |
| `/boot` | Esta carpeta es donde se encuentra montada la particion que contiene al bootloader, en general no lo deberiamos tocar salvo que sepamos lo que estamos haciendo. En algunas distribuciones, ni siquiera nos muestran la carpeta |
| `.` | Significa la carpeta actual. Podemos usarlo por ejemplo para identificar un archivo que esta en la carpta actual. `cat ./my-text-file.txt` |
| `..` | Sginifica la carpeta un nivel arriba de donde estamos parados. Por ejemplo para salir de la carpeta donde estamos parados usamos `cd ..` |

## Comandos basicos

| `cd <dest>` | cambia el directorio actual a `<dest>` |
| --- | --- |
| `ls` | listar el directorio actual |
| `man <cmd>` | nos muestra el manual de uso del comando `<cmd>` (no existe para todos los comandos) |
| `<cmd> -h` | en general los comandos tienen el flag `-h` o `--help` para ver como se usa |
| `whoami` | nos dice el nombre de usuario |
| `echo` | imprime en pantalla. Por ejemplo podemos usar `echo $SHELL` para ver que shell estamos usando |
| `pwd` | Nos indica el directorio actual. Print (name of) Working Directory |
| `sudo <cmd>` | nos sirve para elevar los permisos de un comando |
| `!!` | repetir ultimo comando. Por ejemplo si nos olvidamos de poner sudo en el ultimo comando, podemos hacer sudo `!!` para correr el ultimo comando con sudo. Ademas, si apretamos tab, lo expande al comando entero (asi lo podemos editar) |

## Uso de `ls`

| `ls -a` | igual que ls, pero ademas muestra los archivos ocultos (los que empiezan con `.`) |
| --- | --- |
| `ls -l` | muestra en forma tabular, y nos da mas informacion, como fecha de edicion y permisos del archivo |
| `ls -R` | ls recursivo, va hasta el final, si usamos podemos ademas usar el flag `-L <Depth>` para definir la profundidad deseada. Por defecto lo hace recursivo hasta llegar al final |
| `ls <path>` | ls sobre la carpeta que indicamos en `<path>`, puede ser un path relativo o absoluto |