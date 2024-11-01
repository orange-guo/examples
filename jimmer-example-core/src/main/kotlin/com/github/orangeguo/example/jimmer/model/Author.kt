package com.github.orangeguo.example.jimmer.model

import java.time.LocalDateTime
import org.babyfish.jimmer.Immutable

@Immutable
interface Author {

	val name: String

	val lastModifiedTime: LocalDateTime

	val books: List<Book>
}