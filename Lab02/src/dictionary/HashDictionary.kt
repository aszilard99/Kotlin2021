package dictionary

import java.io.File

object HashDictionary : IDictionary {
    val words = HashSet<String>()
    init {
        //kell meg ellenorizni a file-t
        File(IDictionary.fileName).readLines().forEach{(ListDictionary.add(it))}
    }

    override fun add(word: String): Boolean {
        if (find(word) == false){
            return words.add(word)
        }
        else{
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