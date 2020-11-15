
## When to use it?

They can be use when:
- You have a complex process to construct an object involving multiple steps.
- In builder we remove the logic related to object construction from 'client' code & abstract it in separate classes.

## What problem builder design pattern solves?

### 1 - A Class constructor that requires a lot of information

`
// Product instances are immutable
class Product {

    public Product(int weight, double price, int, shipVolume, int shipCode) {

        // initialize

    }
}
`

When writing immutable classes we often end up with classes that receives multiple parameters because are needed in the constructor or the object. Having a method or a constructor that needs multiple parameters is considered a bad practice.
Why? Because anyone using that code need to know what those parameters means and in witch other should be passed. Things get even worse when the parameters share data types.

This patter helps in two ways:
1- Makes easy to use the constructors
2- Avoid writing such constructors and have them immutable.

### 2 - Objects that need other objects or 'parts' to construct them

`
class Address {
    public Address (String houseNumber, String, street, ...) {
        // initialize
    }
}

class User {
    public User (String name, Address address, LocateDate birthdate, List<Role> roles) {
        // initialize
    }

    // other code
}

## Implement a Builder

Refer to 'builder-01.png'
1. We start by creating a builder
    1. Identify the 'parts' of the product and provide methods ot create those parts
    2. It should provide a method to "assemble" or build the product/object (BUILDER)
    3. It must provide a way/method to get fully built object out. Optionally builder can keep reference to a product it has built so the same can be returned again in the future (CONCRETE BUILDER)
2. A director can be separate class or client can play the rol of director. Rarely implemented as a separate class.

### Considerations

#### Implementation Considerations
An immutable class can be easily created by implementing builder as an inner static class (see builder 2 on the example). This type of implementation is used frequently even if immutability is not a main concern.

#### Design Considerations
- The director role is rarely implemented as separate class, typically the consumer of the object instance or the client handles that role.
- "Abstract builder" is also not required if "product" itself is not part of any inheritance hierarchy. You can directly create a  "concrete builder".