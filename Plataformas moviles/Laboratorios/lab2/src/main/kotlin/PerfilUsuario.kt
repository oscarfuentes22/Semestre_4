class PerfilUsuario(var ID: Int, var nombre: String, var apellido: String, var UrlPhoto: String, var Edad: Int, var Correo: String, var Biografia: String, val Estado: List<String>, var Hobbies: List<Hobby>) {

    val Estado = listOf("Activo", "Pendiente", "Inactivo")
    var Hobbies = mutableListOf<Hobby>()
    fun AgregarHobby(Hobby: Hobby) {
        Titulo = "Movie"
        Hobby = (Titulo, Descripcion, UrlPhoto)
        Hobbies.add(Hobby)
    }
}
