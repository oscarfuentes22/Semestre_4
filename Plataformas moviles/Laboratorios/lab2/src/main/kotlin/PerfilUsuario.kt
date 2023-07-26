class PerfilUsuario(var ID: Int, var nombre: String, var apellido: String, var UrlPhoto: String?, var Edad: Int, var Correo: String, var Biografia: String?, val Estado: List<String>, var Hobbies: MutableList<Hobby> = mutableListOf()) {

    fun AgregarHobby(Hobby: Hobby) {

        Hobbies.add(Hobby)
    }
    override fun toString(): String {
        return "ID - ${ID}\n" + "Nombres - ${nombre}\n" + "Apellidos -${apellido}\n" + "UrlPhoto - ${UrlPhoto}\n" + "Edad - ${Edad}\n" + "Correo - ${Correo}\n" + "Biografia - ${Biografia}\n" + "Estado - ${Estado}\n" + "Hobbies - ${Hobbies}\n"
    }
}
