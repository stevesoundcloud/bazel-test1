# "The WORKSPACE file can be used to reference external dependencies required to
# build the outputs. One workspace can be shared among multiple projects if desired."

maven_jar(
    name = "com_google_guava_guava",
    artifact = "com.google.guava:guava:18.0",
    server = "maven_uk_server",
)

maven_jar(
    name = "org_typelevel_cats_kernel",
    artifact = "org.typelevel:cats-kernel_2.12:0.9.0",
    server = "maven_uk_server",
)

maven_jar(
    name = "org_typelevel_algebra",
    artifact = "org.typelevel:algebra_2.12:0.7.0",
    server = "maven_uk_server",
)

maven_jar(
    name = "com_twitter_algebird_core",
    artifact = "com.twitter:algebird-core_2.12:0.13.3",
    server = "maven_uk_server",
)

maven_server(
    name = "maven_uk_server",
    url = "http://uk.maven.org/maven2",
)


# version is master/latest as of 13 Oct 2017
rules_scala_version="031e73c02e0d8bfcd06c6e4086cdfc7f3a3061a8"

http_archive(
    name = "io_bazel_rules_scala",
    url = "https://github.com/bazelbuild/rules_scala/archive/%s.zip"%rules_scala_version,
    type = "zip",
    strip_prefix= "rules_scala-%s" % rules_scala_version
)

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")
scala_repositories()