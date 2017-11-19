# BaseTypeAdapter

Kotlin extension for Base adapter for typed object and notification for auto refresh

# Install

Add to **gradle** in _allprojects_ > 

```
maven { url 'https://jitpack.io' }
```

then add this

```
	        compile 'com.github.matteocrippa:BaseTypeAdapter:0.0.1'
```

# Usage
`BaseTypeAdapter` provide you a new variable called `data`, each time you modify its content it forces the list to auto-reload.

Example:

```
inner class ListAdapter(context: Context) : BaseTypeAdapter<Int>() {}
```
