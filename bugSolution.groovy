```groovy
def myMethod(List<String> list) {
  if (list == null || list.isEmpty()) {
    println "The list is empty or null"
    return
  }
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
  }
}

myMethod(null)
myMethod([])
myMethod(['a', 'b', 'c'])
```