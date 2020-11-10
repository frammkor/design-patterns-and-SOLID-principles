#Interface Segregation Principle

- Clients should not be forced to depend upon interfaces that they do not use

## Interface Pollution

Avoid creating Large Interfaces, having unrelated Methods.

Signs of interface Pollution

Classes have empty method implementations
Method implementation throw UnsupportedOperationException (or similar)
Method implementations return "null" or default/dummy values

Example:
In this case we will create a new persistence service for the order entity, but the PersistenceService interface has a method "findByName" that would not make sense to have on the OrderService. Having this violates the Interface Segregation Principle. Commonly is wrongly solve by overriding that method to throw an exception.

Solutions:
1- Brake interfaces
2- Removing methods that are only used by one class from the main interface and adding it only to that class

"findByName" method will be removed from the "PersistenceService" and only added on the UserPersistenceService.