class PerfilUsuario(var ID: Int, var nombre: String, var apellido: String, var UrlPhoto: String, var Edad: Int, var Correo: String, var Biografia: String, val Estado: List<String>, var Hobbies: MutableList<Hobby>) {

    fun AgregarHobby(Hobby: Hobby) {

        Hobbies.add(Hobby)
    }
}
