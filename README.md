# PRÁCTICA DE LABORATORIO 

**NOMBRE:** José Quinde

**CARRERA:** Computación

**ASIGNATURA:** Programación Aplicada

**NRO. PRÁCTICA:**	09	

**TÍTULO PRÁCTICA:** Base De Datos

## OBJETIVO ALCANZADO:
Como objetivo Principal de esta práctica es poder implementar en un CRUD en una base de Datos para poder guardar y recuperar los registros en un archivo permanente.

Implementar la relación de tablas a través de comparación de Datos.

Se ha utilizado la base de Datos postgreist.

## ACTIVIDADES DESARROLLADAS
**1.Crear un repositorio en GitHub**

**Perfil:** JoseQ1996

**URL del proyecto:** hhttps://github.com/JoseQ1996/Manejo_Base_De_Datos.git

-Se procedió a crear un repositorio con el nombre de Manejo Base de Datos
 
![image](https://user-images.githubusercontent.com/49071271/60448783-ef8b1480-9beb-11e9-897c-2f865d68b454.png)

**2. Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).**

-Se realizaron 12 commits en el proyecto

-Aquí se puede revisar los commits realizados y que hizo cada uno en específico.
 
![image](https://user-images.githubusercontent.com/49071271/60448788-f44fc880-9beb-11e9-9842-0860f19014a6.png)
![image](https://user-images.githubusercontent.com/49071271/60448799-f9ad1300-9beb-11e9-911a-ce5717ad828f.png)

**3. Crear clase en el paquete**

- Se proceido a crear 4 paquetes uno para los archivos, otro del controlador,la clase modelo y otro de la vista
 
 ![image](https://user-images.githubusercontent.com/49071271/60448813-fe71c700-9beb-11e9-8f21-7b20723244f8.png)

**4. Clase Persona**

La clase Persona tiene implementada excepciones, y los atributos que fueron declarados son los de los nombres, apellidos, cedula, edad, fecha de nacimiento, celular y Salario.

![image](https://user-images.githubusercontent.com/49071271/60448822-03cf1180-9bec-11e9-99d8-989251c65ea8.png)
 
La clase también posee los constructores que son los siguientes.

![image](https://user-images.githubusercontent.com/49071271/60448896-23663a00-9bec-11e9-9c31-7ac5820b3f97.png)

Primero se mostrará la excepción que se implementa al rato de Setear tanto los nombres como los apellidos,

Posee dos excepciones:

-No poder ingresar números.

-Se debe ingresar dos nombres.

![image](https://user-images.githubusercontent.com/49071271/60448909-295c1b00-9bec-11e9-9aea-395986306452.png)
 
Lo que hace primero es comparar si la cadena de texto posee un numero del 0 al 9, en caso de poseerlo saltar un error en el catch que debe ingresar solo letras y no números.

Si el String no posee ningún numero entrara al siguiente if en donde nos preguntara si el String posee un salto de texto, de poseerlo significara que posee dos nombres.

El mismo proceso se realiza para los Apellidos.

Ahora se mostrará la validación de la Cedula que manda a llamar a otra clase creada para validar que es la siguiente:

![image](https://user-images.githubusercontent.com/49071271/60448920-2f51fc00-9bec-11e9-9c03-93dbef6e1371.png)
 
Esta clase nos valida el ingreso de una cedula.

La cedula también tiene otra excepción aparte de la validación que es la de comprobar que se están ingresado 10 dígitos.

![image](https://user-images.githubusercontent.com/49071271/60448934-35e07380-9bec-11e9-9089-675478b10452.png)

A través de un if nos compara el tamaño del String si es de 10 se ingresa caso contrario nos manda una excepción que se debe ingresar 10 dígitos.

El número de teléfono también posee un control de que se ingresen 10 dígitos.

![image](https://user-images.githubusercontent.com/49071271/60449016-5f010400-9bec-11e9-9521-e2c57a1ab415.png)
 
Y así se muestra el toString de la clase Persona.
 
![image](https://user-images.githubusercontent.com/49071271/60449023-61fbf480-9bec-11e9-8470-87e782045d5a.png)

**5. Controlador Persona**

Primero se mostrará la conexión que se realiza en la base de Datos.

![image](https://user-images.githubusercontent.com/49071271/60449074-7b9d3c00-9bec-11e9-9d79-cb1c6f14ee24.png)
 
El controlador de Persona es muy diferente al hecho anteriormente ya que este controlar nos ingresa, actualiza, elimina, busca y lista una persona de una Base de Datos

![image](https://user-images.githubusercontent.com/49071271/60449084-80fa8680-9bec-11e9-9e26-c5c3c5601336.png)

Para poder ingresar una persona se pide un parámetro de la Persona, para que luego poder ingresar en la base de datos, primero se debe conectar la base de datos y a través de un execute ingresar el SQL que se debe ingresar con el orden de las columnas en la base de datos.

![image](https://user-images.githubusercontent.com/49071271/60449089-85bf3a80-9bec-11e9-99d9-1645fd0da159.png)

Para poder leer una persona se pide que ingrese la cedula de la persona para poder realizar la sentencia SQL y que devuelva la persona a través de un executeQuery.
 
![image](https://user-images.githubusercontent.com/49071271/60449097-89eb5800-9bec-11e9-95d3-6781cc92f94e.png)

Para el actualizar es la mezcla del Ingresar y el buscar ya que nos la cedula para poder visualizar la persona y también para actualizar, esto se lo realiza a través de una sentencia SQL con el UPDATE que actualiza la persona.

![image](https://user-images.githubusercontent.com/49071271/60449105-8e177580-9bec-11e9-8c28-9a842e5033a4.png)

Para el eliminar te pide la cedula de la persona y en una sentencia SQL que utiliza el DELETE para eliminar la persona con la cedula ingresada.

![image](https://user-images.githubusercontent.com/49071271/60449121-9374c000-9bec-11e9-9c84-9d2479ebe85c.png)

Finalmente, para listar lo que se hace es una sentencia SQL de SELECT completo y que el ResulSet que te devuelve con el executeQuery este en un bucle y así vaya agregando personas en una lista.

![image](https://user-images.githubusercontent.com/49071271/60449131-98397400-9bec-11e9-898e-1d834fbf4570.png)

***NOTA:** La cedula de la persona es única por lo que no se puede repetir una cedula.*

**7. Dirección**

Se procedió a crear una tabla en la base de Datos de dirección que se enlace con la tabla de persona a través de la cedula.

![image](https://user-images.githubusercontent.com/49071271/60449240-d3d43e00-9bec-11e9-883d-2c3337126c95.png)

La clase también posee los constructores que son los siguientes.

![image](https://user-images.githubusercontent.com/49071271/60449255-d898f200-9bec-11e9-9904-30b3a6d42a8d.png)
 
Y así se muestra el toString de la clase Dirección.

![image](https://user-images.githubusercontent.com/49071271/60449258-db93e280-9bec-11e9-9e4f-f66deedb3e96.png)

**8. Controlador Dirección**

La dirección también se controla con una base de datos y para poder ingresar también se utiliza una sentencia SQL como la persona y a través de un execute se ingresa en la base de datos, el eliminar y el listar también son similares.
 
![image](https://user-images.githubusercontent.com/49071271/60449302-f8301a80-9bec-11e9-8369-292e62442eea.png)
![image](https://user-images.githubusercontent.com/49071271/60449320-041bdc80-9bed-11e9-9c5f-02b534febc60.png)
![image](https://user-images.githubusercontent.com/49071271/60449327-067e3680-9bed-11e9-8fd8-f5bb620652c7.png) 
 
También se creó un método para Obtener el ultimo código del registro para poder obtener el código.

 ![image](https://user-images.githubusercontent.com/49071271/60449342-0a11bd80-9bed-11e9-8bf8-e3e497f8533b.png)

***NOTA:** La persona puede tener varias direcciones, la dirección no puede tener un código igual.*

**9. Interfaz Grafica**

El programa cuenta con una Ventana Principal en donde nos permite llamar a cada Ventana para poder realizar el CRUD del programa

![image](https://user-images.githubusercontent.com/49071271/60449364-0ed67180-9bed-11e9-9fff-c4393421f9c6.png)

A continuación, se mostrará lo que realiza cada parte del CRUD.

-Ingresar Persona 
![image](https://user-images.githubusercontent.com/49071271/60449400-29104f80-9bed-11e9-849f-788988934d7b.png)

Lo que hace el código principalmente es setear un Persona a través de los text field obteniendo el texto ingresado con el getText () , luego se verifica las excepciones de la persona con un try y catch y finalmente llama al controlador para poder ingresar la persona en el archivo, si cumple todas las excepciones el programa ingresara correctamente la persona a la base de Datos.

![image](https://user-images.githubusercontent.com/49071271/60449406-2dd50380-9bed-11e9-8739-fa1cbbf8cd8a.png)
![image](https://user-images.githubusercontent.com/49071271/60449416-33cae480-9bed-11e9-857f-ea5032bb0dcf.png)

Para ingresar la dirección se muestra otra ventana.

![image](https://user-images.githubusercontent.com/49071271/60449443-4513f100-9bed-11e9-9db6-f9e804193e1d.png)

Y lo que hace Añadir Direccion es ingresarlo en la base de datos.


![image](https://user-images.githubusercontent.com/49071271/60449447-46ddb480-9bed-11e9-9d72-493551db7a2d.png)

Luego de añadir la dirección manda a llenar el combo Box de la ventana ingresar Persona con las direcciones ingresadas.

La persona ingresara con diferente registro dependiendo cuantas personas estén ya en el archivo.

-Para el Buscar persona

![image](https://user-images.githubusercontent.com/49071271/60449458-4c3aff00-9bed-11e9-9b56-540b0d39d20f.png)

Lo que hace el código es primero pedir la cedula de la persona, luego manda a llamar al controlador de buscar que nos devuelve una persona, para luego setear a la persona en los TextField, si la persona no existe nos saltara un cuadro diciendo que la persona no existe.
 
![image](https://user-images.githubusercontent.com/49071271/60449467-51984980-9bed-11e9-8e9b-e41de8c87071.png)

-Actualizar Persona

![image](https://user-images.githubusercontent.com/49071271/60449472-53faa380-9bed-11e9-9a55-ff11ad660c2f.png)

Es una mezcla del buscar e ingresar persona, el botón de buscar hace exactamente lo mismo que el buscar Persona, solo que en este caso los text field están habilitados para modificar la información, y luego con el botón de actualizar y validar, nos ingresa una persona en el controlador a través de su cedula para luego poder actualizarla, también se puede agregar o eliminar direcciones.
 
![image](https://user-images.githubusercontent.com/49071271/60449518-74c2f900-9bed-11e9-9ea5-f285173d2c7a.png)
![image](https://user-images.githubusercontent.com/49071271/60449522-77255300-9bed-11e9-9ef8-ea0fb507f033.png)

-Eliminar Persona
 
 ![image](https://user-images.githubusercontent.com/49071271/60449526-7db3ca80-9bed-11e9-8249-7a34946e022c.png)
 
Para el eliminar persona lo único que se debe ingresar es la cedula de la persona a eliminar, luego se ingresa al controlador en donde elimina a la persona y a las direcciones que están ligadas a esa persona, si la persona ya fue eliminada anteriormente nos dará un mensaje que esa persona ya no existe.

![image](https://user-images.githubusercontent.com/49071271/60449529-80aebb00-9bed-11e9-889f-b4ac7b59bd50.png)

-Listar Persona

![image](https://user-images.githubusercontent.com/49071271/60449588-a045e380-9bed-11e9-937e-4a071a593ba6.png)

Lo único que hace el listar persona en llenar la tabla con las personas que se obtiene en el controlador de persona, agregando las filas solo a las personas que existen.
 
La interfaz seria así:

![image](https://user-images.githubusercontent.com/49071271/60449602-a50a9780-9bed-11e9-8aef-891c8b608f70.png)

Al hacer doble clic en una persona seleccionada nos devuelve una nueva tabla con las direcciones de esa persona.

A continuación, se mostrará el código de la tabla listar direcciones.

![image](https://user-images.githubusercontent.com/49071271/60449615-ab007880-9bed-11e9-99ce-09121a836ab5.png)
 
## RESULTADO(S) OBTENIDO(S):

Para el resultado obtenido se debe tener en cuenta que ya existe una persona con 3 direcciones.
 
![image](https://user-images.githubusercontent.com/49071271/60449657-c4a1c000-9bed-11e9-9d03-977c1ee8b50c.png)
![image](https://user-images.githubusercontent.com/49071271/60449664-c8cddd80-9bed-11e9-90d6-7f71c6f88aa2.png)

Ahora se procederá a crear una persona
 
![image](https://user-images.githubusercontent.com/49071271/60449675-cd929180-9bed-11e9-86af-1b09c71b8b97.png)
![image](https://user-images.githubusercontent.com/49071271/60449688-d2574580-9bed-11e9-8e10-c6b4a8336e4d.png)

Se ingresó una dirección para esa persona.

![image](https://user-images.githubusercontent.com/49071271/60449697-d7b49000-9bed-11e9-9a5b-c4d20327e3a8.png)

Nos ha mostrado el mensaje de persona creada, por lo que todos los datos fueron validos
 
Ahora procederemos a buscar esa persona creada recientemente.

![image](https://user-images.githubusercontent.com/49071271/60449709-dbe0ad80-9bed-11e9-83ec-8de37cc6a67f.png)

Ahora listaremos las personas y se mostrara las direcciones de cada una
 
![image](https://user-images.githubusercontent.com/49071271/60449771-fd419980-9bed-11e9-9afc-ff2e7b2c4d04.png)
![image](https://user-images.githubusercontent.com/49071271/60449774-029ee400-9bee-11e9-9a6a-293c6c5249cf.png)

De la persona creada recientemente

![image](https://user-images.githubusercontent.com/49071271/60449781-05013e00-9bee-11e9-8df0-0f897a49362b.png)

De la persona que ya existía en la base de datos.

Efectivamente se eliminó, así se podría demostrar el funcionamiento del programa.

## CONCLUSIONES:
Utilizar una base de datos para un CRUD es mucho más factible ya que así nos permite guardar datos permanentemente sin importar si el programa se cierra.

El uso del controlador, de la interfaz y la clase también nos fue muy útil ya que así se pudo desarrollar una pequeña base de datos para el control de personas.

## RECOMENDACIONES:

Implementar la base de datos postgreist y todo lo aprendido sobre guardar registros.
.

**Nombre de estudiante:** José Quinde


**Firma de estudiante:** 

![image](https://user-images.githubusercontent.com/49071271/60449788-0894c500-9bee-11e9-9880-fe2897e8dbf5.png)


