
plugins {
	java
	kotlin("jvm") version "2.0.21"
	id("com.google.devtools.ksp") version "2.0.21-1.0.26"
}

val jimmerVersion = "0.9.5"

repositories {
	repositories {
		maven { setUrl("https://mirrors.huaweicloud.com/repository/maven/") }
		maven { setUrl("https://mirrors.tencent.com/nexus/repository/maven-public/") }
		maven { setUrl("https://maven.aliyun.com/nexus/content/groups/public/") }
	}
}

dependencies {
	implementation(kotlin("stdlib"))

	implementation("org.babyfish.jimmer:jimmer-core-kotlin:${jimmerVersion}")
	ksp("org.babyfish.jimmer:jimmer-ksp:${jimmerVersion}")
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(21))
	}
}

// Without this configuration, gradle command can still run.
// However, Intellij cannot find the generated source.
kotlin {
	sourceSets.main {
		kotlin.srcDir("build/generated/ksp/main/kotlin")
	}
}