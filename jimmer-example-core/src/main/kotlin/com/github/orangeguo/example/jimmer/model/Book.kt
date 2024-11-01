package com.github.orangeguo.example.jimmer.model

import java.time.LocalDateTime
import org.babyfish.jimmer.Immutable

@Immutable
interface Book {

	val name: String

	val store: BookStore?

	val price: Int

	val lastModifiedTime: LocalDateTime

	val authors: List<Author>
}