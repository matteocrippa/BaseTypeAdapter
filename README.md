# BaseTypeAdapter

Kotlin extension for Base adapter for typed object and notification for auto refresh

# Usage

`BaseTypeAdapter` provide you a new variable called `data`, each time you modify its content it forces the list to auto-reload.

Example:

```
inner class ListAdapter(context: Context) : BaseTypeAdapter<Int>() {}
```
