package Functions

import Class.Libro
import Class.NumberIdStock
import javax.swing.JOptionPane

// Listados de funciones



fun buscarLibro(){
    /*println(" ¿Por qué método desea realizar la búsqueda? Diga una opción.")
    println("1. Buscar por Título")
    println("2. Buscar por autores")
    println("3. Buscar por género")*/

    var findBook = JOptionPane.showInputDialog("¿Por qué método desea realizar la búsqueda? " +
            "Diga una opción.\n " +
            "1. Buscar por Título\n" +
            "2. Buscar por autores\n" +
            "3. Buscar por género\n")
    when (findBook) {
        "1" -> {
            buscarLibroTitulo()
        }
        "2" -> {
            buscarLibroAutor()
        }
        "3" -> {
            buscarLibroGenero()
        }
        else -> {
            print("Por favor, seleccione un método de búsqueda correcto")
            buscarLibro()
        }
    }
}

fun buscarLibroTitulo(){
    // A redactar en función de las BD de Libros
    println("Introduce el Título deseado")
    var busquedaTitulo = JOptionPane.showInputDialog("Introduce el Título deseado")
    //Mensaje de prueba
    println("Búscando el Título $busquedaTitulo")
    // Aún por desarrollar

    if(busquedaTitulo == "Test. Hacer un map.Lib.titulo"){
        JOptionPane.showInputDialog(null, "El libro está disponible")
        var buy = JOptionPane.showInputDialog("¿Que desea realizar con el libro? " +
                "Seleccione una opción.\n " +
                "1. Buscar por Título\n" +
                "2. Buscar por autores\n" +
                "3. Buscar por género\n")
        comprarLibro(buy)
    }




}


fun buscarLibroAutor(){
    // A redactar en función de las BD de Libros
    //println("Introduce el Nombre del autor:")
    var busquedaAutor: String = JOptionPane.showInputDialog("Introduce el Nombre del autor:")

    //Mensaje de prueba
    println("Búscando el Título $busquedaAutor")

    if(busquedaAutor == "Test"){
        //print("El libro está disponible")
        JOptionPane.showInputDialog(null, "El libro está disponible")
        var buy = JOptionPane.showInputDialog("¿Que desea realizar con el libro? " +
                "Seleccione una opción.\n " +
                "1. Buscar por Título\n" +
                "2. Buscar por autores\n" +
                "3. Buscar por género\n")
        comprarLibro(buy)
    }else{
        JOptionPane.showInputDialog(null,"No ha encontrado el Título deseado")
        buscarLibro()
    }

// Aún por desarrollar
}

fun buscarLibroGenero(){
    //println("Introduce el género deseado:")
    var busquedaGenero: String = JOptionPane.showInputDialog("Introduce el género deseado:")
    //Mensaje de prueba
    println("Búscando el Título $busquedaGenero")

}