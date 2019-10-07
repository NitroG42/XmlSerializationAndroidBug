package com.nitrog42.xmlserializationandroidbug

import kotlinx.serialization.Serializable
import nl.adaptivity.xmlutil.serialization.XmlSerialName
import nl.adaptivity.xmlutil.serialization.XmlValue

@Serializable
@XmlSerialName(value = "reclamation", namespace = "", prefix = "")
data class Reclamation(@XmlValue(true) val content: String, val code: String)