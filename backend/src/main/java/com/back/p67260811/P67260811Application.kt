package com.back.p67260811

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
open class P67260811Application

fun main(args: Array<String>) {
    runApplication<P67260811Application>(*args)
}

// public class P67260811Application {
//
//     public static void main(String[] args) {
//         SpringApplication.run(P67260811Application.class, args);
//     }
//
// }
