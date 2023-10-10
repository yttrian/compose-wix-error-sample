# compose-wix-error-sample

This project demonstrates [this reported issue](https://github.com/JetBrains/compose-multiplatform/issues/3792).

1. Run `:sample-project-a:run` and `:sample-project-b:run`
   - A `Window` should open saying "sample-project-a" and "sample-project-b" respectively
2. Try to run `:sample-project-a:packageMsi` and `:sample-project-b:packageMsi`
   - Make sure `WIX_PATH` environment variable is **NOT** set.
   - This will fail with `Duplicate destination file 'C:\Users\NAME\.gradle\compose-jb\wix311.zip\wix311-binaries.zip'`
