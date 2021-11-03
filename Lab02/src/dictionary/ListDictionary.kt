package dictionary

import java.io.File

object ListDictionary : IDictionary {
    val words = mutableListOf<String>()

    init {
        //kell meg ellenorizni a file-t
        File(IDictionary.fileName).readLines().forEach{(add(it))}
    }
    override fun add(word: String): Boolean {
        if (find(word) == false) {
            return words.add(word)
        }
        else {
            return false
        }

    }

    override fun find(word: String): Boolean {
        return words.contains(word)
    }

    override fun size(): Int {
        return words.size
    }
}