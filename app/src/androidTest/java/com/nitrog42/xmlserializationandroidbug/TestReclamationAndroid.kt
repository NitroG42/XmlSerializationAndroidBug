package com.nitrog42.xmlserializationandroidbug

import androidx.test.ext.junit.runners.AndroidJUnit4
import kotlinx.serialization.modules.EmptyModule
import nl.adaptivity.xmlutil.serialization.XML
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class TestReclamationAndroid {
    @Test
    fun testParse() {
        val xml = """<reclamation code="1"><![CDATA[30/06/2012 - M75 - Normal - NON LIVRE]]></reclamation>"""

        val format = XML(EmptyModule) {
            autoPolymorphic = false
        }

        val test = format.parse(Reclamation.serializer(), xml)
        println("test $test")
    }
}
