# AventurasdeMarcosyLuis

Instrucciones para ejecutar el programa:

Hacer run coverage a CharacterTest y luego a GameControllerTest, cuando termine cada uno, haga click a "add to active suites" cuando salga en pantalla, para así mostrar la totalidad del coverage, en este caso 99%.

Notemos que tanto el HP como FP pueden llegar a 0, por ende no tiene sentido tener valores negativos, es por esto que en el setter del HP y FP se indicó que en caso de que al restar HP o FP y este queda negativo, que se iguale a 0 para evitar ambigüedades. También ocurre lo mismo con el máximo de HP y FP, si se sobrepasa el máximo, para ambos casos, se setea a el maximo HP y FP iniciales.

Respecto al funcionamiento de los ataques se utilizó Double Dispatch, ya que los jugadores principales no pueden atacarse entre sí y no pueden atacar a todos los enemigos disponibles. 

Además, cada jugador principal puede atacar ya sea con el ataque martillo o salto, para eso se generaron métodos que al ser escogidos automáticamente se reste la cantidad debida de HP al enemigo.

También se crearon los setters y getter de los niveles de los personajes para poder subir de nivel y así progresar en la batalla, también los get y set de DEF, ATK para implementar bien el daño recibido por un enemigo o jugador.

Por otro lado, se creó el set y get de win que sirve para saber cuantas veces ha ganado un personaje y el set para aumentar la cantidad cuando se gane una pelea.

Los enemigos también pueden atacar a los jugadores, estos solo atacan sin tener algún ataque en especial.

Por otro lado, los jugadores también pueden ocupar items que le dan diferentes beneficios. Para lo anterior se crearon dos clases, una para cada item. Luego, para hacer funcionar los items se implementaron en las clases de Marcos y Luis y a cada método con el override se le indicó que debía hacer en cada caso dependiendo del item. Para usar los item se creó un método use ubicado en una interface llamada Item, que al ocuparlo llama a cada item para ser usado. 
Para lo anterior también se creó un Inventario para almacenar los objetos que pueden tener los jugadores y que estos comparten entre sí. Consigo se debió crear métodos que pudieran eliminar, agregar y contar la cantidad de items que hay de cada tipo. Este inventario es compartido por los personajes.

También se agregó un método en una de las interfaces llamado isDefeated() que nos dice cuando un personaje está muerto o no. Y, se crearon métodos cantEnemyAttack y canAttack. En caso del primero, retorna un booleano true si puede atacar y false en caso de que no puede(HP en 0). En el segundo caso retorna un booleano false si no puede atacar (si está muerto o no le quedan FP) y true si está vivo y aún le quedan FP. 

Además, en la clase abstracta AbstractPrincipalCharacter se creó los métodos winBattle() que retorna true cuando Marcos o Luis tienen 5 win. También se creó el método levelUp() que aumenta los stats cuando un personaje gana una pelea.

Además, todos los setters y getters provienen de las interfaces, para las clases se usan con override.

Se creó la clase GameController (el controlador) en donde se hizo su constructor. Además, se añadieron en esa clase los métodos createPlayers, crea a los personajes y los pone en una lista, createEnemy, que crea a los enemigos y los pone en la lista que ya continene a los jugadores principales,
createChest que crea el inventario compartido por los jugadores principales, getPlayer para obtener al jugador de la lista, getListOfPlayers para obtener la lista de todos los jugadores, createEnemies que genera una cantidad indicada de enemigos random, playerUseItemOfChest que permite a un jugador usar items,
getItemsOfChest para obtener los items del inventario, removeKOCharacter cuando un personaje muere se quita de la lista, turnCharacter que cambia el turno y consigo el personaje, moveToNextCharacter, getTurn, setTurn, thePrincipalCharacterWon y finishTurn.

@Author, @since y @version están en la interface Character.