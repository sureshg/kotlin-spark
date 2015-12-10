@file:JvmName("SparkApp")
package io.sureshg.http

import spark.Spark.*

/**
 * Spark app
 *
 * @author Suresh G
 */
fun main(args: Array<String>) {

    externalStaticFileLocation(System.getProperty("user.home"))
    get("/hello", { req, res ->
        "Hello from Kotlin :-)"
    })
}