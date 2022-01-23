import titovtima.musicTheory.Chord
import titovtima.musicTheory.ChordsText
import titovtima.musicTheory.Key

@JsName("chordFromName")
fun chordFromName_JS(name: String) = Chord.chordFromName(name)

@JsName("keyFromName")
fun keyFromName_JS(name: String) = Key.keyFromName(name)

@JsName("chordFromString")
fun chordFromString_JS(name: String) = Chord.chordFromString(name)

@JsName("keyFromString")
fun keyFromString_JS(name: String) = Key.keyFromString(name)

@JsName("transposeChord")
fun transposeChord_JS(chord: Chord, originKey: Key, targetKey: Key) =
    chord.transpose(originKey, targetKey)

@JsName("transposeChordsText")
fun transposeChordsText_JS(text: String, originKey: Key, targetKey: Key) =
    ChordsText(text).transpose(originKey, targetKey).text
