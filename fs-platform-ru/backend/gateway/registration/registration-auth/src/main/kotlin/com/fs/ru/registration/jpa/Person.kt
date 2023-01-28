package com.fs.ru.registration.jpa

import jakarta.persistence.*
import org.hibernate.Hibernate


@Entity
@Table(name = "person")
data class Person(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @Column(nullable = false)
    val name: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Person

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name )"
    }
}
