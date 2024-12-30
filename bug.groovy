```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
  }
}

myMethod(null)
```