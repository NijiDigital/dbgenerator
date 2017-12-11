# Swift3 variant Template Information

| Name      | Description       |
| --------- | ----------------- |
| Folder name | templates/swift3-variant |
| Invocation example | `gyro -m <model> -t swift3-variant …` |
| Language | Swift 3 |

# When to use it

When you need to work with `ObjectMapper` and `Realm` together

# Caracteristics

In this template optional Realm objects (Attributes - RealmOptional - or Relationships - List<> -) are var properties :

```
// Attribute generation
{%- if attribute.is_number == true or attribute.is_bool == true %}
  var {{ attribute.name }} = RealmOptional<{{ convert_type }}>()
{%- else %}
  dynamic var {{ attribute.name }}: {{ convert_type }}?
{%- endif -%}

// Relationship generation
{%- if relationship.inverse == false %}
  {%- if relationship.type == "to_many" %}
  var {{ relationship.name }} = List<{{ relationship.inverse_type }}>()
  {%- else %}
  dynamic var {{ relationship.name }}: {{ relationship.inverse_type }}?
  {%- endif %}
{%- endif %}
```

# Generated Code

`Product.swift`

```swift
/* DO NOT EDIT | Generated by gyro */

import RealmSwift
import Foundation

final class Product: Object {

  enum Attributes: String {
    case brand = "brand"
    case name = "name"
    case price = "price"
    case users = "users"
  }

  dynamic var brand: String?
  dynamic var name: String = ""
  var price = RealmOptional<Int32>()
  
  var users = List<Users>()
}

```