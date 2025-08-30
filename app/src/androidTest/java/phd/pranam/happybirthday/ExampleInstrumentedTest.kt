/*
 * Copyright (c) 2025. Pranam.
 * ORCID: https://orcid.org/0009-0007-9316-3616
 *
 * This code is licensed under the MIT License.
 *
 * You may obtain a copy of the License at https://opensource.org/licenses/MIT
 *
 * Attribution:
 * If you use this code, please provide appropriate credit to the original author.
 * For example: "This code is based on work by Pranam whose ORCID is https://orcid.org/0009-0007-9316-3616."
 */

package phd.pranam.happybirthday

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("phd.pranam.happybirthday", appContext.packageName)
    }
}