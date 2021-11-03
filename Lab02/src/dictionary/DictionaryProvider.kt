package dictionary

class DictionaryProvider {

    companion object{
        fun createDictionary(type: DictionaryType) : IDictionary{
            return when(type) {
                DictionaryType.ARRAY_LIST -> ListDictionary
                DictionaryType.TREE_SET -> ListDictionary
                DictionaryType.HASH_SET -> ListDictionary
                //else ->
            }
        }
    }
}