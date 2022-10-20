package ir.tafreshiali.ayan_scanner

import android.os.Bundle
import androidx.viewbinding.ViewBinding
import ir.ayantech.whygoogle.activity.WhyGoogleActivity

/**
 * Implementation of [ScannerLifecycleObserver]
 * Extend From [ScannerActivity] To Have Scan Functionality In Your Application.
 * */
abstract class ScannerActivity<T : ViewBinding> : WhyGoogleActivity<T>() {

    lateinit var scannerObserver: ScannerLifecycleObserver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        scannerObserver = ScannerLifecycleObserver(activityResultRegistry)
        lifecycle.addObserver(scannerObserver)
    }

}