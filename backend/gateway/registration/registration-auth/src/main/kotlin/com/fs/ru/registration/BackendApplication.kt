package com.fs.ru.registration

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
//@EnableTransactionManagement
class BackendApplication

fun main(args: Array<String>) {
	runApplication<BackendApplication>(*args)
}
