package com.lasalle.simple_navigation.utils

import com.lasalle.simple_navigation.R
import com.lasalle.simple_navigation.models.BlogPost

// IA generated: Objeto simple que contiene una lista de posts de prueba
object BlogData {
    val posts = listOf(
        BlogPost(
            id = 1,
            title = "Mis primeros amores",
            summary = "La llegada de los primeros animales a los que amé. ",
            content = "Antes de que comenzara la pandemia visité a mi mejor amiga de ese entonces.\n" +
                    "Saliendo de la escuela teniamos que terminar un trabajo, ella siempre ha estado rodeada de animalitos,\n" +
                    " algunos buscaban hogar, para mi suerte coincidí con dos lindas gatitas.\n" +
                    "La idea era solo llevarme una, pero por qué no llevarme a las dos para que se hagan compañia?\n"+
                    "Sus nombres fueron Ronnie y Millie, apartir de ella comenzó a crecer la familia, y fuí adoptando algunos bebes de sus camadas.\n",
            imageRes = R.drawable.yo_cocinando
        ),
        BlogPost(
            id = 2,
            title = "Autosabotaje",
            summary = "¿Cuál es la necesidad de sobrepensar y sentirse insuficiente?",
            content = "Ultimamente he vivido por tiempo extendido durante el día, el autosabotaje.\n" +
                    "Comencé con el pie izquierdo en primer semestre por presión de conseguir dinero y estudiar, dormía poco y mi alimentación no era buena.\n" +
                    "Fueron muchos aspectos que me afectaron, pero sobretodo en el aprendizaje y buena relación con mis compañeros,yo fui de las pocas personas que se atrasó con los aprendizajes\n" +
                    "Me habría encantado estar más presente de lo que vivia que solo vivir de la preocupación, hasta la fecha sigo lidiando en saber como la mente tiene tanto poder que puede \n"+
                    "afectar tu vida, los pensamientos tienen poder, pensamientos que solamente se enfocan en que no puedo disfrutar del proceso apesar de estar unos pasos atrás que mis compañeros.\n"+
                    "A menudo me siento bloqueada y si estoy bloqueada tiendo a distraerme facilmente o buscando cualquier salida que me impide enfocarme en mis responsabilidades, con suerte \n" +
                    "he conseguido ayuda de mis profesores, pero en ocasiones me limito pensado que por falta de algo no puedo sobresalir cuando solamente no me permito aprender y practicar \n",
                    imageRes = R.drawable.autosabotaje__
        ),
        BlogPost(
            id = 3,
            title = "Tips para cocinar",
            summary = "En compañia de tu persona de confianza puede resultar mejor de lo que crees.",
            content = "Si eres principiante y no frecuentas cocinar, te daré algunos tips que pueden ser de ayuda\n" +
                    " ->Tener una herman@ pequeñ@ que esté disponible a pasarte especies o cualquier cosa que peuda tomar y traerte \n" +
                    " ->Estar en compañia de tu persona de confianza, no importa si están a distancia\n" +
                    " ->Si seguiste un tutorial ver hasta el final y repasar los pasos antes de solo pensar que te saldrá bien(una vez intenté hacer gorditas de nata y salieron extrañass\n"+
                    " ->No contestes llamadas, si tocan el timbre no abras, si te anda del baño ve antes de iniciar, ponte 3 kilos de gel para que no caiga nada de cabello\n"+
                    " ->Procura estar de buen humor o tu comida sabrá feo, mi mam siempre dice que mientras le pongas 3 kilos de amor a tu comida, siempre quedará con buen sabor \n" +
                    " ->Contempla que te tomará 3 horas hacer una comida, por preparación, cocción, lavar trastes, comer, etc. \n" +
                    " ->NO COCINES A LAS 8p.m o terminarás a las 11p.m\n"+
            "P.D. Todo esto es basado en hechos reales",
            imageRes = R.drawable.mis_bebes
        )
    )
}
