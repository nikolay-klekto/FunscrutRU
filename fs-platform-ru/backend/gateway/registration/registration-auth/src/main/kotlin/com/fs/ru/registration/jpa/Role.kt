package com.fs.ru.registration.jpa

import jakarta.persistence.*
import org.hibernate.Hibernate

@Entity
@Table(name = "roles")
data class Role(

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long,

    @Column(name = "name")
    val name: String

) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as Role

        return id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    @Override
    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name )"
    }
}