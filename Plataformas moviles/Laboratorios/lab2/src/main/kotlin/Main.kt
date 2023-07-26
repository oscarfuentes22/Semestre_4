fun main(args: Array<String>) {

    val usuario : MutableList<PerfilUsuario> = mutableListOf(
        PerfilUsuario(1, "Juan", "Perez", null, 20, "oscargmail.com", "Hola", listOf("Activo"))
    )
    while (true) {
        println("Bienvenido al programa de perfil de usuario seleccione una opcion \n 1. Crear perfil \n 2. Ver perfil \n 3. eliminar perfil \n 4. Agregar Hobby \n 5. Salir")
        var numero = readln()
        when (numero) {
            "1" -> {
                println("Ingrese su ID")
                var ID = readln().toInt()
                println("Ingrese su nombre")
                var nombre = readln()
                println("Ingrese su apellido")
                var apellido = readln()
                println("Ingrese su UrlPhoto")
                var UrlPhoto = readln()
                println("Ingrese su edad")
                var edad = readln().toInt()
                println("Ingrese su correo")
                var correo = readln()
                println("Ingrese su biografia")
                var biografia = readln()
                lateinit var estado: String
                println("Ingrese el numero de su estado \n 1. Activo \n 2. Inactivo \n 3. Pendiente")
                when (readln()) {
                    "1" -> estado = "Activo"
                    "2" -> estado = "Inactivo"
                    "3" -> estado = "Pendiente"
                }

                usuario.add(
                    PerfilUsuario(
                        ID,
                        nombre,
                        apellido,
                        UrlPhoto,
                        edad,
                        correo,
                        biografia,
                        listOf(estado),
                        mutableListOf()
                    )
                )
                println("Perfil creado con exito")

            }

            "2" -> {
                println("Ingrese su ID")
                var ID = readln().toInt()
                val listaUsuario: MutableList<PerfilUsuario> = mutableListOf()
                for (i in usuario) {
                    if (ID.toInt() == i.ID) {
                        listaUsuario.add(i)
                    }
                }
                for (i in usuario) {
                   println(" ${i.toString()}")

                }

            }

            "3" -> {
                println("Ingrese su ID")
                var ID = readln().toInt()
                val listaUsuario: MutableList<PerfilUsuario> = mutableListOf()
                for (i in usuario) {
                    listaUsuario.remove(i)
                }
            }

            "4" -> {
                println("Ingrese su ID")
                var ID = readln().toInt()
                var result: PerfilUsuario? = null
                for (item in usuario) {
                    if (ID.toInt() == item.ID) {
                        result = item
                    }
                }
                while (true) {
                    println("Ingrese el número  \n 1. agregar \n 2. salir")
                    try {
                        when (readln()) {
                            "1" -> {
                                println("nombre hobby")
                                val nombre: String = readln()
                                println("descripcion hobby")
                                val descripcion: String = readln()
                                println("url el Hobby")
                                val UrlPhoto: String? = readlnOrNull()
                                result?.AgregarHobby(Hobby(nombre, descripcion, UrlPhoto))
                            }

                            "2" -> {
                                break
                            }

                            else -> {
                                println("esa no es una opción válida")
                            }
                        }
                    } catch (e: Exception) {
                        println("esa no es una opción válida")
                    }
                }

            }
            "5" ->{
                println("Gracias por utilizar el programa :D")
                break
            }

            else -> println("no es un numero valido")

        }

    }
}