# "The WORKSPACE file can be used to reference external dependencies required to
# build the outputs. One workspace can be shared among multiple projects if desired."

maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:18.0",
    server = "maven_uk_server",
)

maven_server(
    name = "maven_uk_server",
    url = "http://uk.maven.org/maven2",
)