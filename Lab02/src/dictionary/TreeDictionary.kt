package dictionary

import java.io.File
import java.util.*

object TreeDictionary : IDictionary{
    val words = TreeSet<String>()
    init{
        File(IDictionary.fileName).readLines().forEach{(TreeDictionary.add(it))}
    }

    override fun add(word: String): Boolean {
        if (find(word) == false){
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