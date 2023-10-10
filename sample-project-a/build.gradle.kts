import org.jetbrains.compose.desktop.application.dsl.TargetFormat

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Msi)
            packageName = "sample-project-a"
            packageVersion = "1.0.0"
        }
    }
}
