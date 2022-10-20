object BarCodeScanner {
    private const val barcodeScannerCoreVersion = "3.5.0"
    const val barcodeScannerCore = "com.google.zxing:core:$barcodeScannerCoreVersion"

    private const val barcodeScannerAndroidVersion = "4.3.0"
    const val bardCodeScannerAndroid =
        "com.journeyapps:zxing-android-embedded:$barcodeScannerAndroidVersion"

    private const val desugarJdkVersion = "2.0.0"
    const val desugarJdk = "com.android.tools:desugar_jdk_libs:$desugarJdkVersion"
}